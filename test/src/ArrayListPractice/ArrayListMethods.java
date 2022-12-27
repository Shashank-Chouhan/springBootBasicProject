package ArrayListPractice;
import java.util.ArrayList;
import java.util.List;
class ArrayListMethods {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();  // Creating an ArrayList object
		
		// Adding the element to the list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		System.out.println("My number list: " + numbers);

		// Adding the number 15 at a particular index (index: 2) in the ArrayList
		numbers.add(2, 15);
		System.out.println("Observe the second index: " + numbers);

		// Finding the size of the ArrayList
		System.out.println("The array size: " + numbers.size());

		// Retrieving the element at a specified index
		System.out.println("The number present at the fifth index is: " + numbers.get(5));

		// Modifying the element at a specified index
		numbers.set(2, 200);
		System.out.println("The number at the 2nd index is changed from 2 to 200: " + numbers);

		
		List<String> names = new ArrayList<String>();
		names.add("Brian");
		names.add("Ross");
		names.add("Steve");
		names.add("Rachel");
		names.add("Steve");

		// Checking whether any element is present
		if (names.isEmpty()) {
			System.out.println("No names are present!!");
		}

		// Displaying the number of names in the list
		System.out.println("Number Of names: " + names.size());

		// Creating newNames list
		List<String> newNames = new ArrayList<String>();
		newNames.add("Emily");
		newNames.add("Melissa");

		// Adding elements of newNames list into names list
		names.addAll(newNames);

		// Displaying all names
		System.out.println("The list of names: ");
		System.out.println("========================================");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("========================================");

		// Checking whether the name Ross is present or not
		if (names.contains("Ross")) {
			System.out.println("The name is present already!!!");
		} else {
			System.out.println("The name is not present!!");
		}

		// Converting list to array
		Object[] namesArray = names.toArray();

		// Deleting all the items from the orders
		names.clear();

		System.out.println(names.isEmpty());
	}
}