package practice;
import java.util.Scanner;
public class TowersOfHanoi {
	public static void toh(int n,char a, char b, char c) {
		if(n==1) {
			System.out.println("Moving the disc "+ n +" from the "+ a +" to the "+ c);
			return ;
		}
		toh(n-1,a,c,b);
		System.out.println("Moving the disc "+ n +" from the "+ a +" to the "+ c);
		toh(n-1,b,a,c);
	}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			toh(n,'A','B','C');
			scanner.close();
			
			
		}

		

}
