package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.service.FingerService;
import com.entities.Finger;
import com.repository.FingerRepository;
import com.requestBody.FingerRequestBody;

@Service
public class serviceimpl implements FingerService {

	@Autowired
	private FingerRepository fingerRepository;
	
	@Override
	public List<Finger> getFinger() {

		return fingerRepository.findAll(); 
	}

	@Override
	public Finger addFinger(FingerRequestBody finger) {

		return fingerRepository.save(new Finger(finger));
	}

	
}
