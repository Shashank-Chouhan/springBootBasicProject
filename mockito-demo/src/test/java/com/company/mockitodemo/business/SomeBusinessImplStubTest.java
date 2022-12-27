package com.company.mockitodemo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findGreatestFromAllData_basic() {
		DataServiceStub dsStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dsStub);
		int actualRes = businessImpl.findGreatestFromAllData();
		assertEquals(4,  actualRes);
	}

}
class DataServiceStub implements DataService{
	public int[] retriveAllData() {
		return new int[] {1,2,4};
	}
}
