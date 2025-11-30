//! CLI tool driving the API client
use anyhow::{anyhow, Context, Result};
use clap::Parser;
use log::{debug, info};
// models may be unused if all inputs are primitive types
#[allow(unused_imports)]
use openapi_client::{
    models, ApiNoContext, Client, ContextWrapperExt,
    GetApiAllJsonResponse,
    GetApiProductJsonResponse,
    GetApiProductCycleJsonResponse,
};
use simple_logger::SimpleLogger;
use swagger::{AuthData, ContextBuilder, EmptyContext, Push, XSpanIdString};

type ClientContext = swagger::make_context_ty!(
    ContextBuilder,
    EmptyContext,
    Option<AuthData>,
    XSpanIdString
);

#[derive(Parser, Debug)]
#[clap(
    name = "endoflife.date",
    version = "0.0.1",
    about = "CLI access to endoflife.date"
)]
struct Cli {
    #[clap(subcommand)]
    operation: Operation,

    /// Address or hostname of the server hosting this API, including optional port
    #[clap(short = 'a', long, default_value = "http://localhost")]
    server_address: String,

    /// Path to the client private key if using client-side TLS authentication
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long, requires_all(&["client_certificate", "server_certificate"]))]
    client_key: Option<String>,

    /// Path to the client's public certificate associated with the private key
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long, requires_all(&["client_key", "server_certificate"]))]
    client_certificate: Option<String>,

    /// Path to CA certificate used to authenticate the server
    #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
    #[clap(long)]
    server_certificate: Option<String>,

    /// If set, write output to file instead of stdout
    #[clap(short, long)]
    output_file: Option<String>,

    #[command(flatten)]
    verbosity: clap_verbosity_flag::Verbosity,
}

#[derive(Parser, Debug)]
enum Operation {
    /// All Products
    GetApiAllJson {
    },
    /// Get All Details
    GetApiProductJson {
        /// Product URL as per the canonical URL on the endofife.date website.
        product: String,
    },
    /// Single cycle details
    GetApiProductCycleJson {
        /// Product URL as per the canonical URL on the endofife.date website.
        product: String,
        /// Release Cycle for which the details must be fetched. Any slash character in the cycle name will be replaced with dashes. For example FreeBSD's releng/14.0 becomes releng-14.0.
        cycle: String,
    },
}

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    if args.client_certificate.is_some() {
        debug!("Using mutual TLS");
        let client = Client::try_new_https_mutual(
            &args.server_address,
            args.server_certificate.clone().unwrap(),
            args.client_key.clone().unwrap(),
            args.client_certificate.clone().unwrap(),
        )
        .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else if args.server_certificate.is_some() {
        debug!("Using TLS with pinned server certificate");
        let client =
            Client::try_new_https_pinned(&args.server_address, args.server_certificate.clone().unwrap())
                .context("Failed to create HTTPS client")?;
        Ok(Box::new(client.with_context(context)))
    } else {
        debug!("Using client without certificates");
        let client =
            Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
        Ok(Box::new(client.with_context(context)))
    }
}

#[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
fn create_client(args: &Cli, context: ClientContext) -> Result<Box<dyn ApiNoContext<ClientContext>>> {
    let client =
        Client::try_new(&args.server_address).context("Failed to create HTTP(S) client")?;
    Ok(Box::new(client.with_context(context)))
}

#[tokio::main]
async fn main() -> Result<()> {
    let args = Cli::parse();
    if let Some(log_level) = args.verbosity.log_level() {
        SimpleLogger::new().with_level(log_level.to_level_filter()).init()?;
    }

    debug!("Arguments: {:?}", &args);

    let auth_data: Option<AuthData> = None;

    #[allow(trivial_casts)]
    let context = swagger::make_context!(
        ContextBuilder,
        EmptyContext,
        auth_data,
        XSpanIdString::default()
    );

    let client = create_client(&args, context)?;

    let result = match args.operation {
        Operation::GetApiAllJson {
        } => {
            info!("Performing a GetApiAllJson request");

            let result = client.get_api_all_json(
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetApiAllJsonResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetApiProductJson {
            product,
        } => {
            info!("Performing a GetApiProductJson request on {:?}", (
                &product
            ));

            let result = client.get_api_product_json(
                product,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetApiProductJsonResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
        Operation::GetApiProductCycleJson {
            product,
            cycle,
        } => {
            info!("Performing a GetApiProductCycleJson request on {:?}", (
                &product,
                &cycle
            ));

            let result = client.get_api_product_cycle_json(
                product,
                cycle,
            ).await?;
            debug!("Result: {:?}", result);

            match result {
                GetApiProductCycleJsonResponse::OK
                (body)
                => "OK\n".to_string()
                   +
                    &serde_json::to_string_pretty(&body)?,
            }
        }
    };

    if let Some(output_file) = args.output_file {
        std::fs::write(output_file, result)?
    } else {
        println!("{}", result);
    }
    Ok(())
}

// May be unused if all inputs are primitive types
#[allow(dead_code)]
fn parse_json<T: serde::de::DeserializeOwned>(json_string: &str) -> Result<T> {
    serde_json::from_str(json_string).map_err(|err| anyhow!("Error parsing input: {}", err))
}
