package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.controller.service.FingerService;
import com.entities.Finger;
import com.requestBody.FingerRequestBody;


@RestController
public class MyFingerController {
	
	@Autowired
	private FingerService fingerService;
	
	@GetMapping("/allfingersData")
	public List<Finger> getfingers(){
		return this.fingerService.getFinger();
	}
	@PostMapping("/finger")
		public Finger addfinger(@RequestBody FingerRequestBody finger) {
			
		return this.fingerService.addFinger(finger);
		}
	
	}

