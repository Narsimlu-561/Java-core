package assignments;

import java.util.Scanner;

public class SwitchEevenOdd {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		switch(n%2) {
		case 0:
			System.out.println("Given number is Even");
			break;
		case 1:
			System.out.println("Given number is Odd");
			break;
		default:
			System.err.println("invalid input!");
			break;
		}
		sc.close();
	}
}
