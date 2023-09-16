namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType

module Cycle =

  //#region Cycle


  type cycle = {
    _Cycle : AnyType;
    ReleaseDate : AnyType;
    Eol : AnyType;
    Latest : AnyType;
    Link : AnyType;
    Lts : AnyType;
    Support : AnyType;
    Discontinued : AnyType;
  }
  //#endregion
