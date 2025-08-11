package hyrTutoraials_Loops;

import java.util.Scanner;

public class Print1_100ForLoop {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter starting Number: ");
			int startNum=sc.nextInt();
			System.out.print("Enter ending Number: ");
			int endNum=sc.nextInt();
			int i;
			for(i=startNum;i<endNum;i++) {
				System.out.println(i);
			}
			
			sc.close();
		}
	}
}
