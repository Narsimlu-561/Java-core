package assignments;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.print("Enter a day:");
		Scanner sc=new Scanner(System.in);
		String day=sc.next();
		switch(day) {
		case "Monday":
			System.out.println("Uff,It's a weekday");
			break;
		case "Tuesday":
			System.out.println("Uff,It's a weekday");
			break;
		case "Wednessday":
			System.out.println("Uff,It's a weekday");
			break;
		case "Thursday":
			System.out.println("Uff,It's a weekday");
			break;
		case "Friday":
			System.out.println("Uff,It's a weekday");
			break;
		case "Saturday":
			System.out.println("Yayy,It's a weekend");
			break;
		case "Sunday":
			System.out.println("Yayy,It's a weekend");
			break;
		default :
			System.err.println("the input is invalid");
		}
		sc.close();
	}
}
