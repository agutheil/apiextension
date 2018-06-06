package com.fyayc.micro.apiextension.web;

import java.util.ArrayList;
import java.util.List;

public class BadRequestModel {
	List<ErrorModel> errors;

	public BadRequestModel() {
		super();
		init();
	}
	
	public BadRequestModel(String code, String message) {
		super();
		init();
		addError(code, message);
	}

	public BadRequestModel(List<ErrorModel> errors) {
		super();
		this.errors = errors;
	}

	public void addError(String code, String message) {
		errors.add(new ErrorModel(code, message));
	}
	
	public List<ErrorModel> getErrors() {
		return errors;
	}
	
	private void init() {
		errors = new ArrayList<ErrorModel>();
	}
	
	
}
