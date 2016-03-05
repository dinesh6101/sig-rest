package com.sig.team.webworks.ekirana.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
 * http://localhost:1212/ekirana/rest/v2/api-docs
 * http://localhost:1212/ekirana/rest/swagger-ui.html
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
		ApiInfo apiInfo = new ApiInfo(
				"SpreadITGuru eKirana REST Services",
				"©SpreadITGuru",
				"This is the REST API Documentation for eKirana project, developed by Team SIG",
				"Terms of service",
				"dinesh@SpreadItGuru.com",
				"License of API",
				"API license URL");
		return apiInfo;
	}

}
