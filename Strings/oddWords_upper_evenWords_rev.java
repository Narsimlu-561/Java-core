package Strings;

import java.util.Scanner;

public class oddWords_upper_evenWords_rev {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input string :");
		String input=sc.nextLine();
		String[] words=input.split(" ");
		String outputString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			if(i%2==0) 
				outputString +=word.toUpperCase()+" ";
			else
				outputString += getReverseString(word)+" ";
		}
		System.out.println("output : "+outputString);
		sc.close();

	}

	private static String getReverseString(String inputString) {
		String reverseString="";
		for(int j=inputString.length()-1;j>=0;j--) {
			reverseString +=inputString.charAt(j);
		}
		return reverseString;
	}

}
