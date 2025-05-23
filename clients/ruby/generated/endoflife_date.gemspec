# -*- encoding: utf-8 -*-

=begin
#endoflife.date

#Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki).

The version of the OpenAPI document: 0.0.1
Contact: blah+oapicf@cliffano.com
Generated by: https://openapi-generator.tech
Generator version: 7.12.0

=end

$:.push File.expand_path("../lib", __FILE__)
require "endoflife_date/version"

Gem::Specification.new do |s|
  s.name        = "endoflife_date"
  s.version     = EndOfLifeDateApiClient::VERSION
  s.platform    = Gem::Platform::RUBY
  s.authors     = ["OpenAPI Clients Factory"]
  s.email       = ["blah+oapicf@cliffano.com"]
  s.homepage    = "https://github.com/oapicf/endoflife.date-api-clients"
  s.summary     = "endoflife.date Ruby Gem"
  s.description = "Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)."
  s.license     = "MIT"
  s.required_ruby_version = ">= 2.0"
  s.metadata    = {}

  s.add_runtime_dependency 'typhoeus', '~> 1.0', '>= 1.0.1'

  s.add_development_dependency 'rspec', '~> 3.6', '>= 3.6.0'

  s.files         = `find *`.split("\n").uniq.sort.select { |f| !f.empty? }
  s.test_files    = `find spec/*`.split("\n")
  s.executables   = []
  s.require_paths = ["lib"]
end
