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
        * @return A Seq[String]
        */
        def Default_getApiAll.json(): Either[CommonError,Seq[String]] = Left(TODO)

        /**
        * 
        * @return A Seq[Cycle]
        */
        def Default_getApiProduct.json(product: String): Either[CommonError,Seq[Cycle]] = Left(TODO)

        /**
        * 
        * @return A Cycle
        */
        def Default_getApiProductCycle.json(product: String, cycle: String): Either[CommonError,Cycle] = Left(TODO)

}