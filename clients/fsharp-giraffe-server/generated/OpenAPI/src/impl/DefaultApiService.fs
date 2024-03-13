namespace OpenAPI
open OpenAPI.Model.Cycle
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.GetApiAllJson ctx  =
            let content = "OK" :> obj :?> string[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetApiAllJsonStatusCode200 { content = content }

        member this.GetApiProductCycleJson ctx args =
            let content = "OK" :> obj :?> Cycle // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetApiProductCycleJsonStatusCode200 { content = content }

        member this.GetApiProductJson ctx args =
            let content = "OK" :> obj :?> Cycle[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetApiProductJsonStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService