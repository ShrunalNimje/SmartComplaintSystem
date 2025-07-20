package com.mymood.smartcomplaint.SmartComplaintSystem.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departments")
public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long departmentId;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false)
	private String description;
	
	public DepartmentEntity() {
		
	}
	
	public DepartmentEntity(String name, String description) {
	    this.name = name;
	    this.description = description;
	}

	public DepartmentEntity(Long departmentId, String name, String description) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.description = description;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
