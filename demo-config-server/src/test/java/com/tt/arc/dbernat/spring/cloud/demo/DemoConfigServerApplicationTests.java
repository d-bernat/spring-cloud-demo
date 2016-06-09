package com.tt.arc.dbernat.spring.cloud.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tt.arc.dbernat.spring.cloud.demo.conf.DemoConfigServerApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoConfigServerApplication.class)
@IntegrationTest("server.port:0")
public class DemoConfigServerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
