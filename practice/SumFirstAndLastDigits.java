package practice;

import java.util.Scanner;
public class SumFirstAndLastDigits {
	
	private static int sumOfDigits;
	
	static int sumOfLastandFirst(int number) {
		
		String str = String.valueOf(number);
		int length = str.length();
		 sumOfDigits = 0;
		
		
		int firstDigit = str.charAt(0) - '0';
		int lastDigit = str.charAt(length - 1) - '0';
		
		return sumOfDigits = firstDigit + lastDigit;

		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number to calculate the First and Last Digit: ");
		int inputNumber = scanner.nextInt();
		if(inputNumber <= 9) {
			System.out.println("Single Digits can't be calculated");

		}
		else {
			
			sumOfDigits = sumOfLastandFirst(inputNumber);
			System.out.println("The Sum of Last and First Digit" + sumOfDigits);
		}
		


		

	}

}
