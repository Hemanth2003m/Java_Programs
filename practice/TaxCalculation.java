package practice;

import java.util.Scanner;
public class TaxCalculation {
	
	static void grossSalary(String employName, double monthlyBonus, double employSalary, double hra, String employDesignation) {
		
		//double monthlySalaryWithoutBonus = employSalary - monthlyBonus ;
		double monthlyGrossSalary = employSalary + hra ;
		double annualGrossSalary = monthlyGrossSalary *12;
		
		System.out.println(employName);
		System.out.println(monthlyGrossSalary);
		System.out.println(annualGrossSalary);
		System.out.println(monthlyBonus);
		
		incomeTax(annualGrossSalary, employName,  monthlyBonus,  employSalary,  hra,  employDesignation, monthlyGrossSalary);
		

	}

	static void incomeTax(double annualGrossSalary, String employName, double monthlyBonus, double employSalary, double hra, String employDesignation, double monthlyGrossSalary) {
		
	    double totalDeductions = 80000 + 120000;
	    double taxableIncome = annualGrossSalary - totalDeductions;
		double tax = 0;

	    if (taxableIncome <= 500000) {
	        tax = 0;
	    } else if (taxableIncome <= 800000) {
	        tax = (taxableIncome - 500000) * 0.10;
	    } else if (taxableIncome <= 1000000) {
	        tax = (300000 * 0.10) + (taxableIncome - 800000) * 0.15;
	    } else if (taxableIncome <= 1200000) {
	        tax = (300000 * 0.10) + (200000 * 0.15) + (taxableIncome - 1000000) * 0.20;
	    } else if (taxableIncome <= 1500000) {
	        tax = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (taxableIncome - 1200000) * 0.20;
	    } else if (taxableIncome <= 2000000) {
	        tax = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (300000 * 0.20) + (taxableIncome - 1500000) * 0.25;
	    } else {
	        tax = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (300000 * 0.20) + (500000 * 0.25) + (taxableIncome - 2000000) * 0.30;
	    }
	    System.out.println("Name         : " + employName);
	    System.out.println("Designation  : " + employDesignation);
	    
	    System.out.println("Basic Monthly Salary : ₹" + employSalary);
	    System.out.println("Monthly Gross Salary : ₹" + monthlyGrossSalary);
	    System.out.println("Annual Gross Salary  : ₹" + annualGrossSalary);
	    System.out.println("Annual Bonus         : ₹" + monthlyBonus * 12);
	    
	    System.out.println("Tax Amount Payable     : ₹" + tax);
	    System.out.println("Taxable Income         : ₹" + taxableIncome);

		
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Employee Name: ");
		String employName = scanner.nextLine();
		
		
		System.out.println("Enter Employee Designation: ");
		String employDesignation = scanner.nextLine();
		
		
		System.out.print("Enter Employee Salary: ");
		int employSalary = scanner.nextInt();
		
		System.out.println("select 1 for City, 2 for Urban, 3 for rural");
		int employLocation = scanner.nextInt();
		scanner.nextLine();
		
		
		double hra = 0.0;
		double monthlyBonus = 0.0;
		if(employLocation == 1) {
			
			 hra = (employSalary*15)/100.0;
			
		}
		else if(employLocation == 2) {
			
			 hra = (employSalary*10)/100.0;
			
		}
		else if(employLocation == 3) {
	
	      hra = (employSalary*5)/100.0;
	
        }
		monthlyBonus = (20 * employSalary)/100.0;	
		
		grossSalary(employName, monthlyBonus, employSalary , hra, employDesignation);


	}

}
