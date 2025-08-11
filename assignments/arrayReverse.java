package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class arrayReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int arrSize=sc.nextInt();
		
		boolean[] arr=new boolean[arrSize];
		System.out.println("enter array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextBoolean();
		}
		System.out.println("input :"+Arrays.toString(arr));
		boolean[] revArr=new boolean[arr.length];
		for(int i=0;i<revArr.length;i++) {
			revArr[arr.length-i-1]=arr[i];
		}
		System.out.println("reverse of array: "+Arrays.toString(revArr));
		sc.close();
	}

}
