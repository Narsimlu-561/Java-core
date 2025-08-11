package Strings;

import java.util.Scanner;

public class string_reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input :");
		String str=sc.nextLine();
		System.out.print("output :");
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {    //reversing the string
			rev+=str.charAt(i);
		}
		System.out.println(rev);
		System.out.println("-----palindrome checking-----");
		if(str.equals(rev)) 
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
		sc.close();

	}

}
