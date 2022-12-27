package com.company.RestApiProject.Users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	//Jpa / hibernate
	
	private static List<Users> users = new ArrayList<>();
	
	private static int usercount = 0;
	static {
		users.add(new Users(++usercount, "adam", LocalDate.now().minusYears(30)));
		users.add(new Users(++usercount, "eve", LocalDate.now().minusYears(25)));
		users.add(new Users(++usercount, "lucy", LocalDate.now().minusYears(34)));
	}
	
	public List<Users> findAll(){
		return users;
	}

	public Users findOne(int id) {
		for(Users u: users) {
			if(u.getId()==id) {
				return u;
			}
		}
		return null;
	}
	
	public Users saveUser(Users user) {
		user.setId(++usercount);
		users.add(user);
		return user;
		
	}

	public void deleteOneUser(int id) {
		int k = 0;
		for(Users u: users) {
			if(u.getId() == id) {
				users.remove(k);
				return;
			}
			k++;
		}
		throw new UserNotFoundException("id: "+id);
	}
}
