package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CarPickersProblem {
	public static String rev = "";
	static int smallestNumber(int num) {
		String inputNum = String.valueOf(num);
		char[] numsArray = inputNum.toCharArray();
		Arrays.sort(numsArray);
		inputNum = new String(numsArray);
		int smallNumber = Integer.parseInt(inputNum);
		rev = inputNum;
		return smallNumber;
		
	}

static int biggestNumber(String rev) {
	StringBuilder sb = new StringBuilder(rev);
	sb.reverse();
	rev = sb.toString();
	int bigNumber = Integer.parseInt(rev);
		
		return bigNumber;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");

		int num = scanner.nextInt();
		int cnt = 0;
		int diff = 0;
		while(diff != 6174) {
			int small = smallestNumber(num);       
			int big = biggestNumber(rev);          
			diff = big - small;
			num = diff;
			cnt++;
		}
		System.out.println(cnt);

	}

}
