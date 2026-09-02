package practice;

import java.util.Scanner;
public class SecondLargest {
	static void secondLargest(int num) {
		int temp = num;
		int max = 0;
		int secondmax = 0;
			while(temp > 0) {
				 int remainder = temp % 10;
				temp = temp / 10;
				if (remainder > max) {
	                secondmax = max;
	                max = remainder;
	            } else if (remainder < max && remainder > secondmax) {
	                secondmax = remainder;
	            }
		
				
		}
			//System.out.println(max);
			System.out.println("The second largest number is : " + secondmax);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the term");

		int num = scanner.nextInt(); 
		
		secondLargest(num);

	}

}
