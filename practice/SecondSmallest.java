package practice;

import java.util.Scanner;
public class SecondSmallest {
	static void secondSmallest(int num) {
		int temp = num;
		int min = 9999;
		int secondmin = 9989;
			while(temp > 0) {
				 int remainder = temp % 10;
				temp = temp / 10;
				if (remainder < min) {
	                secondmin = min;
	                min = remainder;
	            } else if (remainder > min && remainder < secondmin) {
	                secondmin = remainder;
	            }
		
				
		}
			
			System.out.println("The second smallest number is : " + secondmin);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the term");

		int num = scanner.nextInt(); 
		
		secondSmallest(num);

	}

}
