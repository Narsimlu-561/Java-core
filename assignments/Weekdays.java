package assignments;

import java.util.Scanner;

public class Weekdays {
	public static void main(String[] args) {
		System.out.println("Enter a day:");
		Scanner sc=new Scanner(System.in);
		String day=sc.next();
		if(day.equals("Monday")||day.equals("Tuesday")|| day.equals("Wednessday") 
				|| day.equals("Thursday")|| day.equals("Friday")) {
			System.err.println("Uff,It's a weekday");
		}
		else if(day.equals("Saturday")|| day.equals("Sunday")) {
				System.out.println("Yayy,It's a weekend");
		}
		sc.close();
	}
}
