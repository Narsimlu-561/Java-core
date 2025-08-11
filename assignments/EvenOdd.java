package assignments;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Given number is Odd");
		}
		else {
			System.out.println("Given number is Even");
		}
		sc.close();
	}
}

