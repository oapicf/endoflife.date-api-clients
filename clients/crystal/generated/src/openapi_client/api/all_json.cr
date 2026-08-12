require "json"

module OpenAPIClient
  module Api
  class AllJson
    def initialize(@conn : Connection); end

    # All Products Return a list of all products. Each of these can be used for the other API endpoints.
    def list() : Response(Array(String))
      @conn.request(Array(String),
        method: :GET,
        path: "/api/all.json",
        accept: %w[application/json],
        auth: %w[])
    end
  end
  end

end
