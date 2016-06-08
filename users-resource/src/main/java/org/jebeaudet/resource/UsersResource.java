package org.jebeaudet.resource;

import org.jebeaudet.api.UsersApi;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResource implements UsersApi {

	@Override
	public String getUser(@PathVariable("organizationId")String organizationId, @PathVariable("username") String username) {
		return organizationId + " " + username;
	}

}
