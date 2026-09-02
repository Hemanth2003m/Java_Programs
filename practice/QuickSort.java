package practice;

import java.util.Arrays;
import java.util.Scanner;
public class QuickSort {

		static int partitioningArrays(int[] arr, int low, int high) {
			int pivot =arr[high];
			int k = low;
			for(int i=low; i < high; i++) {
				if(arr[i] < pivot) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
					k++;
				}
			}
			int temp1 = arr[k];
	        arr[k] = arr[high];
	        arr[high] = temp1;
			
			return k;
		}
		
		static void quickSort(int[] arr, int low, int high ) {
			if(low < high) {
				
				int pivotIndex = partitioningArrays(arr, low, high);
				quickSort(arr, low, pivotIndex - 1);
				quickSort(arr, pivotIndex + 1, high);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the count of elements: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter the element of array: ");
		for(int i=0; i < size; i++) {
			array[i] = scanner.nextInt();
		} 
		
		quickSort(array, 0, array.length-1);
		
		System.out.println("The array after sorting: " + Arrays.toString(array));
		
		

	}

}
