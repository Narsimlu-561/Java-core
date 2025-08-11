package assignments;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=sc.nextInt();
		boolean isPrime=true;
		if(number !=1) {
			int i=2;
			while(i<number) {
				if(number %i==0) {
					isPrime=false;
					break;
				}
				i++;
			}
			if (isPrime)
				System.out.println("Given number is a Prime number");
			else
				System.err.println("Given number is Not a Prime number !!!");
		}
		else
			System.err.println("Given number is Not a Prime number !!!");
		sc.close();
	}
}