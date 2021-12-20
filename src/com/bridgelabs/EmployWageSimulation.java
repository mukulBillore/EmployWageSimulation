package com.bridgelabs;

import java.util.Random;

public class EmployWageSimulation {

	public static void main(String[] args) {
		Random rand=new Random();
		int fulltimeEmp=1,partTimeEmploy=2;
		int oneDayWage=20*8;
		int countDayPresent=0;
		for(int i=1;i<=20;i++) {
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
}
