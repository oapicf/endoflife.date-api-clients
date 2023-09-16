namespace OpenAPI
open DefaultApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member GetApiAllJson:HttpContext ->GetApiAllJsonResult
      abstract member GetApiProductCycleJson:HttpContext -> GetApiProductCycleJsonArgs->GetApiProductCycleJsonResult
      abstract member GetApiProductJson:HttpContext -> GetApiProductJsonArgs->GetApiProductJsonResult
    //#endregion