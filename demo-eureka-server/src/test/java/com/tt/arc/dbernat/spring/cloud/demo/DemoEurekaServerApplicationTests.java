package com.tt.arc.dbernat.spring.cloud.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.tt.arc.dbernat.spring.cloud.demo.registry.DemoEurekaServerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = DemoEurekaServerApplication.class)
@IntegrationTest("server.port:0")
public class DemoEurekaServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
