 package com.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.requestBody.FingerRequestBody;

@Entity(name="finger")
public class Finger {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String finertype;
	
	private Date cDate;
    private Date udate;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFinertype() {
		return finertype;
	}
	public void setFinertype(String finertype) {
		this.finertype = finertype;
	}
	public Date getcDate() {
		return cDate;
	}
	public void setcDate(Date cDate) {
		this.cDate = cDate;
	}
	public Date getUdate() {
		return udate;
	}
	public void setUdate(Date udate) {
		this.udate = udate;
	}
	public Finger(FingerRequestBody finger) {
		this.finertype =finger.getFinertype();
		this.cDate = new Date();
		this.udate = new Date();
	}
	public Finger() {
		super();
		// TODO Auto-generated constructor stub
	}
}
