package practice;

import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		
		int inputNumber = scanner.nextInt();
		int rootNumber = (int)Math.sqrt(inputNumber);
		
		if(rootNumber * rootNumber == inputNumber) System.out.println("Perferct Square");
		else System.out.println("Not Perferct Square");

	}

}
