package practice;

import java.util.Scanner;

public class SubArraySum {
	static int  maxSubArray(int s, int[] nums) {
		int[] dp = new int[s];
		dp[0] = nums[0];
		int maxSum = dp[0];
		
		for(int i =1; i< s;i++) {
			dp[i] = Math.max(nums[i], dp[i-1] + nums[i]);
			maxSum = Math.max(maxSum, dp[i]);
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter the array: ");
		for(int i=0; i< num; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int res =  maxSubArray(num, arr);
		System.out.println(res);
	}

}
