package com.company.YoutubeGuyProject1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.company.YoutubeGuyProject.entity.Department;
import com.company.YoutubeGuyProject.repository.DepartmentRepository;
import com.company.YoutubeGuyProject.service.DepartmentService;

public class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepository departmentRepository;
	
	@BeforeEach
	void setUp() {
		Department dept = new Department(107, "Sociology", "India", "Socio101");
		
		Mockito.when(departmentRepository.findByDepartmentName("Sociology")).thenReturn(dept);
	}

	@Test
	public void whenValidDeptName_thenDeptShouldFound() {
		String departmentName  = "Sociology";
		Department found = departmentService.fetchDepartmentByName(departmentName);
		assertEquals(departmentName, found.getDepartmentName());
	}

}
