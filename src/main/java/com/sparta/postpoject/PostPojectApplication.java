package com.sparta.postpoject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class PostPojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostPojectApplication.class, args);
    }

}
