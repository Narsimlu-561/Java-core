package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class create_string_at_even_position_in_given_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String input=sc.nextLine();
		System.out.println("input :"+input);
		
		String[] words=input.split(" ");
		String[] outputArr=new String[words.length/2];
		int index=0;
		for(int i=0;i<words.length;i++) {
			if(i%2 !=0) {
				outputArr[index]=words[i];
				index++;
			}
		}
		System.out.println("output array :"+Arrays.toString(outputArr));
		sc.close();

	}

}
