package com.company.mockitodemo.business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findGreatestFromAllData() {
		int data[] = dataService.retriveAllData();
		int greatestValue = Integer.MIN_VALUE;
		for(int d: data) {
			if(d> greatestValue) {
				greatestValue = d;
			}
		}
		return greatestValue;
	}

}

interface DataService{
	int[] retriveAllData();
}
