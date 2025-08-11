package Strings;

import java.util.Scanner;

public class print_extension_of_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first input string : ");
		String input=sc.nextLine();
		System.out.println("Input : "+input);
		String output=input.substring(input.lastIndexOf(".")+1,input.length());
		System.out.println("Output : "+ output);
		sc.close();
	}

}
