package Strings;

import java.util.Scanner;

public class maxLengthWord_in_string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String input=sc.nextLine();
		System.out.println("Input :"+input);
		String[] words=input.split(" ");
		String maxLengthWord=words[0];
		for(int i=0;i<words.length;i++) {
			if(maxLengthWord.length()< words[i].length()) {
				maxLengthWord=words[i];
			}
			
		}
		System.out.println("output :"+maxLengthWord);
		sc.close();

	}

}
