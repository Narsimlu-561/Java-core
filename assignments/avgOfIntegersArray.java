package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class avgOfIntegersArray {

	/**
	 * 
	 * @param Average of Integers
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int arrSize=sc.nextInt();
		
		System.out.println("enter the array elements:");
		int arr[]=new int[arrSize];
		for(int i=0;i<arrSize;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Input: "+Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println("Output: "+sum/arr.length);//arrSize (or) arr.length
		sc.close();
	}

}
