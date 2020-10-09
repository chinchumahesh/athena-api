package com.ust.athena.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.athena.core.services.MyService;

@Component
@RestController
@PropertySources({
	@PropertySource("classpath:application.properties"),
	@PropertySource("classpath:api-application.properties")
})
public class RestControllerMain {
	private final MyService myService;
	
	@Value("${service.api}")
	private String apimessage;

	public RestControllerMain(MyService myService) {
		this.myService = myService;
	}

	@GetMapping("/")
	public String home() {
		return myService.message() + "</br>" + apimessage;
	}

	public String getApimessage() {
		return apimessage;
	}

	public void setApimessage(String apimessage) {
		this.apimessage = apimessage;
	}
	
	
	

}
