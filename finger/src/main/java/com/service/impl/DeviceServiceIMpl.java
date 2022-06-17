package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.controller.service.DeviceService;
import com.entities.Device;
import com.repository.DeviceRepo;
import com.requestBody.DeviceRequestBody;

@Service
public class DeviceServiceIMpl implements DeviceService{

	@Autowired
	private DeviceRepo deviceRepo;
	
	@Override
	public List<Device> getAllDevice() {
        return deviceRepo.findAll();
        }

	@Override
	public Device addDevice(DeviceRequestBody device) {
		return deviceRepo.save(new Device(device));
	}

	
}
