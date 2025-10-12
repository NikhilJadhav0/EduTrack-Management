package com.Meta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.Meta.entity")
@EnableJpaRepositories(basePackages = "com.Meta.repository")
@SpringBootApplication
public class MetaAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetaAiApplication.class, args);
	}

}
