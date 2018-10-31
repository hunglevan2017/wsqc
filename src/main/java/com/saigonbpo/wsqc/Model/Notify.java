package com.saigonbpo.wsqc.Model;

import org.springframework.http.HttpStatus;

import com.saigonbpo.wsqc.Common.Constants;

public class Notify {
	
	private String status;
	private String status_code;
	private String error;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	public Notify()
	{
		status =  Constants.SUCCESS;
		status_code = HttpStatus.OK.toString();
	}
	
	

}
