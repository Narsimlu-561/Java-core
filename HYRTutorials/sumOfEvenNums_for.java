package HYRTutorials;

import java.util.Scanner;

public class sumOfEvenNums_for {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); 
		System.out.print("Enter Starting Number: ");
		int startNum=input.nextInt();
		System.out.print("Enter ending Number: ");
		int endNum=input.nextInt();
		int sum=0;
		for(int number=startNum;number<=endNum;number++) {
			if(number%2==0) 
				sum +=number;
	   }
		System.out.println("Sum is: "+sum);
	input.close();
	
}
}
