package com.liu.gateway.core.config;

import com.liu.gateway.core.route.RouteDefinition;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@ConfigurationProperties(GatewayProperties.CONFIG_PREIFX)
@Validated
public class GatewayProperties {
    /**
     * 网关配置前缀
     */
    public  static  final String CONFIG_PREIFX = "gateway";
    /**
     * 所有的路由
     */
    private List<RouteDefinition> routes;

    public static String getConfigPreifx() {
        return CONFIG_PREIFX;
    }

    public List<RouteDefinition> getRoutes() {
        return routes;
    }

    public void setRoutes(List<RouteDefinition> routes) {
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "GatewayProperties{" +
                "routes=" + routes +
                '}';
    }
}
