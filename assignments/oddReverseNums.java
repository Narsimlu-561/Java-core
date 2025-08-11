package assignments;
import java.util.Scanner;
public class oddReverseNums {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter starting Number: ");
		int startNum=sc.nextInt();
		System.out.print("Enter ending Number: ");
		int endNum=sc.nextInt();
		while(startNum>=endNum) {
			if(startNum%2==1)
				System.out.println(startNum);
			    startNum--;			
		}
		sc.close();
	}
}
