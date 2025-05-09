--  endoflife.date
--  Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife_date/endoflife.date/wiki).
--  ------------ EDIT NOTE ------------
--  This file was generated with openapi-generator.  You can modify it to implement
--  the server.  After you modify this file, you should add the following line
--  to the .openapi-generator-ignore file:
--
--  src/-servers.adb
--
--  Then, you can drop this edit note comment.
--  ------------ EDIT NOTE ------------
package body .Servers is


   --  All Products
   --  Return a list of all products. Each of these can be used for the other API endpoints.
   overriding
   procedure Get_Api_All_Json
      (Server : in out Server_Type
       ;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Api_All_Json;

   --  Single cycle details
   --  Gets details of a single cycle.
   overriding
   procedure Get_Api_Product_Cycle_Json
      (Server : in out Server_Type;
       Product : in Swagger.UString;
       Cycle : in Swagger.UString;
       Result  : out .Models.Cycle_Type;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Api_Product_Cycle_Json;

   --  Get All Details
   --  Get EoL dates of all cycles of a given product.
   overriding
   procedure Get_Api_Product_Json
      (Server : in out Server_Type;
       Product : in Swagger.UString;
       Result  : out ;
       Context : in out Swagger.Servers.Context_Type) is
   begin
      null;
   end Get_Api_Product_Json;

end .Servers;
