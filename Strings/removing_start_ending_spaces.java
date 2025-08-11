package Strings;

import java.util.Scanner;

public class removing_start_ending_spaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input :");
		String str=sc.nextLine();
		System.out.print("output :"+ str.trim());//it trims the starting and ending white spaces
		sc.close();

	}

}
