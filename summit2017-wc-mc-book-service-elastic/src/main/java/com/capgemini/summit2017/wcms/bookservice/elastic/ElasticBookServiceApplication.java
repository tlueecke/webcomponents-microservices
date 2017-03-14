package com.capgemini.summit2017.wcms.bookservice.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(RestConfiguration.class)
@EnableEurekaClient
public class ElasticBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticBookServiceApplication.class, args);
	}
}
