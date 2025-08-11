
import java.util.Scanner;
public class bigOne {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter 2 numbers :");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int big2=(a>b)?a:b;
	    System.err.println(big2);
	    sc.close();
	 }
}

