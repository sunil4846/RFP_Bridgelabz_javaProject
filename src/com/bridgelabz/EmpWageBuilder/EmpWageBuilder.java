package com.bridgelabz.EmpWageBuilder;

public class EmpWageBuilder {

	public static void main(String[] args) {
		EmpWageBuilder obj = new EmpWageBuilder();
		//Employee is present or absent		
		int empAbsentPresent = obj.empAbsentPresent();
		System.out.println(empAbsentPresent);
		
		//Daily employee wage
		int dailyEmpWage = obj.dailyEmpWage();
		System.out.println("Daily wage is : " + dailyEmpWage);
		
		//part time employee wage
		int partTimeEmpWage = obj.partTimeEmpWage();
		System.out.println("Parttime Employee Wage is : " + partTimeEmpWage);
		
		int usingSwitch = obj.usingSwitch();
		System.out.println("Using switch case value " + usingSwitch);
		
		//wage per month
		int wagePerMonth = obj.wagePerMonth();
		System.out.println("wage per month is : " + wagePerMonth);
	}
	
	static int empAbsentPresent() {
		int isFullTime = 1;
		int empCheck = (int)Math.floor(Math.random() * 10)%2;
		if (empCheck == isFullTime) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
		
		return empCheck;
	}
	
	public int dailyEmpWage() {
		int wagePerHour = 20;
		int fullDayHour = 8;
		int sum = wagePerHour * fullDayHour ;
		return sum;
	}
	
	static int partTimeEmpWage() {
		int isPartTimeHour = 4; 
		int wagePerHour = 20;
		int wage = isPartTimeHour * wagePerHour ; 
		return wage;
	}	
	
	static int usingSwitch() {
		int empCheck = (int)Math.floor(Math.random() * 10)%2;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int isPartTimeHour = 4; 
		switch (empCheck) {
					
		case 1 :
			System.out.println("Employee is present");
			int sum1 = wagePerHour * fullDayHour ;
			System.out.println("Daily Employee wage using switch : " + sum1);
			break;
		case 2 :
			System.out.println("Employee works as part time");
			int sum2 = isPartTimeHour * wagePerHour;
			System.out.println("part time wage using switch : " + sum2);
			break;
			
		default :
			System.out.println("Employee is absent");
			break;
		}
		
		return empCheck;
	}
	
	static int wagePerMonth() {
//		int empCheck = (int)Math.floor(Math.random() * 10)%2;
		int empCheck;
		int workDay = 20;
		int wagePerHour = 20;
		int fullDayHour = 8;
		int sum = workDay * wagePerHour * fullDayHour;
		int days = 0;
		int totalWorkingHr = 0;
		//usecase 6
		while(days <= 20 && totalWorkingHr <= 100) {
			empCheck = (int)Math.floor(Math.random()%3);
			totalWorkingHr = totalWorkingHr + empCheck + days;
			System.out.println("total working hour = " + totalWorkingHr);
			int totalWage = totalWorkingHr * wagePerHour;
			System.out.println("Total wage is : "+ totalWage);
			days = days+1;
		}
		
		return sum;
	}
	
	

}
