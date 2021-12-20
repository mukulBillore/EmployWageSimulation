package com.bridgelabs;

import java.util.Random;

public class EmployWageSimulation {
	Random rand=new Random();
	int fulltimeEmp=1;
	int partTimeEmploy=2;
	int oneDayWage=8;
	int maxDayInMonth=20;
	int maxWorkingHours=8;
	int countDayPresent=0;
	
	public EmployWageSimulation(int fulltimeEmp, int partTimeEmploy, int oneDayWage, int maxDayInMonth,
			int maxWorkingHours, int countDayPresent) {
		super();
		this.fulltimeEmp = fulltimeEmp;
		this.partTimeEmploy = partTimeEmploy;
		this.oneDayWage = oneDayWage;
		this.maxDayInMonth = maxDayInMonth;
		this.maxWorkingHours = maxWorkingHours;
		this.countDayPresent = countDayPresent;
	}
	public void wageCalculator() {
		while(countDayPresent<maxDayInMonth) {
			if(countDayPresent*oneDayWage>=maxWorkingHours) {
				break;
			}
		int presentOrAbsent=rand.nextInt(2);
		
		System.out.print("welcome to the employ wage simulation ");
		if(presentOrAbsent==0) {
    	 //part time or full time 
    	 System.out.println("Employ is present ");
    	 System.out.print("employ one day wage is "+oneDayWage);
    	 countDayPresent++;
     }else System.out.println("Employ is absent");
     if(fulltimeEmp==1) {
    	 System.out.println("employ is full time ");
     }
     else {System.out.println("Employ is part time ");}
	}System.out.println("The totel wage of a employ for a month is :-"+countDayPresent*oneDayWage);
	
	}
	public static void main(String[] args) {
		EmployWageSimulation wage1= new EmployWageSimulation();
		wage1.wageCalculator();
	}
}
