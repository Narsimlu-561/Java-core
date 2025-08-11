package Searching_Algorithm;

import java.util.Arrays;

import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Input Array : "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array : "+Arrays.toString(arr));
		int l=0; //lower
		int h=n-1; //higher
		int flag=0;
		System.out.print("enter searching element: ");
		int search=sc.nextInt();
		while(l<=h) {
			int mid=l+h/2; //mid elem
			if(search==arr[mid]) {
				flag=1;
				break;
			}
			else if(search < arr[mid]){
				h=mid-1;
			}
			else {
				h=mid+1;
			}
		}
		if(flag==0) {
			System.out.println("element Found");
		}
		else {
			System.err.println("element not Found");
		}
		sc.close();
	}

}
