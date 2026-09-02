package practice;

import java.util.Stack;
import java.util.Scanner;
public class PrefixToPostfix {
	
		static boolean operand(char c) {
			return (c == '*' || c == '+' || c == '-' || c == '/' || c == '^') ;
				
			
		}
		static void conversion(String exp) {
			Stack<String> st = new Stack<>();
			
			for(int i = exp.length() - 1 ; i >=0; i--) {
				
				char c = exp.charAt(i);
				if(Character.isLetterOrDigit(c)) {
					st.push(c + "");
				}
				else if(operand(c)) {
					String op1 = st.pop();
					String op2 = st.pop();
					String expression = op1 + op2 +c;
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



