package com.company.YoutubeGuyProject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.YoutubeGuyProject.entity.Department;
import com.company.YoutubeGuyProject.error.DepartmentNotFoundException;
import com.company.YoutubeGuyProject.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping(path = "/departments")
	public Department saveDepartment(@Valid @RequestBody Department department) {
		LOGGER.info("Inside save dept of deptController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping(path="/departments")
	public List<Department> fetchDepartmentsFromDb(){
		return departmentService.fetfetchDepartmentsFromDb();
	}
	
	@GetMapping(path = "/departments/{id}")
	public Department fetchOneDepartmentById(@PathVariable("id") long id) throws DepartmentNotFoundException {
		return departmentService.fetchOneDepartmentById(id);	
	}
	
	@DeleteMapping(path = "/departments/{id}")
	public String deleteOneDepartmentById(@PathVariable long id) {
		return departmentService.deleteOneDepartmentById(id);	
	}
	
	@PutMapping(path = "/departments/{id}")
	public Department updateDepartmentById(@PathVariable("id") long id, @RequestBody Department department) {
		return departmentService.updateDepartmentById(id, department);
		
	}
	@GetMapping(path = "/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String name) {
		return departmentService.fetchDepartmentByName(name);	
	}
	
	//total dept of a particular name
	@GetMapping(path = "/departments/totalCount/{name}" )
	public int totalCountOfDepartments(@PathVariable String name) {
		return departmentService.totalCountOfDepartments(name);
	}
}








