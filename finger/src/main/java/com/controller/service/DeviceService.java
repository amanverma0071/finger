package com.controller.service;

import java.util.List;

import com.entities.Device;
import com.requestBody.DeviceRequestBody;

public interface DeviceService {

	public List<Device> getAllDevice();
	
	public Device addDevice(DeviceRequestBody device);
}
