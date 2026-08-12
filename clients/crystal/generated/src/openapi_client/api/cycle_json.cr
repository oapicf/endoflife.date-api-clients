require "json"

module OpenAPIClient
  module Api
  class CycleJson
    def initialize(@conn : Connection); end

    # Single cycle details Gets details of a single cycle.
    def list(product : String, cycle : String) : Response(OpenAPIClient::Cycle)
      @conn.request(OpenAPIClient::Cycle,
        method: :GET,
        path: "/api/{product}/{cycle}.json".sub("{product}", OpenAPIClient.enc(product)).sub("{cycle}", OpenAPIClient.enc(cycle)),
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
