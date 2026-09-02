package practice;

import java.util.Scanner;

public class LongestIncreasingSubsequense {

	static int longestSequence(int index, int cnt,int[] nums) {
          int n = nums.length;
		
		if(n==0) return 0;
		
		int[] dp = new int[n];
		
		int maxlen= 1;
		for(int i=0;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(nums[i]>nums[j]) {
					dp[i]=Math.max(dp[i],dp[j]+1);
				}
			}
			maxlen=Math.max(maxlen,dp[i]);
		}
		
		return maxlen;
		
	

//		if(arr.length > index) return 0;
//		
//		if(arr[index] < arr[index + 1]) {
//			cnt++;
//			index++;
//			longestSequence(index, cnt, arr);
//		}else {
//			 max = Math.max(max, cnt);
//			cnt = 1;
//		}
//		
//		return 0;
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
		int cnt = 1;
		int res = longestSequence(0, cnt, arr);
		System.out.println(res);
	}

}
