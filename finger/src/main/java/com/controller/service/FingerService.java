package com.controller.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entities.Finger;
import com.requestBody.FingerRequestBody;


public interface FingerService {

	public List<Finger> getFinger();
	public Finger addFinger(FingerRequestBody finger);
}
