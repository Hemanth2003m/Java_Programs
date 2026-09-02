package practice;

import java.util.Arrays;
import java.util.Scanner;
public class SumOfNegatives {
	
	static void sheCanCarry(int arr[], int n) {
		int sum = 0;
		int cnt = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] <= 0) {
				cnt++;
				if(cnt <= n) {
					
					sum = sum + arr[i];
					
				}
			}
		}
		System.out.println("The pair of shoes she can carry: " + Math.abs(sum));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the count of shoes: ");
		int numOfShoes = scanner.nextInt();
		
		System.out.println("Enter the count of shoes she can carry: ");
		int numOfCarry = scanner.nextInt();
		
		System.out.println("Enter the price of each shoes: ");
		int arr[] = new int[numOfShoes];
		for(int i=0; i < numOfShoes; i++ ) {
			
			arr[i] = scanner.nextInt();
		}
		Arrays.sort(arr);
		sheCanCarry(arr, numOfCarry);

	}

}
