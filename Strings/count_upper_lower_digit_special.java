package Strings;

import java.util.Scanner;

public class count_upper_lower_digit_special {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String :");
		String input=sc.nextLine();
		System.out.println("Input :"+input);
		int lowerCaseCount =0;
		int upperCaseCount =0;
		int digitCount=0;
		int specialCharacterCount=0;
		char[] characters=input.toCharArray();
		for (char c : characters) {
			if(Character.isUpperCase(c))
				upperCaseCount++;
			else if(Character.isLowerCase(c))
				lowerCaseCount++;
			else if(Character.isDigit(c))
				digitCount++;
			else
				specialCharacterCount++;
		}
		
		
		System.err.println("---Output---");
		System.out.println("lowerCaseCount :"+lowerCaseCount);
		System.out.println("upperCaseCount: "+upperCaseCount);
		System.out.println("digitCount: "+digitCount);
		System.out.println("specialCharacterCount: "+specialCharacterCount );
		sc.close();

	}

}
