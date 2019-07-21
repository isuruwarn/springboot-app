package org.warn.example.springbootapp;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * https://spring.io/guides/gs/spring-boot/
 *
 */
@RestController
@Slf4j
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		log.info("Greetings from Spring Boot!");
		return "Greetings from Spring Boot!";
	}
	
	@PostMapping("/submit")
	public String submit( @RequestBody String requestBody ) {
		log.info("Request body: " + requestBody);
		return "You sent: " + requestBody;
	}

}