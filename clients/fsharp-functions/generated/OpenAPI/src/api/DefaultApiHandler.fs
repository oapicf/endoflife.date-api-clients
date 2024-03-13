namespace OpenAPI

open DefaultApiHandlerParams
open DefaultApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module DefaultApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetApiAllJson
    /// <summary>
    /// All Products
    /// </summary>
   [<FunctionName("GetApiAllJson")>]
    let GetApiAllJson
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/all.json")>]
        req:HttpRequest ) =

      let result = DefaultApiService.GetApiAllJson ()
      match result with
      | GetApiAllJsonStatusCode200 resolved ->
          let content = resolved.content
          let responseContentType = "text/plain"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetApiProductCycleJson
    /// <summary>
    /// Single cycle details
    /// </summary>
   [<FunctionName("GetApiProductCycleJson")>]
    let GetApiProductCycleJson
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/{product}/{cycle}.json")>]
        req:HttpRequest ) =

      let result = DefaultApiService.GetApiProductCycleJson ()
      match result with
      | GetApiProductCycleJsonStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

    //#region GetApiProductJson
    /// <summary>
    /// Get All Details
    /// </summary>
   [<FunctionName("GetApiProductJson")>]
    let GetApiProductJson
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/api/{product}.json")>]
        req:HttpRequest ) =

      let result = DefaultApiService.GetApiProductJson ()
      match result with
      | GetApiProductJsonStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

