package com.fyayc.micro.apiextension.web;

public class ErrorModel {
	public String code;
	public String message;
	
	public ErrorModel() {
		super();
	}
	public ErrorModel(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
