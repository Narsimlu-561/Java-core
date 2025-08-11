package Strings;

import java.util.Scanner;

public class print_lastName_First_follw_comma_and_firstname_1st_letter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first input string :");
		String input1=sc.nextLine();
		System.out.println("enter a second input string :");
		String input2=sc.nextLine();
		System.out.println("Input1 (First Name) :"+input1);
		System.out.println("Input2 (Last Name):"+input2);
		String output=input2+","+input1.charAt(0);
		System.out.println("output :"+output);
		sc.close();
	}

}
