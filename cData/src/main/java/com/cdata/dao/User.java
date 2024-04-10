package com.cdata.dao;




public class User {


	private String user;


	private String pass;

	private String token;
	
	

	
	

	public User(String user, String pass, String token) {
		super();
		this.user = user;
		this.pass = pass;
		this.token = token;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	
	

}