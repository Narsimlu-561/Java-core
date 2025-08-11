package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class maxElement_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int arrSize=sc.nextInt();
		System.out.println("enter array elements: ");
		int[] arr=new int[arrSize];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int largestNumber=arr[0];
		int largestNumIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largestNumber) {
				largestNumber=arr[i];
				largestNumIndex=i;
			}
		}
		System.out.println("value: "+largestNumber);
		System.out.println("index: "+largestNumIndex);
		sc.close();
	}

}
