package com.liu.gateway.core.config;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@RunWith(SpringRunner.class)
@DirtiesContext
@SpringBootTest(webEnvironment = RANDOM_PORT)
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.liu")
public class GatewayPropertiesTest   {
    @Autowired
    private GatewayProperties gatewayProperties;
    @Test
    public void getProperties(){
        System.out.println(gatewayProperties);
    }

}