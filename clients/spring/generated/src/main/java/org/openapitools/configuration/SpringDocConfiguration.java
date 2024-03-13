package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("endoflife.date")
                                .description("Documentation for the endoflife.date API. The API is currently in Alpha. Additional information about the API can be found on the [endoflife.date wiki](https://github.com/endoflife-date/endoflife.date/wiki)")
                                .contact(
                                        new Contact()
                                                .name("Cliffano Subagio")
                                                .url("https://github.com/oapicf/endoflife.date-api-clients")
                                                .email("blah+oapicf@cliffano.com")
                                )
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("https://github.com/endoflife-date/endoflife.date/blob/master/LICENSE")
                                )
                                .version("0.0.1")
                )
        ;
    }
}