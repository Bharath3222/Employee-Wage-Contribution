package com.assignments.pracrice;

import java.util.Random;

public class EmployeeWageContribution {
	public static void main(String[] args) {
		Random random= new Random();
		int empAttendance=random.nextInt(2);
		if(empAttendance==0)
		{
			System.out.println("Employee is Absent");
		}
		else
		{
			System.out.println("Employee is Present");
		}
	}
	

}
