package OOPS_Practice;

import java.util.Scanner;

public class fibonacciRe {
	public static int fib(int n) {
		if(n==1|n==2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(fib(i)>=n)
				break;
			else
				System.out.print(fib(i)+" ");
		}
		sc.close();
	}

}
