package practice;

import java.util.Scanner;
public class PrimeNumbersInGivenRange {
	static boolean primeOrNot(int number) {
		int flag = 0;
		for(int i=1; i <= number; i++) {
			if(number % i == 0) {
				flag++;
			}
		}

		return flag == 2;
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the range  to find primes");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		int cnt = 0;
		
		for(int i = firstNumber ; i <= secondNumber ; i++) {
			if(primeOrNot(i)) {
				cnt++;
				
			}
		}
		System.out.println("The count of Primes are: " + cnt);

		
		
	}

	}
