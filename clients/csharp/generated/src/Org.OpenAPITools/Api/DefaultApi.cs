/*
 * endoflife.date
 *
 * Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)
 *
 * The version of the OpenAPI document: 0.0.1
 * Contact: blah@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Net;
using System.Net.Mime;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Api
{

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApiSync : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// All Products
        /// </summary>
        /// <remarks>
        /// Return a list of all products. Each of these can be used for the other API endpoints.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        Object GetApiAllJson(int operationIndex = 0);

        /// <summary>
        /// All Products
        /// </summary>
        /// <remarks>
        /// Return a list of all products. Each of these can be used for the other API endpoints.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        ApiResponse<Object> GetApiAllJsonWithHttpInfo(int operationIndex = 0);
        /// <summary>
        /// Single cycle details
        /// </summary>
        /// <remarks>
        /// Gets details of a single cycle
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="cycle">Release Cycle for which the details must be fetched</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Cycle</returns>
        Cycle GetApiProductCycleJson(Object product, Object cycle, int operationIndex = 0);

        /// <summary>
        /// Single cycle details
        /// </summary>
        /// <remarks>
        /// Gets details of a single cycle
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="cycle">Release Cycle for which the details must be fetched</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Cycle</returns>
        ApiResponse<Cycle> GetApiProductCycleJsonWithHttpInfo(Object product, Object cycle, int operationIndex = 0);
        /// <summary>
        /// Get All Details
        /// </summary>
        /// <remarks>
        /// Get EoL dates of all cycles of a given product.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        Object GetApiProductJson(Object product, int operationIndex = 0);

        /// <summary>
        /// Get All Details
        /// </summary>
        /// <remarks>
        /// Get EoL dates of all cycles of a given product.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        ApiResponse<Object> GetApiProductJsonWithHttpInfo(Object product, int operationIndex = 0);
        #endregion Synchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApiAsync : IApiAccessor
    {
        #region Asynchronous Operations
        /// <summary>
        /// All Products
        /// </summary>
        /// <remarks>
        /// Return a list of all products. Each of these can be used for the other API endpoints.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        System.Threading.Tasks.Task<Object> GetApiAllJsonAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// All Products
        /// </summary>
        /// <remarks>
        /// Return a list of all products. Each of these can be used for the other API endpoints.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetApiAllJsonWithHttpInfoAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Single cycle details
        /// </summary>
        /// <remarks>
        /// Gets details of a single cycle
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="cycle">Release Cycle for which the details must be fetched</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Cycle</returns>
        System.Threading.Tasks.Task<Cycle> GetApiProductCycleJsonAsync(Object product, Object cycle, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Single cycle details
        /// </summary>
        /// <remarks>
        /// Gets details of a single cycle
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="cycle">Release Cycle for which the details must be fetched</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Cycle)</returns>
        System.Threading.Tasks.Task<ApiResponse<Cycle>> GetApiProductCycleJsonWithHttpInfoAsync(Object product, Object cycle, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        /// <summary>
        /// Get All Details
        /// </summary>
        /// <remarks>
        /// Get EoL dates of all cycles of a given product.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        System.Threading.Tasks.Task<Object> GetApiProductJsonAsync(Object product, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));

        /// <summary>
        /// Get All Details
        /// </summary>
        /// <remarks>
        /// Get EoL dates of all cycles of a given product.
        /// </remarks>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetApiProductJsonWithHttpInfoAsync(Object product, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken));
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IDefaultApi : IDefaultApiSync, IDefaultApiAsync
    {

    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class DefaultApi : IDefaultApi
    {
        private Org.OpenAPITools.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi() : this((string)null)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class.
        /// </summary>
        /// <returns></returns>
        public DefaultApi(string basePath)
        {
            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                new Org.OpenAPITools.Client.Configuration { BasePath = basePath }
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public DefaultApi(Org.OpenAPITools.Client.Configuration configuration)
        {
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Configuration = Org.OpenAPITools.Client.Configuration.MergeConfigurations(
                Org.OpenAPITools.Client.GlobalConfiguration.Instance,
                configuration
            );
            this.Client = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            this.AsynchronousClient = new Org.OpenAPITools.Client.ApiClient(this.Configuration.BasePath);
            ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="DefaultApi"/> class
        /// using a Configuration object and client instance.
        /// </summary>
        /// <param name="client">The client interface for synchronous API access.</param>
        /// <param name="asyncClient">The client interface for asynchronous API access.</param>
        /// <param name="configuration">The configuration object.</param>
        public DefaultApi(Org.OpenAPITools.Client.ISynchronousClient client, Org.OpenAPITools.Client.IAsynchronousClient asyncClient, Org.OpenAPITools.Client.IReadableConfiguration configuration)
        {
            if (client == null) throw new ArgumentNullException("client");
            if (asyncClient == null) throw new ArgumentNullException("asyncClient");
            if (configuration == null) throw new ArgumentNullException("configuration");

            this.Client = client;
            this.AsynchronousClient = asyncClient;
            this.Configuration = configuration;
            this.ExceptionFactory = Org.OpenAPITools.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// The client for accessing this underlying API asynchronously.
        /// </summary>
        public Org.OpenAPITools.Client.IAsynchronousClient AsynchronousClient { get; set; }

        /// <summary>
        /// The client for accessing this underlying API synchronously.
        /// </summary>
        public Org.OpenAPITools.Client.ISynchronousClient Client { get; set; }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public string GetBasePath()
        {
            return this.Configuration.BasePath;
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Org.OpenAPITools.Client.IReadableConfiguration Configuration { get; set; }

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public Org.OpenAPITools.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// All Products Return a list of all products. Each of these can be used for the other API endpoints.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        public Object GetApiAllJson(int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<Object> localVarResponse = GetApiAllJsonWithHttpInfo();
            return localVarResponse.Data;
        }

        /// <summary>
        /// All Products Return a list of all products. Each of these can be used for the other API endpoints.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> GetApiAllJsonWithHttpInfo(int operationIndex = 0)
        {
            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            localVarRequestOptions.Operation = "DefaultApi.GetApiAllJson";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = this.Client.Get<Object>("/api/all.json", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetApiAllJson", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// All Products Return a list of all products. Each of these can be used for the other API endpoints.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        public async System.Threading.Tasks.Task<Object> GetApiAllJsonAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<Object> localVarResponse = await GetApiAllJsonWithHttpInfoAsync(operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// All Products Return a list of all products. Each of these can be used for the other API endpoints.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> GetApiAllJsonWithHttpInfoAsync(int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {

            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }


            localVarRequestOptions.Operation = "DefaultApi.GetApiAllJson";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Object>("/api/all.json", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetApiAllJson", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Single cycle details Gets details of a single cycle
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="cycle">Release Cycle for which the details must be fetched</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Cycle</returns>
        public Cycle GetApiProductCycleJson(Object product, Object cycle, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<Cycle> localVarResponse = GetApiProductCycleJsonWithHttpInfo(product, cycle);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Single cycle details Gets details of a single cycle
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="cycle">Release Cycle for which the details must be fetched</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Cycle</returns>
        public Org.OpenAPITools.Client.ApiResponse<Cycle> GetApiProductCycleJsonWithHttpInfo(Object product, Object cycle, int operationIndex = 0)
        {
            // verify the required parameter 'product' is set
            if (product == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'product' when calling DefaultApi->GetApiProductCycleJson");
            }

            // verify the required parameter 'cycle' is set
            if (cycle == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'cycle' when calling DefaultApi->GetApiProductCycleJson");
            }

            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("product", Org.OpenAPITools.Client.ClientUtils.ParameterToString(product)); // path parameter
            localVarRequestOptions.PathParameters.Add("cycle", Org.OpenAPITools.Client.ClientUtils.ParameterToString(cycle)); // path parameter

            localVarRequestOptions.Operation = "DefaultApi.GetApiProductCycleJson";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = this.Client.Get<Cycle>("/api/{product}/{cycle}.json", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetApiProductCycleJson", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Single cycle details Gets details of a single cycle
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="cycle">Release Cycle for which the details must be fetched</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Cycle</returns>
        public async System.Threading.Tasks.Task<Cycle> GetApiProductCycleJsonAsync(Object product, Object cycle, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<Cycle> localVarResponse = await GetApiProductCycleJsonWithHttpInfoAsync(product, cycle, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Single cycle details Gets details of a single cycle
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="cycle">Release Cycle for which the details must be fetched</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Cycle)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Cycle>> GetApiProductCycleJsonWithHttpInfoAsync(Object product, Object cycle, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'product' is set
            if (product == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'product' when calling DefaultApi->GetApiProductCycleJson");
            }

            // verify the required parameter 'cycle' is set
            if (cycle == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'cycle' when calling DefaultApi->GetApiProductCycleJson");
            }


            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("product", Org.OpenAPITools.Client.ClientUtils.ParameterToString(product)); // path parameter
            localVarRequestOptions.PathParameters.Add("cycle", Org.OpenAPITools.Client.ClientUtils.ParameterToString(cycle)); // path parameter

            localVarRequestOptions.Operation = "DefaultApi.GetApiProductCycleJson";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Cycle>("/api/{product}/{cycle}.json", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetApiProductCycleJson", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get All Details Get EoL dates of all cycles of a given product.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>Object</returns>
        public Object GetApiProductJson(Object product, int operationIndex = 0)
        {
            Org.OpenAPITools.Client.ApiResponse<Object> localVarResponse = GetApiProductJsonWithHttpInfo(product);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get All Details Get EoL dates of all cycles of a given product.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <returns>ApiResponse of Object</returns>
        public Org.OpenAPITools.Client.ApiResponse<Object> GetApiProductJsonWithHttpInfo(Object product, int operationIndex = 0)
        {
            // verify the required parameter 'product' is set
            if (product == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'product' when calling DefaultApi->GetApiProductJson");
            }

            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("product", Org.OpenAPITools.Client.ClientUtils.ParameterToString(product)); // path parameter

            localVarRequestOptions.Operation = "DefaultApi.GetApiProductJson";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = this.Client.Get<Object>("/api/{product}.json", localVarRequestOptions, this.Configuration);
            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetApiProductJson", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

        /// <summary>
        /// Get All Details Get EoL dates of all cycles of a given product.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of Object</returns>
        public async System.Threading.Tasks.Task<Object> GetApiProductJsonAsync(Object product, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            Org.OpenAPITools.Client.ApiResponse<Object> localVarResponse = await GetApiProductJsonWithHttpInfoAsync(product, operationIndex, cancellationToken).ConfigureAwait(false);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get All Details Get EoL dates of all cycles of a given product.
        /// </summary>
        /// <exception cref="Org.OpenAPITools.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="product">Product URL as per the canonical URL on the endofife.date website</param>
        /// <param name="operationIndex">Index associated with the operation.</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns>Task of ApiResponse (Object)</returns>
        public async System.Threading.Tasks.Task<Org.OpenAPITools.Client.ApiResponse<Object>> GetApiProductJsonWithHttpInfoAsync(Object product, int operationIndex = 0, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
        {
            // verify the required parameter 'product' is set
            if (product == null)
            {
                throw new Org.OpenAPITools.Client.ApiException(400, "Missing required parameter 'product' when calling DefaultApi->GetApiProductJson");
            }


            Org.OpenAPITools.Client.RequestOptions localVarRequestOptions = new Org.OpenAPITools.Client.RequestOptions();

            string[] _contentTypes = new string[] {
            };

            // to determine the Accept header
            string[] _accepts = new string[] {
                "application/json"
            };

            var localVarContentType = Org.OpenAPITools.Client.ClientUtils.SelectHeaderContentType(_contentTypes);
            if (localVarContentType != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Content-Type", localVarContentType);
            }

            var localVarAccept = Org.OpenAPITools.Client.ClientUtils.SelectHeaderAccept(_accepts);
            if (localVarAccept != null)
            {
                localVarRequestOptions.HeaderParameters.Add("Accept", localVarAccept);
            }

            localVarRequestOptions.PathParameters.Add("product", Org.OpenAPITools.Client.ClientUtils.ParameterToString(product)); // path parameter

            localVarRequestOptions.Operation = "DefaultApi.GetApiProductJson";
            localVarRequestOptions.OperationIndex = operationIndex;


            // make the HTTP request
            var localVarResponse = await this.AsynchronousClient.GetAsync<Object>("/api/{product}.json", localVarRequestOptions, this.Configuration, cancellationToken).ConfigureAwait(false);

            if (this.ExceptionFactory != null)
            {
                Exception _exception = this.ExceptionFactory("GetApiProductJson", localVarResponse);
                if (_exception != null)
                {
                    throw _exception;
                }
            }

            return localVarResponse;
        }

    }
}