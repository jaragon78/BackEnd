
package com.argentinaPrograma.Portfolio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {

@Value("${allowed.origins}")
private String allowedOrigins;
@Value("${allowed.headers}")
private String allowedHeaders;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
   
    CorsRegistration reg = registry.addMapping("/**").allowedMethods("*");
    reg.allowedOrigins(allowedOrigins.split(","));
    reg.allowedHeaders(allowedHeaders.split(","));
    }
 
}    



