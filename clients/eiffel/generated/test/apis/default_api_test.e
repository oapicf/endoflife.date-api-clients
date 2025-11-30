note
    description: "API tests for DEFAULT_API"
    date: "$Date$"
    revision: "$Revision$"


class DEFAULT_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_api_all_json
            -- All Products
            --
            -- Return a list of all products. Each of these can be used for the other API endpoints.
        local
            l_response: LIST [STRING_32]
        do
            -- TODO: Initialize required params.

            -- l_response := api.api_all_json
            assert ("not_implemented", False)
        end

    test_api_product_cycle_json
            -- Single cycle details
            --
            -- Gets details of a single cycle.
        local
            l_response: CYCLE
            l_product: STRING_32
            l_cycle: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product
            -- l_cycle

            -- l_response := api.api_product_cycle_json(l_product, l_cycle)
            assert ("not_implemented", False)
        end

    test_api_product_json
            -- Get All Details
            --
            -- Get EoL dates of all cycles of a given product.
        local
            l_response: LIST [CYCLE]
            l_product: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_product

            -- l_response := api.api_product_json(l_product)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DEFAULT_API
            -- Create an object instance of `DEFAULT_API'.
        once
            create { DEFAULT_API } Result
        end

end
