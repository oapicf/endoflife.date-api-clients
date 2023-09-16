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
                    .description("Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)")
                    .contact(
                        Contact()
                            .name("Cliffano Subagio")
                            .url("https://github.com/cliffano/endoflife.date-api-clients")
                            .email("blah@cliffano.com")
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
