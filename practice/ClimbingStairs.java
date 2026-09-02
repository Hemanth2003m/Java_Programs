package practice;

import java.util.Scanner;

public class ClimbingStairs {
	static int climbStairs(int n) {
		
		int[] table = new int[n+1+1];
		table[1] = 1;
		table[2] = 2;
		for(int i =3 ; i<=n ; i++) {
			table[i] = table[i-1] + table[i-2];
		}
		
		
		return table[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int res = climbStairs(num);
		System.out.println(res);
	}

}
