package com.fyayc.micro.apiextension.web;

public class ErrorModel {
	public String code;
	public String message;
	
	public ErrorModel() {
		super();
	}
	public ErrorModel(String code, String messsage) {
		super();
		this.code = code;
		this.message = messsage;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMesssage() {
		return message;
	}
	public void setMesssage(String messsage) {
		this.message = messsage;
	}
}
