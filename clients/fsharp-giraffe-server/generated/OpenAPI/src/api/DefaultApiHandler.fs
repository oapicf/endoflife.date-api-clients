namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open DefaultApiServiceImplementation
open OpenAPI.Model.AnyType
open OpenAPI.Model.Cycle

module DefaultApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetApiAllJson
    /// <summary>
    /// All Products
    /// </summary>

    let GetApiAllJson  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = DefaultApiService.GetApiAllJson ctx 
          return! (match result with
                      | GetApiAllJsonStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetApiProductCycleJson
    /// <summary>
    /// Single cycle details
    /// </summary>

    let GetApiProductCycleJson (pathParams:GetApiProductCycleJsonPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetApiProductCycleJsonArgs
          let result = DefaultApiService.GetApiProductCycleJson ctx serviceArgs
          return! (match result with
                      | GetApiProductCycleJsonStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region GetApiProductJson
    /// <summary>
    /// Get All Details
    /// </summary>

    let GetApiProductJson (pathParams:GetApiProductJsonPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetApiProductJsonArgs
          let result = DefaultApiService.GetApiProductJson ctx serviceArgs
          return! (match result with
                      | GetApiProductJsonStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

