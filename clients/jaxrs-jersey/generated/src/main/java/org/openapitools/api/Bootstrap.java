package org.openapitools.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("OpenAPI Server")
      .description("The endoflife.date v0 API is currently deprecated, please [use the endoflife.date v1 API](https://endoflife.date/docs/api/v1/).")
      .termsOfService("")
      .contact(new Contact()
        .email("blah+oapicf@cliffano.com"))
      .license(new License()
        .name("MIT")
        .url("https://github.com/endoflife-date/endoflife.date/blob/master/LICENSE"));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);

    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
