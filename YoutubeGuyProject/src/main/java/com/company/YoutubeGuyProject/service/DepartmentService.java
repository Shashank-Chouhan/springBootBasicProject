package com.company.YoutubeGuyProject.service;

import java.util.List;

import com.company.YoutubeGuyProject.entity.Department;
import com.company.YoutubeGuyProject.error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetfetchDepartmentsFromDb();

	public Department fetchOneDepartmentById(long id) throws DepartmentNotFoundException;

	public String deleteOneDepartmentById(long id);

	public Department updateDepartmentById(long id, Department department);

	public Department fetchDepartmentByName(String name);

	public int totalCountOfDepartments(String name);

}
