package assignments;
import java.util.Scanner;
public class range1_100 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting Number: ");
		int startNum=sc.nextInt();
		System.out.println("Enter ending Number: ");
		int endNum=sc.nextInt();
		while(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
		}
		
		sc.close();	
	}

}

