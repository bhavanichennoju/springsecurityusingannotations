package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonInclude;

public class LoginResponseRole {

	private int status;
	private String message;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Object result;
	
	
	public LoginResponseRole(int status, String message, Object result) {
		super();
		this.status = status;
		this.message = message;
		this.result = result;
	}

	public LoginResponseRole(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
