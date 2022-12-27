package com.infy.junit;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath math = new MyMath();
	List<String> todos = Arrays.asList("aws", "java", "devops");
	@Test
	void claculateSumTest_ThreeNumberArray() {
		int actualResult = math.sum(new int[] {1,2,3});
		int expectedResult = 6;
		
		assertEquals(expectedResult, actualResult, "Error Message");	
	}
	
	@Test
	void claculateSumTest_ZeroLengthArray() {
		assertEquals(0, math.sum(new int[] {}));	
	}
	
	@Test
	void test() {
		boolean actual = todos.contains("java");
		boolean actual2 = todos.contains("cpp");
//		assertEquals(true, actual);
		assertTrue(actual); // same as 
		
		assertFalse(actual2);
		assertEquals(3, todos.size());
		
//		assertNull();
//		assertNotNull(math);
	
//		assertArrayEquals(new int[] {1,2},new int[] {1} );
	
	}

}















