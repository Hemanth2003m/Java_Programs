package practice;

import java.util.Scanner;
public class CobinationOfPrimeAndFab {
	
	static int primeAndFab(int num) {
		int cnt = 0;
		int comb = 0;
		int i;
		for(i=1; i <= num; i++) {
			
			if(num % i == 0) {
				cnt++;
			}
		}
		if(cnt == 2) 
		{
			comb = num;
		}
		return comb;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the range to be form: ");
		int inputRange = scanner.nextInt();
		
		int Prime = 0 ;
		int first = 0, second = 1;
		for(int i = 1; i<=inputRange ; i++) {
			
			 int fab = first + second;
	            first = second;
	            second = fab; 
			System.out.print(fab + " ");
			Prime = primeAndFab(i);
			if (Prime !=0) {
				
				//System.out.print(Prime + " ");

			}

		}
		
	}

}
