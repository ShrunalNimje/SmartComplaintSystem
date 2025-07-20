package com.mymood.smartcomplaint.SmartComplaintSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mymood.smartcomplaint.SmartComplaintSystem.Entity.DepartmentEntity;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long>{
	
	Optional<DepartmentEntity> findByName(String name);
}
