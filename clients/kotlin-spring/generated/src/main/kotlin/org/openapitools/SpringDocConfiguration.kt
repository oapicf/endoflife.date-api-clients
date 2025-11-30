package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("endoflife.date")
                    .description("The endoflife.date v0 API is currently deprecated, please [use the endoflife.date v1 API](https://endoflife.date/docs/api/v1/).")
                    .contact(
                        Contact()
                            .name("OpenAPI Clients Factory")
                            .url("https://github.com/oapicf/endoflife.date-api-clients")
                            .email("blah+oapicf@cliffano.com")
                    )
                    .license(
                        License()
                            .name("MIT")
                            .url("https://github.com/endoflife-date/endoflife.date/blob/master/LICENSE")
                    )
                    .version("0.0.1")
            )
    }
}
