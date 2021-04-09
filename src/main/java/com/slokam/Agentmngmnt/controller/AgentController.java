package com.slokam.Agentmngmnt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Agentmngmnt.pojo.Student;

@RestController
public class AgentController {
	//http://localhost:8080/calc?v1=23&v2=56
	@GetMapping("calc")
     public Integer calc(Integer v1,Integer v2) {
    	 Integer c=v1+v2;
    	 return c;
     }
	//http://localhost:8080/multi/10/10
	@GetMapping("multi/{v1}/{v2}")
	public Integer multi(@PathVariable Integer v1,@PathVariable Integer v2) {
		Integer c=v1*v2;
		return c;
	}
	@PostMapping("saveStudent")
	public void saveData(@RequestBody Student std) {
		System.out.println(std);
	}
}
