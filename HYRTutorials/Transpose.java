package HYRTutorials;

import java.util.Arrays;
import java.util.Scanner;
public class Transpose {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the row size of array: ");
    int rowSize=sc.nextInt();
    System.out.print("enter the column size of array: ");
    int colSize=sc.nextInt();
    int arr[][]=new int[rowSize][colSize];
    System.out.println("enter the array elements: ");
    for(int i=0;i<rowSize;i++){
      for(int j=0;j<colSize;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println("Input: "+Arrays.toString(arr[i]));
    }
    System.out.println("Output: ");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length;j++){
        System.out.print(arr[j][i]+" ");
      }
      System.out.println();
    }
    for(int j=0;j<arr.length;j++){
      System.out.println("Output: "+Arrays.toString(arr[j]));
    }
    sc.close();
  }
}
