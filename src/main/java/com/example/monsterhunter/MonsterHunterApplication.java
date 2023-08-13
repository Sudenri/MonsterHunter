package com.example.monsterhunter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class MonsterHunterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonsterHunterApplication.class, args);
    }

}
