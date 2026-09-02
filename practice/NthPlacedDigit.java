package practice;

import java.util.Scanner;
public class NthPlacedDigit {
	
	static void findPosition(int number, int searchNumber) {
		String str = String.valueOf(number);
		boolean found = false;
		for(int i = 0 ; i < str.length() ; i++) {
			if(searchNumber == str.charAt(i) - '0') {
				System.out.println("Enter the Number is at the index: " + (i+1));
				found = true;
				break;

			}
			
		}
		if(!found) {
			System.out.println("Entered  Number is not in the input Number ");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int inputNumber = scanner.nextInt();
		
		System.out.println("Enter the Number to be search: ");
		int inputSearchNumber = scanner.nextInt();


		
		findPosition(inputNumber, inputSearchNumber);

	}

}
