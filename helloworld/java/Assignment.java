package helloworld.java;
import java.util.Scanner;
public class Assignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Number: ");
		int n=sc.nextInt();
		n+=5;
		System.out.println(n);
		n-=5;
		System.out.println(n);
		n*=5;
		System.out.println(n);
		n/=5;
		System.out.println(n);
		n%=5;
		System.out.println(n);
		sc.close();
	}
}
