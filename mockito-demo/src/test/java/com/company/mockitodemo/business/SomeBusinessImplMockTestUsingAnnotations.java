package com.company.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTestUsingAnnotations {
	
	@Mock
	private DataService dataServiceMock;//this is dependency of businessImpl
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;//This class has dependencies
	
	@Test
	void findGreatestFromAllData_basic() {
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {1,2,4});
		assertEquals(4,  businessImpl.findGreatestFromAllData());
	}
	
//	@Test
//	void findGreatestFromAllData_basic() {
//		
//		DataService dsMock1 = mock(DataService.class);
//		when(dsMock1.retriveAllData()).thenReturn(new int[] {1,2,4});
//		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dsMock1);
//		int actualRes = businessImpl.findGreatestFromAllData();
//		assertEquals(4,  actualRes);
//	}
	@Test
	void findGreatestFromAllData_OneValue() {
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {35});
		assertEquals(35,  businessImpl.findGreatestFromAllData());
	}
	
	@Test
	void findGreatestFromAllData_EmptyArray() {
		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,  businessImpl.findGreatestFromAllData());
	}
}
