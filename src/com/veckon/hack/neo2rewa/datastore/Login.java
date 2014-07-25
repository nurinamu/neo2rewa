package com.veckon.hack.neo2rewa.datastore;

public class Login {

	boolean isLogined;
	String result;
	String error;
	public boolean isLogined() {
		return isLogined;
	}
	public void setLogined(boolean isLogined) {
		this.isLogined = isLogined;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Login(boolean isLogined, String result, String error) {
		super();
		this.isLogined = isLogined;
		this.result = result;
		this.error = error;
	}
}
