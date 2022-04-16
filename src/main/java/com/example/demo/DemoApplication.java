package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    @Value("${MY-UPPERCASE-SECRET:womp}")
    private String uppercaseProp;

    @Value("${my-lower-case-secret:womp}")
    private String lowercaseProp;

    @Value("${secretString:fail}")
    private String secretString;

    @Value("${MY_VAR:nope}")
    private String myVar;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Uppercase secret: {}", uppercaseProp);
        log.info("Lowercase secret: {}", lowercaseProp);
        log.info("String secret: {}", secretString);
        log.info("My VAR: {}", myVar);
    }
}
