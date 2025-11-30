require 'time'
require 'endoflife_date'

describe 'EndOfLifeDateApiClient' do
  before do
  end

  after do
  end

  describe 'test get_api_all_json' do
    it 'should call' do
      api_instance = EndOfLifeDateApiClient::DefaultApi.new
      begin
        all_products = api_instance.get_api_all_json
        # puts result
        expect(all_products).to include("nodejs")
        expect(all_products).to include("python")
        expect(all_products).to include("ruby")
      rescue EndOfLifeDateApiClient::ApiError => e
        puts "Error when calling DefaultApi->get_api_all_json: #{e}"
        fail
      end
    end
  end

  describe 'test get_api_product_cycle_json' do
    it 'should call' do
      api_instance = EndOfLifeDateApiClient::DefaultApi.new
      begin
        product_cycle = api_instance.get_api_product_cycle_json('python', '3.12')
        # puts product_cycle
        expect(product_cycle.eol.to_s).to eq('2028-10-31')
      rescue EndOfLifeDateApiClient::ApiError => e
        puts "Error when calling DefaultApi->get_api_product_cycle_json: #{e}"
        fail
      end
    end
  end

  describe 'test get_api_product_json' do
    it 'should call' do
      api_instance = EndOfLifeDateApiClient::DefaultApi.new
      begin
        product_all_cycles = api_instance.get_api_product_json('python')
        # puts product_all_cycles
        python_3_12_cycle = nil
        product_all_cycles.each do |cycle|
          # puts cycle.cycle
          if cycle.cycle.to_s == '3.12'
            python_3_12_cycle = cycle
            break
          end
        end
        expect(python_3_12_cycle).not_to be_nil
        expect(python_3_12_cycle.eol.to_s).to eq('2028-10-31')
      rescue EndOfLifeDateApiClient::ApiError => e
        puts "Error when calling DefaultApi->get_api_product_json: #{e}"
        fail
      end
    end
  end

end