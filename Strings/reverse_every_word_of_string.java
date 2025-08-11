package Strings;

import java.util.*;

public class reverse_every_word_of_string {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string :");
		String input=sc.nextLine();
		System.out.println("input :"+input);
		String[] words=input.split(" ");
		String outputString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			if(i%2==0)
				outputString +=word.toUpperCase();
			else
				outputString +=getReverseString(word);
			
			if(i !=words.length-1)
				outputString +=" ";			
	   }
		System.out.println("output :"+outputString);
		sc.close();
	}
	
	public static String getReverseString(String inputString) {
		String reverseString="";
		for(int j=inputString.length()-1;j>=0;j--) {
			reverseString +=inputString.charAt(j);
		}
		return reverseString;
	}

}
