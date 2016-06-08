package org.jebeaudet.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/organizations/{organizationId}")
public interface UsersApi {
	
    @RequestMapping(method = RequestMethod.GET, value ="/users/{username}")
    String getUser(@PathVariable("organizationId") String organizationId, 
    		@PathVariable("username") String username);
}
