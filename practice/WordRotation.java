package practice;

import java.util.Scanner;
public class WordRotation {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the word1 and word2 : ");

		String inputString = scanner.next();
		String needTOCheckString = scanner.next();
		
		String originalString = inputString + inputString;
		
		if(originalString.contains(needTOCheckString)){
			
			System.out.println("1");
		}else {
			System.out.println("-1");
		}

	}

}
