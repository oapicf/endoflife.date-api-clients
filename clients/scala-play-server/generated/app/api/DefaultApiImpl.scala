package api

import model.Cycle

/**
  * Provides a default implementation for [[DefaultApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T10:26:06.423739496Z[Etc/UTC]", comments = "Generator version: 7.9.0")
class DefaultApiImpl extends DefaultApi {
  /**
    * @inheritdoc
    */
  override def getApiAllJson(): List[String] = {
    // TODO: Implement better logic

    List.empty[String]
  }

  /**
    * @inheritdoc
    */
  override def getApiProductCycleJson(product: String, cycle: String): Cycle = {
    // TODO: Implement better logic

    Cycle(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def getApiProductJson(product: String): List[Cycle] = {
    // TODO: Implement better logic

    List.empty[Cycle]
  }
}
