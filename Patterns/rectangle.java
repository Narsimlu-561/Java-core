package Patterns;
import java.util.Scanner;
public class rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Rectangle");
		System.out.print("enter no. of rows : ");
		int n=sc.nextInt();
		System.out.print("enter no. of columns : ");
		int m=sc.nextInt();
		System.out.println("rectnagle pattern ...");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
