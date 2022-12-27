package com.infy.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BeforeAfterTest {
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After all");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before each");
	}
	
	@Test
	void test1() {
		System.out.println("t1");
	}
	@Test
	void test2() {
		System.out.println("t2");
	}
	@Test
	void test3() {
		System.out.println("t3");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("after each");
	}
}
