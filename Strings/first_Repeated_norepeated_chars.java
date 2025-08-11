package Strings;

import java.util.Scanner;

public class first_Repeated_norepeated_chars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String input=sc.nextLine();
		char firstNonRepeatedChar=' ';
		char nonRepeatedChar=' ';
		for(int i=0;i<input.length();i++) {
			char tempChar=input.charAt(i);
			if(tempChar !=' ') {
				if(input.indexOf(tempChar)==input.lastIndexOf(tempChar)) {
					if(firstNonRepeatedChar ==' ')
						firstNonRepeatedChar=tempChar;
				}
				else if(nonRepeatedChar==' ')
					nonRepeatedChar=tempChar;
				if(firstNonRepeatedChar !=' '&& nonRepeatedChar !=' ')
					break;
				
			}
		}
		System.out.println("Output :");
		System.out.println("firstNonRepeatedChar :"+firstNonRepeatedChar);
		System.out.println("RepeatedChar :"+nonRepeatedChar);
		sc.close();

	}

}
