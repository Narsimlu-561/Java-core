package assignments;

import java.util.Scanner;

public class sumOfEvenNums {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter starting Number: ");
		int startNum=sc.nextInt();
		System.out.print("Enter ending Number: ");
		int endNum=sc.nextInt();
		
		int sum=0;
		while(startNum<=endNum) {
			if(startNum%2==0) 
				sum +=startNum;
			startNum  ++;
		}
		System.out.println("sum of even numbers: "+sum);
		sc.close();
	}

}
