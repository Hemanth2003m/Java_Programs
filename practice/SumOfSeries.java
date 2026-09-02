package practice;

import java.util.Scanner;
public class SumOfSeries {
	
	static void series(int m, int sum) {
		for(int i = 1 ; i < m ; i+=2) {
			
			sum += ((i*i) - (i+1)*(i+1)) ;
			
		}
		System.out.println("The sum is " + sum);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter th Number");
		int inputM = scanner.nextInt();
		int sum = 0;

		series(inputM, sum);
		
		// 1 - 4 + 9 - 16
		
		
		
	}

}
