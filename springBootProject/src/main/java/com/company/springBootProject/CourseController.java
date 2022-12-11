package com.company.springBootProject;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	// localhost:8080/courses -> show al the courses
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses() {
		return Arrays.asList(
					new Course(101, "Aws", "in28mins"),
					new Course(102, "Azure", "Infosys"),
					new Course(103, "Java", "Telusko"),
					new Course(104, "Pythons", "Telusko"),
					new Course(105, "Physics", "Tcs")
				);
	}
}
