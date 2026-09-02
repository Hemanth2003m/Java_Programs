package practice;


import java.util.Scanner;
public class StudentMarks {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("Enter the average marks of student");
			int inputMarks = scanner.nextInt();
			
			if(inputMarks <= 59 && inputMarks >= 0) {
				System.out.println("The stident is failed");
				
			}
			else if(inputMarks <= 80 && inputMarks >= 60) {
				System.out.println("The student is Second");

			}
			else if(inputMarks <= 95 && inputMarks >= 81) {
				System.out.println("The student is First");

		}
			else if(inputMarks <= 100 && inputMarks >= 96) {
				System.out.println("The student is Outstanding");

		}
			else{
				System.out.println("The input number is invalid ");
				
			}
			
			scanner.close();

	}
}
