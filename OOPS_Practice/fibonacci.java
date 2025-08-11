package OOPS_Practice;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number: ");
		int n=sc.nextInt();
		int firstNum=0,secondNum=1;
		int nextNum;
		for(int i=0;i<n;i++) {
			System.out.print(firstNum+" ");
			nextNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=nextNum;
			
		} 
		
		sc.close();
	}
}
