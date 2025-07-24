package com.mymood.smartcomplaint.SmartComplaintSystem.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginDTO {

	@Email(message = "Email should be valid!")
	@NotBlank(message = "Email cannot be blank!")
	private String email;
	
	@NotBlank(message = "Password cannot be blank!")
	private String password;
	
	public LoginDTO() {
		
	}
	
	public LoginDTO(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
