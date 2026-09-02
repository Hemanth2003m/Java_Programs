package practice;

import java.util.Scanner;
public class SumOfOdd {
	
	static void oddSum(int number) {
		int temp = number;
		int sum=0;
		while(temp != 0) {
			int remainder = temp % 10;
			if(remainder%2  != 0) {
				sum += remainder;
			}
			 temp = temp / 10;
			
			
		}
		System.out.println("The output is " + sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");

		int input = scanner.nextInt();
		
		oddSum(input);
		
		scanner.close();
		
		// 57873

	}

}
