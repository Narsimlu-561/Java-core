package HYRTutorials;

import java.util.Scanner;

public class sumOfIntegers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array :");
		int arrSize=sc.nextInt();
		int arr[]=new int[arrSize];
		System.out.println("enter the array elements: ");
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];		
		}
		System.out.println("average of integers are: "+sum/arr.length);
		sc.close();
	}

}
