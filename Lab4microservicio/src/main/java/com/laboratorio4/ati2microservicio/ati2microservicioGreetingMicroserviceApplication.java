package com.laboratorio4.ati2microservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ati2microservicioGreetingMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ati2microservicioGreetingMicroserviceApplication.class, args);
    }

}