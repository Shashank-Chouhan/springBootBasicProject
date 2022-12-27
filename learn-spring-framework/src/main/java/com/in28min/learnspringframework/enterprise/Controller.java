//Program Flow

package com.in28min.learnspringframework.enterprise;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Sending Response in right format
@RestController
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	// /sum => 100
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}
	
}

// Business logic
@Component
class BusinessService{
	
	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		ArrayList<Integer> al = dataService.retriveData();
		long sum = 0;
		for(int num: al) {
			sum += num;
		}
		return sum;
	}
	
}

//get data from DB
@Component
class DataService{
	
	private ArrayList<Integer> al = new ArrayList<Integer>();
	
	
	public ArrayList<Integer> retriveData(){
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(30);
		return al;
	}
	
	
}




