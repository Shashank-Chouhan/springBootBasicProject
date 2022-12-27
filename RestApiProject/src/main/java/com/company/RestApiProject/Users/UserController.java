package com.company.RestApiProject.Users;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	public UserDaoService service;
	
//	same as using autowired
//	public UserController(UserDaoService service) {
//		this.service = service;
//	}
	
	@GetMapping(path = "/users")
	public List<Users> retriveAllUsers(){
		return service.findAll();
	}
	
	@GetMapping(path = "/users/{id}")
	public Users getSpecificUser(@PathVariable int id) {
		Users user = service.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("id: "+id);
		}
		return user;		
	}
	@DeleteMapping(path = "/users/{id}")
	public void deleteSpecificUser(@PathVariable int id) {
		service.deleteOneUser(id);
	}
	
	@PostMapping(path = "/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody Users user) {
		
		Users savedUser = service.saveUser(user);
		
		URI location= ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();
	}


}










