package com.assignments.pracrice;

import java.util.Random;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		final int WAGE_PER_HOUR = 20;	
		Random random= new Random();
		int isEmpPresent = random.nextInt(3);
		int empHR;
		switch(isEmpPresent) {
			
		case 1 :
			System.out.println("Employee is present");
			empHR = 8;	
		break;
	
		case 2 :
			System.out.println("Employee is working part-time");
			empHR = 4;
		break;
		
		default :
			System.out.println("Employee is absent");
			empHR = 0;
		break;
		}
		
		int empWage = empHR * WAGE_PER_HOUR;
		System.out.println("Employee Wage is : "+empWage);
	}
}

	

	
