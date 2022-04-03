package com.sovon9.proxy;


import javax.servlet.http.HttpSession;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.sovon9.model.Game;

@FeignClient(name = "dao-service", url = "localhost:8085")
public interface DaoProxy {

	@PostMapping("/save")
	public String saveDetails(@RequestBody Game game);
	
}
