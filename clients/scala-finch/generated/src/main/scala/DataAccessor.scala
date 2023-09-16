package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A AnyType
        */
        def Default_getApiAll.json(): Either[CommonError,AnyType] = Left(TODO)

        /**
        * 
        * @return A AnyType
        */
        def Default_getApiProduct.json(product: AnyType): Either[CommonError,AnyType] = Left(TODO)

        /**
        * 
        * @return A Cycle
        */
        def Default_getApiProductCycle.json(product: AnyType, cycle: AnyType): Either[CommonError,Cycle] = Left(TODO)

}