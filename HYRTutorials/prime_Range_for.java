package HYRTutorials;

import java.util.Scanner;

public class prime_Range_for {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 
		System.out.print("Enter starting Number: ");
		int startNum=sc.nextInt();
		System.out.print("Enter ending Number: ");
		int endNum=sc.nextInt();
		for(int number=startNum;number<endNum;number++) {
			int noOfDividents=0;
			
			if(number !=1 && number!=2) {
				for(int i=1;i<number;i++) {
					if(number%i==0)
						noOfDividents++;
				}
			}
			if(noOfDividents<=2 && noOfDividents !=0)
				System.out.println(number);
		}
	sc.close();
	}
}
