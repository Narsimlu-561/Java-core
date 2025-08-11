package Strings;
import java.util.Scanner;

public class count_chars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input :");
		String text=sc.nextLine();
		System.out.println("input :"+text);
		System.out.println("output :"+text.length());
		sc.close();
	}

}
