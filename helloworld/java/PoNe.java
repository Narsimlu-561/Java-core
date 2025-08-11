package helloworld.java;

import java.util.Scanner;

public class PoNe {
	public static void main(String[] args) {
		int n;
		System.out.println("enter a number: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0) {
			System.out.println("given number is positive");
		}
		else if(n<0) {
			System.out.println("given number is negative");
		}
		else {
			System.out.println("given number is zero");
		}
		sc.close();		
	}

}
