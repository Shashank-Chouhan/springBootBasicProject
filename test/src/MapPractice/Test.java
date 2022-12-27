package MapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Test {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1,"One");
		map.put(5, "Five");
		map.put(7, "Seven");
		map.put(2, "two");
		map.put(2, "two");
		map.put(2, "two");
		map.put(21, "twenty one");
		//Elements will be printed in random order
		System.out.println(map);
		
		Map<Integer,String> tmap = new TreeMap<Integer,String>();
		tmap.put(1,"One");
		tmap.put(5, "Five");
		tmap.put(7, "Seven");
		tmap.put(2, "two");
		tmap.put(21, "twenty one");
		tmap.put(2, "two");
		
		//Elements will be printed in sorted order of keys
		System.out.println(tmap);
		
		Map<Integer,String> lmap = new LinkedHashMap<Integer,String>();
		lmap.put(1,"One");
		lmap.put(5, "Five");
		lmap.put(7, "Seven");
		lmap.put(2, "two");
		lmap.put(21, "twenty one");
		lmap.put(2, "two");
		//Elements will be printed in insertion order
		System.out.println(lmap);
		
System.out.println("---------------------------------------------------------------------");

		Map<String, Integer> books = new HashMap<String, Integer>();
		
		//Adding key-value pairs to the map
		books.put("Data Structures With Java", 50);
		books.put("Operating System", 80);
		books.put("Let Us C", 70);
		books.put("Java Fundamentals", 40);
		
		//Displaying all the key-value pairs present in the map
		System.out.println(books);
		
		//Traversing the map
		//entrySet() method is used to retrieve all the key value pairs
		 for(Map.Entry book:books.entrySet())
		       System.out.println(book.getKey()+", "+book.getValue());  
		 
		 //keySet() method returns the keys in the Map
		 for(String name:books.keySet())
		       System.out.println("key: "+name);  
		       
		 //values() method returns the values in the Map
		 for(int qty:books.values())
		       System.out.println("value: "+qty);  
		 
		 //Removing element based on key
		 books.remove("Let Us C");
		 
		 //Removing element based on value
		 //Uncomment the code given below, execute and observe the output
		 //books.remove("Let Us C");
		 
		 //Removing element based on key and value
		 //Uncomment the code given below, execute and observe the output
		 //books.remove("Let Us C", 50);
		 
		 System.out.println(books);
		 
		 //Replacing key-value pair in the map
		 books.replace("Operating System", 80, 100);
		 System.out.println(books);
		 
		 //Getting value by passing key to the map
		 System.out.println(books.get("Java Fundamentals"));
		 
		 //Printing size of the map
		 System.out.println(books.size());
		 
		 //Removing all the key-value pairs from the map
		 books.clear();
		 
		 //Checking if the map is empty
		 System.out.println(books.isEmpty());
	}
}
