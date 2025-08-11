package Strings;

import java.util.Scanner;

public class count_words_in_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String text=sc.nextLine();
		String[] words=text.split(" ");
		System.out.println("input :"+text);
		System.out.println("output :"+words.length);
		System.out.println("---words--");
		for(String  s: words) {
			System.out.println(s);
		}
		sc.close();
	}

}            






