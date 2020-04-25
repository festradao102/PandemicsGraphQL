package com.cenfotec.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@Transactional
public class ComponentesExamen3GraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentesExamen3GraphQlApplication.class, args);
	}

}
