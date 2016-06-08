package org.jebeaudet.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersClientResource {

	@Autowired
	private UsersClient feignClient;
	
	@RequestMapping("/")
	public String getUserProxy(){
		return feignClient.getUser("hello", "from feign client proxy"); 
	}
}
