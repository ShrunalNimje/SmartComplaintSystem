package com.mymood.smartcomplaint.SmartComplaintSystem.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.mymood.smartcomplaint.SmartComplaintSystem.Enum.StatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "complaints")
public class ComplaintEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long complaintId;
	
	@Column(nullable = false)
	@Size(min = 3, message = "Title should of minimum 3 characters!")
	@NotBlank(message = "Title cannot be blank!")
	private String title;
	
	@Column(nullable = false)
	@Size(min = 10, message = "Description should of minimum 10 characters!")
	@NotBlank(message = "Description cannot be blank!")
	private String description;
	
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	
	@Column(nullable = false)
	@Size(min = 3, message = "Category should of minimum 3 characters!")
	@NotBlank(message = "Category cannot be blank!")
	private String category;
	
	@Column(nullable = false)
	@Size(max = 50, message = "Voice should of maximum 50 characters!")
	@NotBlank(message = "Voice cannot be blank!")
	private String voiceUrl;
	
	@Column(nullable = false)
	@Size(min = 10, message = "Location should of minimum 10 characters!")
	@NotBlank(message = "Location cannot be blank!")
	private String location;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createdAt;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private DepartmentEntity department;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;
	
	public ComplaintEntity() {
		
	}
	
	public ComplaintEntity(UserEntity user, DepartmentEntity department, String title, 
			String description, String category, String voiceUrl, String location) {
		super();
		this.user = user;
		this.department = department;
		this.title = title;
		this.description = description;
		this.status = StatusEnum.PENDING;
		this.category = category;
		this.voiceUrl = voiceUrl;
		this.location = location;
		this.createdAt = LocalDateTime.now();
	}

	public Long getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(Long complaintId) {
		this.complaintId = complaintId;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public DepartmentEntity getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentEntity department) {
		this.department = department;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getVoiceUrl() {
		return voiceUrl;
	}

	public void setVoiceUrl(String voiceUrl) {
		this.voiceUrl = voiceUrl;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
}
