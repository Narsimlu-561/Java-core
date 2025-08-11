package HYRTutorials;

import java.util.Arrays; 

import java.util.Scanner;

public class max_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the size of 1st array :");
		int arrSize=sc.nextInt();
		int[] arr=new int[arrSize];
		System.out.println("enter the array elements: ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		int largestNum=arr[0];
		int largestNumIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> largestNum) {
				largestNum=arr[i];
				largestNumIndex=i;
			}
			System.out.println("largest Number :"+largestNum);
			System.out.println("largest Number Index: "+largestNumIndex);
		}
		sc.close();
	}

}
