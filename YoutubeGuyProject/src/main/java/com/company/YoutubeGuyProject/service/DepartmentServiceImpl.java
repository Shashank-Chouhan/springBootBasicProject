package com.company.YoutubeGuyProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.YoutubeGuyProject.entity.Department;
import com.company.YoutubeGuyProject.error.DepartmentNotFoundException;
import com.company.YoutubeGuyProject.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
		
	}

	@Override
	public List<Department> fetfetchDepartmentsFromDb() {
		List<Department> listOfDept= departmentRepository.findAll();
		return listOfDept;
	}

	@Override
	public Department fetchOneDepartmentById(long id) throws DepartmentNotFoundException {
//		Department deptById = departmentRepository.findById(id).get();
		Optional<Department> deptByIdOPtional = departmentRepository.findById(id);
		
		if(deptByIdOPtional.isPresent() == false) {
			throw new DepartmentNotFoundException("Department Not Available.");
		}
		return deptByIdOPtional.get();
	}

	@Override
	public String deleteOneDepartmentById(long id) {
		departmentRepository.deleteById(id);
		return "Recrd with id: "+id+" is deleted";
	}

	@Override
	public Department updateDepartmentById(long id, Department department) {
		Department existing_dept = departmentRepository.findById(id).get();
		if(existing_dept != null) {
			existing_dept.setDepartmentName(department.getDepartmentName());
			existing_dept.setDepartmentAddress(department.getDepartmentAddress());
			existing_dept.setDepartmentCode(department.getDepartmentCode());
		}
		return departmentRepository.save(existing_dept);
	}

	@Override
	public Department fetchDepartmentByName(String name) {
		Department deptByName = departmentRepository.findByDepartmentName(name);
		
		return deptByName;
	}

	@Override
	public int totalCountOfDepartments(String name) {
		return departmentRepository.totalCountOfDepartments(name);
	}
	
	

}
