package com.ouardine.nassimacontrole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages ="com.ouardine.nassimacontrole.entities")
@EnableJpaRepositories(basePackages = "com.ouardine.nassimacontrole.repositories")
@ComponentScan(basePackages = {"com.ouardine.nassimacontrole.services", "com.ouardine.nassimacontrole.controller"})
public class NassimaControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(NassimaControleApplication.class, args);
    }

}
