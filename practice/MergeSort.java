package practice;
import java.util.*;
public class MergeSort {
	static void merge(int arr[], int l, int mid, int r) {
		
		int n1 = mid - l + 1;
		int n2 = r - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0; i<n1; i++) {
			L[i] = arr[l + i];
		}
		
		for(int j=0; j<n2; j++) {
			R[j] = arr[mid +1 + j];
		}
		
		int i=0, j=0;
		int k = l;
		
		while(i < n1 && j < n2) {
			if(L[i] < R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}
	static void sort(int arr[], int l, int r) {
		if(l < r) {
			int mid = (l + r)/2;
			
			sort(arr, l, mid);
			sort(arr, mid+1, r);
			
			merge(arr, l, mid, r);
			
		}
		
		
	}
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter number of elements: ");
		int n = read.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter elements: ");
		for(int i=0;i< n ;i++) {
			arr[i] = read.nextInt();
		}
		
		//MergeSort ob = new MergeSort();
		sort(arr, 0, arr.length-1);
		
		for(int i=0;i< arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		Random random = new Random();
		int num = random.nextInt(1000);
		System.out.println(num);
		
	}
}
