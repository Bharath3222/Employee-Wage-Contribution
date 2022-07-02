package com.assignments.pracrice;

import java.util.Random;

public class EmployeeWageBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		final int WAGE_PER_HOUR = 20;	
		Random random= new Random();
		int isEmpPresent = random.nextInt(2);
		int empHR;
		if (isEmpPresent == 1) {
			System.out.println("Employee is present");
			empHR = 8;
		} else {
			System.out.println("Employee is absent");
			empHR = 0;
		}
		int empWage = empHR * WAGE_PER_HOUR;
		System.out.println("Employee Wage is : "+empWage);
	}

}
