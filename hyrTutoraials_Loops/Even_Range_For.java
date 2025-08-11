package hyrTutoraials_Loops;

import java.util.Scanner;

public class Even_Range_For {
	
	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in); 
			System.out.print("Enter Starting Number: ");
			int startNum=input.nextInt();
			System.out.print("Enter ending Number: ");
			int endNum=input.nextInt();
			for(int i=startNum;i<endNum;i++) {
				if(i %2==0)
					System.out.println(i);
		}
		input.close();
		
	}

}
