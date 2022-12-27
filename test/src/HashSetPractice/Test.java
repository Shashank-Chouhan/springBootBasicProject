package HashSetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class Test {
	public static void main(String[] args) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(45);
		hs.add(1);
		hs.add(85);
		System.out.println(hs);//elements will be printed in random order
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(5);
		ts.add(45);
		ts.add(1);
		ts.add(85); //elements will be printed in sorted order
		System.out.println(ts);
		Set<Integer> ls = new LinkedHashSet<Integer>();
		ls.add(5);
		ls.add(45);
		ls.add(1);
		ls.add(85);
		ls.add(85);
		System.out.println(ls);//elements will be printed in insertion order
		System.out.println("----------------------------------------------------------");
		//creating a list using asList() of Arrays class
				List<Integer> numList = Arrays.asList(5, 3, 8, 7, 3);	
				
				//converting list to HashSet
				Set<Integer> hset = new HashSet<Integer>(numList);
				
				//creating iterator object over a set using iterator() method
				Iterator<Integer> setIterator = hset.iterator();
				
				//using hasNext() method to find if next element is present
				while(setIterator.hasNext()) {
					//using next() method to get the next element
					System.out.println(setIterator.next());
				}
		System.out.println("-------------------------------------------------------");
		
		// Creating HashSet
		Set<String> food = new HashSet<String>();

		// Checking if a HashSet is empty
		System.out.println("Is the set empty? : " + food.isEmpty());

		// Adding elements to the HashSet
		food.add("Pasta");
		food.add("Noodles");
		food.add("Sandwich");
		food.add("Pasta");
		food.add("Burger");
		food.add("Noodles");
		System.out.print("Set output without the duplicates: ");
		System.out.println(food);

		// Finding the size of the HashSet
		System.out.println("The number of food items in the set: " + food.size());

		// Checking if the HashSet contains a given element
		String foodItem = "Pasta";
		if (food.contains(foodItem))
			System.out.println(foodItem + " is ordered");
		else
			System.out.println(foodItem + " is not ordered");

		// Removing an element from the HashSet
		System.out.println("Remove burger from the set: " + food.remove("burger"));
		System.out.println("Output after removing burger from the set:" + food);

		// Traversing elements
		Iterator<String> item = food.iterator();

		while (item.hasNext())
			System.out.println(item.next());

		// Removing all the elements from the HashSet
		food.clear();
		System.out.println("After clear() => " + food);
	
	
	
	}
}
