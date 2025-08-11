package helloworld.java;

import java.util.Scanner;
public class UerInput {
@SuppressWarnings("unused")
public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is your name?:");
		String name=scanner.nextLine();
		System.out.println("Hey , How are you? "+ name);
		String status=scanner.nextLine();
		System.out.println("What is your age ? ");
		int age=scanner.nextInt();
		System.out.println("Thank you for your Information!");
		scanner.close();
	}

}