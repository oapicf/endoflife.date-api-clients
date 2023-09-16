namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnyType

module Cycle =

  //#region Cycle

  [<CLIMutable>]
  type Cycle = {
    [<JsonProperty(PropertyName = "cycle")>]
    _Cycle : AnyType;
    [<JsonProperty(PropertyName = "releaseDate")>]
    ReleaseDate : AnyType;
    [<JsonProperty(PropertyName = "eol")>]
    Eol : AnyType;
    [<JsonProperty(PropertyName = "latest")>]
    Latest : AnyType;
    [<JsonProperty(PropertyName = "link")>]
    Link : AnyType;
    [<JsonProperty(PropertyName = "lts")>]
    Lts : AnyType;
    [<JsonProperty(PropertyName = "support")>]
    Support : AnyType;
    [<JsonProperty(PropertyName = "discontinued")>]
    Discontinued : AnyType;
  }

  //#endregion
