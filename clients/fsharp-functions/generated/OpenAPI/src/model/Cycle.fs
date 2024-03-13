namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CycleCycle
open OpenAPI.Model.CycleDiscontinued
open OpenAPI.Model.CycleEol
open OpenAPI.Model.CycleLts
open OpenAPI.Model.CycleSupport
open OpenAPI.Model.string option

module Cycle =

  //#region Cycle

  [<CLIMutable>]
  type Cycle = {
    [<JsonProperty(PropertyName = "cycle")>]
    _Cycle : CycleCycle;
    [<JsonProperty(PropertyName = "releaseDate")>]
    ReleaseDate : DateTime;
    [<JsonProperty(PropertyName = "eol")>]
    Eol : CycleEol;
    [<JsonProperty(PropertyName = "latest")>]
    Latest : string;
    [<JsonProperty(PropertyName = "link")>]
    Link : string option;
    [<JsonProperty(PropertyName = "lts")>]
    Lts : CycleLts;
    [<JsonProperty(PropertyName = "support")>]
    Support : CycleSupport;
    [<JsonProperty(PropertyName = "discontinued")>]
    Discontinued : CycleDiscontinued;
  }

  //#endregion
