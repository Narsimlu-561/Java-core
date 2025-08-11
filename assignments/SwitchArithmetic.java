package assignments;

import java.util.Scanner;

public class SwitchArithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		
		System.out.println("Enter the target operator:");
		String operator=sc.next();
		int result=0;
		switch(operator) {
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
		case "%":
			result=num1%num2;
			break;
			default:
				System.err.println("Invalid input");
		}
		System.out.println(result);
		sc.close();
	}
}
