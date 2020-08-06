package com.prakash.cloud.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/rest/hello/server")
public class HelloResource {
	private static Logger logger = LoggerFactory.getLogger(HelloResource.class);

	@GetMapping(path = "/rest/hello/server")
	public String hello() {
		logger.info("pkp Calling hello ");
		return "HELLO PRAKASH - from *SERVER ";
	}
}
