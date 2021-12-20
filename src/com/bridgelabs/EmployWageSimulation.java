package com.bridgelabs;

import java.util.Random;

public class EmployWageSimulation {
	
	
	public void wageCalculator(int countDayPresent,int maxDayInMonth,int oneDayWage,int maxWorkingHours,int fulltimeEmp) {
		Random rand=new Random();
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
		wage1.wageCalculator(0,20,20,100,1);
		wage1.wageCalculator(0,30,30,120,1);
	}
	
}
