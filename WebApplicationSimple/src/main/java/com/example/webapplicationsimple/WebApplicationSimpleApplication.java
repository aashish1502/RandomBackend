package com.example.webapplicationsimple;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class WebApplicationSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplicationSimpleApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext ctx) {

		return  args -> {
			System.out.println("Let's inspect the beans provided by Spring Boot");

			String[] springBeans = ctx.getBeanDefinitionNames();
			Arrays.sort(springBeans);
			for(String speaingBean : springBeans) {

				System.out.println(speaingBean);

			}

		};

	}

}
