package com.company.YoutubeGuyProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.company.YoutubeGuyProject.entity.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department, Long>{

	public Department findByDepartmentName(String departmentName);
	public Department findByDepartmentNameIgnoreCase(String departmentName);
	
	@Query(value = "Select count(*) from department where department_Name = ?1", nativeQuery = true)// where name = ?1
	public int totalCountOfDepartments(String name);

}
