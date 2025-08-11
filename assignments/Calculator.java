package assignments;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println(" 1.Add\n 2.Substract\n 3.Multiply\n 4.Devide\n 5.Module");
		System.out.println("Enter the operation:");
		Scanner sc=new Scanner(System.in);
		String operator=sc.nextLine();
		System.out.println("Enter the first Number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second Number:");
		int n2=sc.nextInt();
		
		int result=0;
		switch(operator) {
		case "+":
			result=n1+n2;
			break;
		case "-":
			result=n1-n2;
			break;
		case "*":
			result=n1*n2;
			break;
		case "/":
			result=n1/n2;
			break;
		case "%":
			result=n1%n2;
			break;
			default:
				System.out.println("Enter valid choice");
				break;
		}
		System.out.println("result is: "+result);
		sc.close();
	}	
}
