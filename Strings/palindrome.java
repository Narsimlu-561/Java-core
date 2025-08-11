package Strings;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string : ");
		String input=sc.nextLine();
		System.out.println("Input : "+input);
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			rev+=input.charAt(i);
		}
		System.out.println("Reverse : "+ rev);
		if(input.equals(rev))
			System.out.println("it is a Palindrome");
		else
			System.err.println("it is not a Palindrome");
		sc.close();
	}

}
