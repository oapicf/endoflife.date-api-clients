#include "DefaultApi.h"

using namespace Tiny;



        Response<
            std::list<std::string>
        >
        DefaultApi::
        getApiAll_json(
        )
        {
            std::string url = basepath + "/api/all.json"; //


            // Headers  | 

            // Query    | 

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<std::string> obj = std::list<std::string>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                std::string tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<std::string>> response(obj, httpCode);
            return response;
        }

        Response<
            Cycle
        >
        DefaultApi::
        getApiProductCycle_json(
            
            std::string product
            , 
            
            std::string cycle
            
        )
        {
            std::string url = basepath + "/api/{product}/{cycle}.json"; //product cycle 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_product("{");
                s_product.append("product");
                s_product.append("}");

                int pos = url.find(s_product);

                url.erase(pos, s_product.length());
                url.insert(pos, stringify(product));
                std::string s_cycle("{");
                s_cycle.append("cycle");
                s_cycle.append("}");

                int pos = url.find(s_cycle);

                url.erase(pos, s_cycle.length());
                url.insert(pos, stringify(cycle));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Cycle obj(output_string);


            Response<Cycle> response(obj, httpCode);
            return response;
        }

        Response<
            std::list<Cycle>
        >
        DefaultApi::
        getApiProduct_json(
            
            std::string product
            
        )
        {
            std::string url = basepath + "/api/{product}.json"; //product 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_product("{");
                s_product.append("product");
                s_product.append("}");

                int pos = url.find(s_product);

                url.erase(pos, s_product.length());
                url.insert(pos, stringify(product));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            std::list<Cycle> obj = std::list<Cycle>();
            bourne::json jsonPayload(output_string);








            
            for(auto& var : jsonPayload.array_range())
            {
                Cycle tmp(var.dump());
                obj.push_back(tmp);
            }
            







            Response<std::list<Cycle>> response(obj, httpCode);
            return response;
        }



