package org.jebeaudet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UsersResourceApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(UsersResourceApplication.class, args);
    }
}
