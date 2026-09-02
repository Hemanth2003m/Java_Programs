package practice;

import java.util.Scanner;
import java.util.Stack;

public class PostfixtoPrefix {
	static boolean operand(char c) {
		return (c == '*' || c == '+' || c == '-' || c == '/' || c == '^') ;
			
		
	}
	static void conversion(String exp) {
		Stack<String> st = new Stack<>();
		
		for(int i = 0 ; i < exp.length() ; i++) {
			
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				st.push(c + "");
			}
			else if(operand(c)) {
				String op2 = st.pop();
				String op1 = st.pop();
				String expression = c + op1 + op2;
				st.push(expression);
			}
		}
		System.out.println(st.peek());
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		
		conversion(str);
		

	}


}
