package practice;

import java.util.Scanner;
public class EvenPlace {
	
	static void sum(int number) {
		int temp = number;
		int cnt=0;
		int even = 0;
		int  odd = 0;
		while(temp > 0) {
			int remainder = temp % 10;
			temp = temp / 10;
			cnt++;
			if(cnt%2 != 0) {
				
				odd += remainder;
			}
			else {
				even  += remainder;
			}
			
		}
		if(cnt%2 == 0) {
			System.out.println("even :"+odd);
		}
		else {
			System.out.println("even :"+even);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		sum(number);
	}

}
