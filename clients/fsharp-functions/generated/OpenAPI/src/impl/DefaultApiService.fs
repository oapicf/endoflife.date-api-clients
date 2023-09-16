namespace OpenAPI
open OpenAPI.Model.AnyType
open OpenAPI.Model.Cycle
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.GetApiAllJson () =
            let content = "OK" :> obj :?> AnyType // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetApiAllJsonStatusCode200 { content = content }

        member this.GetApiProductCycleJson () =
            let content = "OK" :> obj :?> Cycle // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetApiProductCycleJsonStatusCode200 { content = content }

        member this.GetApiProductJson () =
            let content = "OK" :> obj :?> AnyType // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetApiProductJsonStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService