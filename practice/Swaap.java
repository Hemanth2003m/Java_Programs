package practice;

public class Swaap {
	
	static void swap(int a, int b) {
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println(a + " " + b);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 6;
		
		swap(a,b);

	}

}
