package practice;

import java.util.Scanner;
public class FibDP {
	
	static int fabinacci(int n) {
		
//		if(n <= 1) {
//			return 1;
//		}
		int[] table = new int[n+1];
		table[0] = 1;
		table[1] = 1;
		for(int i = 2 ; i < n ;i++) {
			table[i] = table[i - 1] + table[i - 2];
		}
		
		return table[n+1];
		
//		return fabinacci(n - 1) + fabinacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int res = fabinacci(num);
		System.out.println(res);
	}

}
