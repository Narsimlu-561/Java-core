package assignments;

import java.util.Scanner;

public class Print1_100 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num=sc.nextInt();
		int i=0;
		while(i<=num) {
			System.out.println(i);
			i++;
		}
		
		sc.close();	
	}

}
