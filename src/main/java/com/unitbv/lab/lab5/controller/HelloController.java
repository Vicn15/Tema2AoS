package com.unitbv.lab.lab5.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tema2")
public class HelloController
{
        
    @RequestMapping(value = "/{name}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String sayHello(@PathVariable String name) {
		return "Hello, " + name;
	}
    
    @RequestMapping(value="/greeting", method=RequestMethod.GET)
	public String getFullgreeting(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
		return "Hello, " + firstName + " " + lastName + "!";
	}
}
