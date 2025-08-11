package assignments;
import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		System.out.print("Enter a day:");
		Scanner sc=new Scanner(System.in);
		String day=sc.next();
		switch(day) {
		case "Monday":
		case "Tuesday":
		case "Wednessday":
		case "Thursday":
		case "Friday":
			System.out.println("Uff,It's a weekday");
			break;
		case "Saturday":
		case "Sunday"  :
			System.out.println("Yayy,It's a weekend");
			break;
		default :
			System.err.println("the input is invalid");
		}
		sc.close();
	}
}
                       

