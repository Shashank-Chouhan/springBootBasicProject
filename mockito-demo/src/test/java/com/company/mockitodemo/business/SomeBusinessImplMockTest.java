package com.company.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplMockTest {

	@Test
	void findGreatestFromAllData_basic() {
		
		DataService dsMock1 = mock(DataService.class);
		when(dsMock1.retriveAllData()).thenReturn(new int[] {1,2,4});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dsMock1);
		int actualRes = businessImpl.findGreatestFromAllData();
		assertEquals(4,  actualRes);
	}
	@Test
	void findGreatestFromAllData_OneValue() {
		
		DataService dsMock1 = mock(DataService.class);
		when(dsMock1.retriveAllData()).thenReturn(new int[] {35});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dsMock1);
		int actualRes = businessImpl.findGreatestFromAllData();
		assertEquals(35,  actualRes);
	}
}
