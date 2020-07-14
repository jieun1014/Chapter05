package com.dream.Test;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter05Application {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Chapter05Application.class);
		application.setWebApplicationType(WebApplicationType.NONE);
		application.run(args);
	}

}
