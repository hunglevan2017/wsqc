package com.saigonbpo.wsqc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@SpringBootApplication()
@ImportResource( { "classpath*:spring-config.xml"} )
@PropertySource("classpath:jdbc.properties")
@EnableAutoConfiguration(exclude = {
		org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
public class WsqcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsqcApplication.class, args);
	}
}
