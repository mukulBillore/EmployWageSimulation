package com.bridgelabs;

import java.util.Random;

public class EmployWageSimulation {

	public static void main(String[] args) {
		Random rand=new Random();
		int presentOrAbsent=rand.nextInt(2);
		System.out.print("welcome to the employ wage simulation ");
     if(presentOrAbsent==0) {
    	 System.out.println("Employ is present ");
     }else System.out.println("Employ is absent");

	}

}
