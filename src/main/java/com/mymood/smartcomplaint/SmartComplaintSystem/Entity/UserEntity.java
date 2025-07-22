package com.mymood.smartcomplaint.SmartComplaintSystem.Entity;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import com.mymood.smartcomplaint.SmartComplaintSystem.Enum.RoleEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@Column(nullable = false)
	@Size(min = 3, message = "Name should of minimum 3 characters!")
	@NotBlank(message = "Name cannot be blank!")
	private String name;
	
	@Column(nullable = false, unique = true)
	@Email(message = "Email should be valid!")
	@NotBlank(message = "Email cannot be blank!")
	private String email;
	
	@Column(nullable = false)
	@Size(min = 8, message = "Password should of minimum 8 characters!")
	@NotBlank(message = "Password cannot be blank!")
	private String password;
	
	@Column(nullable = false,unique = true)
	@Size(max = 10, message = "Phone number should of 10 digits!")
	@NotBlank(message = "Phone number cannot be blank!")
	private String phone;
	
	@Enumerated(EnumType.STRING)
	private RoleEnum role;
	
	@Column(nullable = false)
	@Size(max = 100, message = "Address should of maximum 100 characters!")
	@NotBlank(message = "Address cannot be blank!")
	private String address;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<ComplaintEntity> complaints;
	
	public UserEntity() {
		
	}
	
	
	public UserEntity(String name, String email, String password, String phone, String address) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.role = RoleEnum.USER;
		this.address = address;
	}


	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
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
	
	public RoleEnum getRole() {
		return role;
	}
	
	public void setRole(RoleEnum role) {
		this.role = role;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
}
