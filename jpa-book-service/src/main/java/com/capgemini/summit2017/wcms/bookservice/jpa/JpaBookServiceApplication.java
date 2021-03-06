package com.capgemini.summit2017.wcms.bookservice.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Import(RestConfiguration.class)
@EnableEurekaClient
public class JpaBookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaBookServiceApplication.class, args);
	}

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
