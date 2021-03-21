package com.ranthari.thathabbaiweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ThathabbaiWebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(ThathabbaiWebApplication.class);
    }

    public static void main(String[] args) {
	SpringApplication.run(ThathabbaiWebApplication.class, args);
    }

}
