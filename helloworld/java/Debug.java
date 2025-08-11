package helloworld.java;

import java.util.Arrays;
import java.util.Scanner;

public class Debug {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row size in array_1: ");
		int row1Size=sc.nextInt();
		System.out.print("enter column size in array_1: ");
		int col1Size=sc.nextInt();
		int [][]arr1=new int[row1Size][col1Size];
		System.out.println("enter array elements in matrix_1 :");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				arr1[i][j]=sc.nextInt();				
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Input1: "+Arrays.toString(arr1[i]));
		}
		System.out.print("enter row size in array_2 :");
		int row2Size=sc.nextInt();
		System.out.print("enter column size in array_2 :");
		int col2Size=sc.nextInt();
		int [][]arr2=new int[row2Size][col2Size];
		System.out.println("enter array elements in matrix_2 :");
		for(int i=0;i<row2Size;i++) {
			for(int j=0;j<col2Size;i++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr2.length;i++) {
			System.out.println("input 2:"+Arrays.toString(arr2[i]));
		}
		int [][]arr3=new int[arr1.length][];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				if(arr1[i][j]==arr2[i][j])
					arr3[i][j]=1;
					else
						arr3[i][j]=0;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Output: "+ Arrays.toString(arr3[i]));
		}
		sc.close();
	}

}
