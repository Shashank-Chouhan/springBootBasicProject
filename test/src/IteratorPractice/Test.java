package IteratorPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test {	
	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<String>();
		nameList.add("Harrison");
		nameList.add("Sirius");
		nameList.add("James");
				
						
		//iterating using listIterator()
		//Getting ListIterator object
		ListIterator<String> literator = nameList.listIterator();
				
		//iterating in forward direction
		while(literator.hasNext()) {
			System.out.println("iterating in forward direction:");
			System.out.println(literator.next());
		}			
		//iterating in reverse direction
		System.out.println("iterating in reverse direction:");
		while(literator.hasPrevious()) {
			System.out.println(literator.previous());
		}	

		
		
	
	}
}
