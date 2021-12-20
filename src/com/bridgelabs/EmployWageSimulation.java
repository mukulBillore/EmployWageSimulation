package com.bridgelabs;

import java.util.Random;

public class EmployWageSimulation {
	Random rand=new Random();
	int fulltimeEmp=1,partTimeEmploy=2;
	final int oneDayWage=20*8;
	int countDayPresent=0;
	public void wageCalculator() {
		while(countDayPresent<20) {
			if(countDayPresent*oneDayWage>=100) {
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
