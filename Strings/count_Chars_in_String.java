package Strings;
import java.util.Scanner;
public class count_Chars_in_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String str=sc.nextLine();
		System.out.println("enter target character :");
		char targetChar=sc.next().charAt(0);
		System.out.println("input :"+str);
		System.out.println("taget character :"+targetChar);
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==targetChar) {
				count++;
			}
		}
		System.out.println("output :"+ count);
		sc.close();

	}

}
