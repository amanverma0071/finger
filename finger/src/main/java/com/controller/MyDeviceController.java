package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.controller.service.DeviceService;
import com.entities.Device;
import com.requestBody.DeviceRequestBody;


@RestController
public class MyDeviceController {

	@Autowired
	private DeviceService deviceService;
	
	@GetMapping("/alldevice")
	public List<Device> getDevice(){
		
		return this.deviceService.getAllDevice();
	}
	
	@PostMapping("/device")
	public Device createDevice(@RequestBody() DeviceRequestBody device) {
		return this.deviceService.addDevice(device);
	}
	
}
