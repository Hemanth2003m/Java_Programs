package practice;

public class PatternProblems {
	
	static void Rhombus(int num) {
		for(int row = 1 ;  row <= 2*num - 1; row++) {
			int totalCol = num < row ? 2*num - row : row;
			int space = num - totalCol;
			for(int s = 1; s <= space ; s++ ) {
				System.out.print(" ");

			}
			for(int col = 1 ;  col <= totalCol; col++) {
				System.out.print("* ");
				
			}
			System.out.println();

		}
	}
	

	static void LongArrow(int num) {
		for(int row = 1 ;  row <= 2*num - 1; row++) {
			int totalCol = num < row ? 2*num - row : row;
			
			for(int col = 1 ;  col <= totalCol; col++) {
				System.out.print("*");
				
			}
			System.out.println();

		}
	}
	static void hallowSquareX(int num) {
		for(int row = 1 ;  row <= num; row++) {
			
			for(int col = 1 ;  col <= num; col++) {
				
				if(row == 1 || row == num || col == 1 || col == num || row == col || col == num - row +1 ) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();

		}
	}
	
	static void X(int num) {
		for(int row = 1 ;  row <= num; row++) {
			
			for(int col = 1 ;  col <= num; col++) {
				
				if(row == col || col == num - row +1 ) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();

		}
	}
	
	static void hallowSquare(int num) {
		for(int row = 1 ;  row <= num; row++) {
			
			for(int col = 1 ;  col <= num; col++) {
				
				if(row == 1 || row == num || col == 1 || col == num ) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();

		}
	}
	
	static void squarePattern(int num) {
		for(int row = 1 ;  row <= num; row++) {
			
			for(int col = 1 ;  col <= num; col++) {
				System.out.print("* ");
				
			}
			System.out.println();

		}
	}
	
	
	static void rightAngle(int num) {
		for(int row = 1 ;  row <= num; row++) {
			
			for(int col = 1 ;  col <= row; col++) {
				System.out.print("*");
				
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rightAngle(5);
		System.out.println();
		
		squarePattern(5);
		System.out.println();

		hallowSquare(5);
		System.out.println();

		X(5);
		System.out.println();
		
		hallowSquareX(5);
		System.out.println();

		LongArrow(5);
		System.out.println();

		Rhombus(5);
		System.out.println();

	}

}
