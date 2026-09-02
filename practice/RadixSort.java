package practice;

import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
public class RadixSort {
	
	
	public void radixSort(ArrayList<Integer> arr, int N, int i) {
		
		Map<Integer, List<Integer>> dict =  new TreeMap<>();
		for(int e : arr) {
			int digit = (e /i) % 10;
			if(!dict.containsKey(digit)) {
				dict.put(digit, new ArrayList<>());
			}
			
			dict.get(digit).add(e);
			
		}
		int I = 0;
		for (List<Integer> groupArr : dict.values()) {
		    for (int val : groupArr) {
		        arr.set(I, val) ;
		        I++;
		        
		    }
		}
		
		System.out.println(arr);
	}
	public void maxLength(ArrayList<Integer> arr, int N) {
		int maxl = 0;
		for(int e : arr) {
			 maxl = maxl < e ? e : maxl;
		}
		for(int i = 1; i <= maxl ; i*=10) {
			
			radixSort(arr, N, i);
			
		}
	}
	public static void main(String[] args) {
		
		
		Scanner scanner =  new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		int N = scanner.nextInt();
		
		for(int i = 0; i < N ; i++) {
			
			list.add(scanner.nextInt());			
		}
		
		
		RadixSort obj = new RadixSort();
		
		
		obj.maxLength(list, N);
		
	
	}

}
