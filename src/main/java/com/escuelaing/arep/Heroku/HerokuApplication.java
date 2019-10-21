package com.escuelaing.arep.Heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuApplication.class, args);
	}

}
