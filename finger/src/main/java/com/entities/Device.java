package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.requestBody.DeviceRequestBody;


@Entity(name="device")
public class Device {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String deviceName;
	private String deviceAlias;
	private Date cDate;
	private Date UDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getDeviceAlias() {
		return deviceAlias;
	}
	public void setDeviceAlias(String deviceAlias) {
		this.deviceAlias = deviceAlias;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	public Date getUDate() {
		return UDate;
	}
	public void setUDate(Date uDate) {
		UDate = uDate;
	}
	public Device(DeviceRequestBody data) {
		this.deviceName = data.getDeviceName();
		this.deviceAlias = data.getDeviceAlias();
		this.cDate = new Date();
		this.UDate = new Date();
	}
	public Device() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
