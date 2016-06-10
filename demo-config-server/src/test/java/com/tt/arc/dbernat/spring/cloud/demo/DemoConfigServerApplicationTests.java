package com.tt.arc.dbernat.spring.cloud.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tt.arc.dbernat.spring.cloud.demo.conf.DemoConfigServerApplication;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.cloud.config.environment.Environment;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoConfigServerApplication.class)
@IntegrationTest("server.port:0")
public class DemoConfigServerApplicationTests {

    @Value("${server.port}")
    private int port;

    @Test
    public void contextLoads() {
        
    }

}
