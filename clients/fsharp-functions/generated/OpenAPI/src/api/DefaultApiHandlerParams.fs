namespace OpenAPI

open OpenAPI.Model.AnyType
open OpenAPI.Model.Cycle
open System.Collections.Generic
open System

module DefaultApiHandlerParams =



    type GetApiAllJsonStatusCode200Response = {
      content:AnyType;
      
    }
    type GetApiAllJsonResult = GetApiAllJsonStatusCode200 of GetApiAllJsonStatusCode200Response

    //#region Path parameters
    [<CLIMutable>]
    type GetApiProductCycleJsonPathParams = {
      product : AnyType ;
    //#endregion
      cycle : AnyType ;
    }
    //#endregion


    type GetApiProductCycleJsonStatusCode200Response = {
      content:Cycle;
      
    }
    type GetApiProductCycleJsonResult = GetApiProductCycleJsonStatusCode200 of GetApiProductCycleJsonStatusCode200Response

    type GetApiProductCycleJsonArgs = {
      pathParams:GetApiProductCycleJsonPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetApiProductJsonPathParams = {
      product : AnyType ;
    }
    //#endregion


    type GetApiProductJsonStatusCode200Response = {
      content:AnyType;
      
    }
    type GetApiProductJsonResult = GetApiProductJsonStatusCode200 of GetApiProductJsonStatusCode200Response

    type GetApiProductJsonArgs = {
      pathParams:GetApiProductJsonPathParams;
    }
