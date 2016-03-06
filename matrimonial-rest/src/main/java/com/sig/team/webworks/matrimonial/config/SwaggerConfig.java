package com.sig.team.webworks.matrimonial.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Dinesh B
 * 
 * http://localhost:1414/matrimonial/rest/v2/api-docs
 * http://localhost:1414/matrimonial/rest/swagger-ui.html
 *
 *
* @Api
* @ApiClass
* @ApiError
* @ApiErrors
* @ApiOperation
* @ApiParam
* @ApiParamImplicit
* @ApiParamsImplicit
* @ApiProperty
* @ApiResponse
* @ApiResponses
* @ApiModel
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {

		return new ApiInfoBuilder()
				.title("SpreadITGuru eKirana REST Services")
				.description("This is the REST API Documentation for eKirana project, developed by Team SIG ©SpreadITGuru")
				.termsOfServiceUrl("spreaditguru.com")
				.contact("Dinesh")
				.license("Apache License Version 2.0")
				.licenseUrl("spreaditguru.comr/LICENSE")
				.version("2.0")
				.build();
	}

}
