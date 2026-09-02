package practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSetSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNumber = scanner.nextInt();
		int k = scanner.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < inputNumber; i++) {
			arr.add(scanner.nextInt());
		}
		int count = 0;
		int maskCount = 1 << inputNumber;
		for(int mask = 0; mask < maskCount; mask++) {
			int sum = 0;
			for(int bit = 0; bit < inputNumber; bit++) {
				if((mask & (1 << bit)) != 0) {
					sum += arr.get(bit);
				}
			}
			if(sum == k) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();

	}

}