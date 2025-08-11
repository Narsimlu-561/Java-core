package HYRTutorials;

import java.util.Scanner;

public class prime_for {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a Number: ");
		int number=sc.nextInt();
		int noOfDividents=0;
		if(number !=1 && number!=2) {
			for(int i=1;i<number;i++) {
				if(number %i==0) 
					noOfDividents++;
			}
		}
		if(noOfDividents >2 || noOfDividents==0) {
				System.err.println("Given number is not a prime number!!!");
			}
		else
			System.out.println("Given number is a prime number");
	sc.close();
	}
}
