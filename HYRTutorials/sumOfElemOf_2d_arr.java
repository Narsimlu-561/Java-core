package HYRTutorials;

import java.util.Scanner;
import java.util.Arrays;
public class sumOfElemOf_2d_arr {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the row size: ");
    int rowSize=sc.nextInt();
    System.out.print("enter the column size: ");
    int colSize=sc.nextInt();
    int [][]arr=new int [rowSize][colSize];
    System.out.println("enter array elements : ");
    for(int i=0;i<rowSize;i++){
      for(int j=0;j<colSize;j++){
        arr[i][j]=sc.nextInt();
      } 
    }
    for(int i=0;i<arr.length;i++){
      System.out.println("Input :"+ Arrays.toString(arr[i]));
    }

    int sum=0;
    for(int i=0;i<rowSize;i++){
      for(int j=0;j<colSize;j++){
        sum+=arr[i][j];
      }
    }
    System.out.println("sum of elements are : "+sum);
    sc.close();
  }
}
