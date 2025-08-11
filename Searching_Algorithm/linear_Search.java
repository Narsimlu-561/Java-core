package Searching_Algorithm;
import java.util.Arrays;
import java.util.Scanner;
public class linear_Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("input Array :"+Arrays.toString(arr));
		System.out.print("enter searching element : ");
		int search=sc.nextInt();
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				found=true;
				System.out.println("element found at : "+i+"th index position");
			}
		}
		if(found!=true) {
			System.err.println("element is not found !");
		}
		sc.close();

	}

}
