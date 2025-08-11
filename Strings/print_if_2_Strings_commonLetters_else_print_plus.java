package Strings;

import java.util.Scanner;

public class print_if_2_Strings_commonLetters_else_print_plus {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first input string :");
		String input1=sc.nextLine();
		System.out.println("enter a second input string :");
		String input2=sc.nextLine();
		System.out.println("Input1 :"+input1);
		System.out.println("Input2 :"+input2);
		String output="";
		for(int i=0;i<input1.length();i++) {
			char tempChar=input1.toLowerCase().charAt(i);
			if(input2.toLowerCase().indexOf(tempChar) >=0) 
				output +=input1.charAt(i);
			else
				output+='+';
		}
		System.out.println("Output "+output);
			
		sc.close();
	}

}
