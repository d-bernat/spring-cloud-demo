package com.tt.arc.dbernat.spring.cloud.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tt.arc.dbernat.spring.cloud.demo.app.DemoApplication;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {DemoApplication.class})
@IntegrationTest({"server.port:0", "info.description:test", "eureka.client.registerWithEureka:false", "eureka.client.fetchRegistry:false"})
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
