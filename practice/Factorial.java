package practice;

import java.util.Scanner;
public class Factorial {
	 static int fact(int n) {
		if(n == 0 || n==1) {
			return 1;
		}
		
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");

		int n = scanner.nextInt();
		
		int res = 	fact(n);
		System.out.println(res);
	}

}
