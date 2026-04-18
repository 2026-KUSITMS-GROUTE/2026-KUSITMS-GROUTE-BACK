package com.groute.groute_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GrouteServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrouteServerApplication.class, args);
	}

}
