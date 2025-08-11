package abstract_Classes;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a message: ");
		int msg=sc.nextInt();
		System.out.println("msg: "+msg);
		sc.close();
	}

}
