package com.mymood.smartcomplaint.SmartComplaintSystem.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ComplaintRequestDTO {
	
	@Size(min = 3, message = "Title should of minimum 3 characters!")
	@NotBlank(message = "Title cannot be blank!")
	private String title;
	
	@Size(min = 10, message = "Description should of minimum 10 characters!")
	@NotBlank(message = "Description cannot be blank!")
	private String description;
	
	@NotBlank(message = "Category cannot be blank!")
	private String category;
	
	private String voiceUrl;
	
	@Size(min = 10, message = "Location should of minimum 10 characters!")
	@NotBlank(message = "Location cannot be blank!")
	private String location;
	
	private Long userId;
	
	public ComplaintRequestDTO() {
		
	}
	
	public ComplaintRequestDTO(String title, String description, String category, String voiceUrl, 
			String location, Long userId) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
		this.voiceUrl = voiceUrl;
		this.location = location;
		this.userId = userId;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
