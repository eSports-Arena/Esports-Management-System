package com.sovon9.proxy;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.sovon9.model.User;

@FeignClient(name = "user-service", url = "localhost:8082")
public interface UserProxy {

	@PostMapping(value = "/do-signup")
	public String doSignup(@RequestHeader String name,@RequestHeader String requestUrl);
	
	@PostMapping(value = "/do-signup")
	public User doSignup(@RequestBody User user,@RequestHeader String requestUrl);

	@GetMapping(value = "/verify/{verify_code}")
	public boolean verifyEmail(@PathVariable(value = "verify_code") String verify_code);
	
}
