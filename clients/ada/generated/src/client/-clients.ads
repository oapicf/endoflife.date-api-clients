--  endoflife.date
--  Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife_date/endoflife.date/wiki)
--
--  The version of the OpenAPI document: 0.0.1
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.4.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-bmrIu");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  All Products
   --  Return a list of all products. Each of these can be used for the other API endpoints.
   procedure Get_Api_All_Json
      (Client : in out Client_Type;
       Result : out Swagger.UString_Vectors.Vector);

   --  Single cycle details
   --  Gets details of a single cycle
   procedure Get_Api_Product_Cycle_Json
      (Client : in out Client_Type;
       Product : in Swagger.UString;
       Cycle : in Swagger.UString;
       Result : out .Models.Cycle_Type);

   --  Get All Details
   --  Get EoL dates of all cycles of a given product.
   procedure Get_Api_Product_Json
      (Client : in out Client_Type;
       Product : in Swagger.UString;
       Result : out .Models.Cycle_Type_Vectors.Vector);

end .Clients;
