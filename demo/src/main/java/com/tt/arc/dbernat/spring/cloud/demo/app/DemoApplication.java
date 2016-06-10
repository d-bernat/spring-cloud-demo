package com.tt.arc.dbernat.spring.cloud.demo.app;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@EnableEurekaClient
@Configuration
public class DemoApplication {

    private static final Logger LOG = Logger.getLogger(DemoApplication.class.getName());
    @Value("${info.description:default}")
    private String name;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String home() {
        LOG.info("home functionality is running");
        return "this is test " + name;
    }
    
    @RequestMapping("/test")
    public String test() {
        return "this is another test " + name;
    }
}
