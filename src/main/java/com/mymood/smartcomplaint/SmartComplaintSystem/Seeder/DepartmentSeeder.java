package com.mymood.smartcomplaint.SmartComplaintSystem.Seeder;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mymood.smartcomplaint.SmartComplaintSystem.Entity.DepartmentEntity;
import com.mymood.smartcomplaint.SmartComplaintSystem.Repository.DepartmentRepository;

@Component
public class DepartmentSeeder implements CommandLineRunner{
	
	DepartmentRepository departmentRepository;
	
	public DepartmentSeeder(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		
		 Map<String, String> departments = Map.of(
            "Water", "Handles water supply and drainage complaints",
            "Garbage", "Responsible for garbage collection and waste management",
            "Road", "Looks after road damage, potholes, and maintenance",
            "Electricity", "Handles power outages, street wiring, and faults",
            "Streetlight", "Responsible for streetlight repair and maintenance"
        );

        for (Map.Entry<String, String> entry : departments.entrySet()) {
            if (departmentRepository.findByName(entry.getKey()).isEmpty()) {
                departmentRepository.save(new DepartmentEntity(entry.getKey(), entry.getValue()));
            }
        }
        
	}	
}
