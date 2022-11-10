package com.spring.rest.client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * MyConfig config JavaCode Spring
 * ComponentScan = which package will be scanning for BEAN
 */
@Configuration
@ComponentScan("com.spring.rest.client")
public class MyConfig {

    /**
     * Spring Class for http request
     * @return RestTemplate object
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
