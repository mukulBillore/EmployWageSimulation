package com.bridgelabs;

public class CompanyWageBuilder {
	EmployWageSimulation arr[];
	
	public CompanyWageBuilder(EmployWageSimulation[] arr) {
		super();
		this.arr = arr;
	}

	public static void main(String args[]) {
		EmployWageSimulation c1per1 = new EmployWageSimulation();
		EmployWageSimulation c1per2 = new EmployWageSimulation();
		EmployWageSimulation c2per1 = new EmployWageSimulation();
		EmployWageSimulation c2per2 = new EmployWageSimulation();
		EmployWageSimulation arr1[] = {c1per1,c1per2};
		EmployWageSimulation arr2[] = {c2per1,c2per2};
		CompanyWageBuilder com1 = new CompanyWageBuilder(arr1);
		CompanyWageBuilder com2 = new CompanyWageBuilder(arr2);
	}
}
