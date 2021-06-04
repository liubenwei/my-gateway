package com.liu.gateway.sample;

import com.liu.gateway.core.config.GatewayProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayPropertiesTest {
    @Autowired
    private GatewayProperties gatewayProperties;

    @GetMapping("/routes")
    public String getRoutes(){
        return gatewayProperties.toString();
    }
}
