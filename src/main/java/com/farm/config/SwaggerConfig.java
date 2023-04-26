package com.farm.config;

import com.farm.enums.ResponseStatus;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.*;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @name: SwaggerConfig
 * @author: sutton
 * @date: 2023-04-26 20:27
 * @description: SwaggerConfig
 */
@Configuration
public class SwaggerConfig implements WebMvcConfigurer {


    /**
     * @return swagger config
     */
    @Bean
    public Docket openApi () {
        return new Docket(DocumentationType.OAS_30).groupName("api group").apiInfo(apiInfo()).enable(true).select().apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)).paths(PathSelectors.any()).build().globalRequestParameters(getGlobalRequestParameters()).globalResponses(HttpMethod.GET, getGlobalResponse());
    }

    /**
     * @return global response code->description
     */
    private List<Response> getGlobalResponse () {
        return ResponseStatus.HTTP_STATUS_ALL.stream().map(a -> new ResponseBuilder().code(a.getResponseCode()).description(a.getDescription()).build()).collect(Collectors.toList());
    }

    /**
     * @return global request parameters
     */
    private List<RequestParameter> getGlobalRequestParameters () {
        List<RequestParameter> parameters = new ArrayList<>();
        parameters.add(new RequestParameterBuilder().name("AppKey").description("App Key").required(false).in(ParameterType.QUERY).query(q -> q.model(m -> m.scalarModel(ScalarType.STRING))).required(false).build());
        return parameters;
    }

    /**
     * @return api info
     */
    private ApiInfo apiInfo () {
        return new ApiInfoBuilder().title("Swagger API").description("test api").contact(new Contact("sutton", "https://github.com/Ioome", "2572213252@qq.com")).termsOfServiceUrl("http://localhost.com/").version("1.0").build();
    }
}
