package assignments;

import java.util.Scanner;

public class minElement_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int arrSize=sc.nextInt();
		System.out.println("enter array elements: ");
		String[] arr=new String[arrSize];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		String minLengthWord=arr[0];
		int minLengthWordIndex=0;
		for (int i = 0; i < arr.length; i++) {
			if(minLengthWord.length()>arr[i].length()) {
				minLengthWord=arr[i];
				minLengthWordIndex=i;
			}
		}
		System.out.println("min length word: "+minLengthWord);
		System.out.println("min length index: "+minLengthWordIndex);
		sc.close();
   }

}
