namespace OpenAPI
open DefaultApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member GetApiAllJson : unit -> GetApiAllJsonResult
      abstract member GetApiProductCycleJson : unit -> GetApiProductCycleJsonResult
      abstract member GetApiProductJson : unit -> GetApiProductJsonResult
    //#endregion