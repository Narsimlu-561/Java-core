package HYRTutorials; 
import java.util.Arrays; 
import java.util.Scanner;

public class secondLargestNumber_array {
	
	public static void secondLargest(int []arr) {
		int size=arr.length;
		if(size<2) {
			System.err.println("invalid input! ");
			return;
		}
		Arrays.sort(arr);
		System.out.println("second largest number is: "+arr[size-2]);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size: ");
		int arrSize=sc.nextInt();
		int []arr=new int[arrSize];
		System.out.println("enter array elements: ");

		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		secondLargest(arr);
		
		sc.close();
	}

}
