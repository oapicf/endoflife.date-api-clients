require "json"

module OpenAPIClient
  module Api
  class ProductJson
    def initialize(@conn : Connection); end

    # Get All Details Get EoL dates of all cycles of a given product.
    def list(product : String) : Response(Array(OpenAPIClient::Cycle))
      @conn.request(Array(OpenAPIClient::Cycle),
        method: :GET,
        path: "/api/{product}.json".sub("{product}", OpenAPIClient.enc(product)),
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
