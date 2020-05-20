package com.joaomarcos.aplicationoauth2.entity;

public class AuthRequest {
	
	

    public AuthRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
    
	private String userName;
    private String password;
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
