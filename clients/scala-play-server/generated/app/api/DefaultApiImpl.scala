package api

import model.Cycle
import model.OasAnyTypeNotMapped

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2023-09-16T14:49:07.439280Z[Etc/UTC]")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def getApiAllJson(): OasAnyTypeNotMapped = {
    // TODO: Implement better logic

    null
  }

  /**
    * @inheritdoc
    */
  override def getApiProductCycleJson(product: OasAnyTypeNotMapped, cycle: OasAnyTypeNotMapped): Cycle = {
    // TODO: Implement better logic

    Cycle(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getApiProductJson(product: OasAnyTypeNotMapped): OasAnyTypeNotMapped = {
    // TODO: Implement better logic

    null
  }
}
