package practice;


import java.util.Arrays;
import java.util.Scanner;
public class BetweenP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int arraySize = scanner.nextInt();
		int arr[] = new int[arraySize];
		
		System.out.println("Enter the array: ");

		for(int i=0; i < arraySize; i++) {
			
			arr[i] = scanner.nextInt();			
		}
		
		Arrays.sort(arr);
		System.out.println("Enter the size of X and Y: ");
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		
		int pCount = arr[Y] - arr[Y - 1];
		System.out.println("The numbers are " + Math.abs(pCount-1) );

		

	}

}
