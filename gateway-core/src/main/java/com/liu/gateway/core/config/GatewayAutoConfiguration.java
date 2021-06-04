package com.liu.gateway.core.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.DispatcherHandler;

@Configuration
@ConditionalOnProperty(name = "gateway.enabled",matchIfMissing = true)
@ConditionalOnClass({DispatcherHandler.class})
@EnableConfigurationProperties
public class GatewayAutoConfiguration {

    @Bean
    public GatewayProperties gatewayProperties() {
        return new GatewayProperties();
    }
}
