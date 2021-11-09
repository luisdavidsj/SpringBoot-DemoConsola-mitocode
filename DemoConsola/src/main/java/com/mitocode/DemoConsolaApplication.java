package com.mitocode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hola Coders desde Spring Boot en consola");
		LOG.info("Hola Coders desde Spring Boot en consola");
		LOG.warn("Advirtiendo a los coders");
	}

	
}