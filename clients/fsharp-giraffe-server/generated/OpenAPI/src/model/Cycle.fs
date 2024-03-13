namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CycleCycle
open OpenAPI.Model.CycleDiscontinued
open OpenAPI.Model.CycleEol
open OpenAPI.Model.CycleLts
open OpenAPI.Model.CycleSupport
open OpenAPI.Model.string option

module Cycle =

  //#region Cycle


  type cycle = {
    _Cycle : CycleCycle;
    ReleaseDate : DateTime;
    Eol : CycleEol;
    Latest : string;
    Link : string option;
    Lts : CycleLts;
    Support : CycleSupport;
    Discontinued : CycleDiscontinued;
  }
  //#endregion
