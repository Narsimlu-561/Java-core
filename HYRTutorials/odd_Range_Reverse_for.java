package HYRTutorials;

import java.util.Scanner;

public class odd_Range_Reverse_for {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); 
		System.out.print("Enter Starting Number: ");
		int startNum=input.nextInt();
		System.out.print("Enter ending Number: ");
		int endNum=input.nextInt();
		for(int i=startNum;i>=endNum;i--) {
			if(i %2==1)
				System.out.println(i);
	}
	input.close();
	
}
}
