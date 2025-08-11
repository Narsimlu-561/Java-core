package assignments;

import java.util.Arrays;

import java.util.Scanner;

public class mergeArray { 

	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array1 size: ");
		int arr1Size=sc.nextInt();
		
		System.out.println("enter the array elements: ");
		String[] arr1=new String[arr1Size];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.next();
		}
		
		System.out.println("enter array2 size");
		int arr2Size=sc.nextInt();
		
		System.out.println("enter array elements: ");
		String[] arr2=new String[arr2Size];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.next();
		}
		System.out.println("Input 1:"+Arrays.toString(arr1));
		System.out.println("Input 2:"+Arrays.toString(arr2));
		
		String[] arr3=new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[i+arr1.length]=arr2[i];
		}
		System.out.println("Output :"+Arrays.toString(arr3));
		sc.close();
	}

}
