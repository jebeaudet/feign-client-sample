package org.jebeaudet.client;

import org.jebeaudet.api.UsersApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("users")
public interface UsersClient extends UsersApi {

}
