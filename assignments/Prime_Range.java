package assignments;

import java.util.Scanner;

public class Prime_Range {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter starting number: ");
		int startNumber=sc.nextInt();
		
		System.out.print("Enter ending number: ");
		int endNumber=sc.nextInt();
		
		int number=startNumber;
		while(number<=endNumber) {
			boolean isPrime=true;
			if(number!=1 && number!=2) {
				int i=2;
				while(i<number) {
					if(number %i==0) {
						isPrime=false;
						break;
					}
					i++;
				}				
			}
			else
				isPrime=false;
			if(isPrime)
				System.out.println(number);
			number++;
		}
		sc.close();
	}
}
