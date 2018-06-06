package com.fyayc.micro.apiextension.model;

public class BadRequestModel {
	public String code;
	public String messsage;
	public BadRequestModel() {
		super();
	}
	public BadRequestModel(String code, String messsage) {
		super();
		this.code = code;
		this.messsage = messsage;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMesssage() {
		return messsage;
	}
	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}
	
}
