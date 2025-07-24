package com.mymood.smartcomplaint.SmartComplaintSystem.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RegistrationDTO {
	
	@Size(min = 3, message = "Name should of minimum 3 characters!")
	@NotBlank(message = "Name cannot be blank!")
	private String name;
	
	@Email(message = "Email should be valid!")
	@NotBlank(message = "Email cannot be blank!")
	private String email;
	
	@Size(min = 8, message = "Password should of minimum 8 characters!")
	@NotBlank(message = "Password cannot be blank!")
	private String password;
	
	@Pattern(regexp = "\\d{10}", message = "Phone number must be exactly 10 digits!")
	@NotBlank(message = "Phone number cannot be blank!")
	private String phone;
	
	@Size(max = 100, message = "Address should of maximum 100 characters!")
	@NotBlank(message = "Address cannot be blank!")
	private String address;

	public RegistrationDTO() {
		
	}
	
	public RegistrationDTO(
			String name, String email, String password, String phone, String address) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
