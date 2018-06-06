package com.fyayc.micro.apiextension.web;

public class ErrorModel {
	public String code;
	public String messsage;
	
	public ErrorModel() {
		super();
	}
	public ErrorModel(String code, String messsage) {
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
