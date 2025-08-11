package HYRTutorials;
import java.util.Arrays;
import java.util.Scanner;

public class addMatrix_2Darray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the row size: ");
    int row1Size=sc.nextInt();
    System.out.print("enter the column size: ");
    int col1Size=sc.nextInt();
    int [][]arr1=new int [row1Size][col1Size];
    System.out.println("enter 1st array elements : ");
    for(int i=0;i<row1Size;i++){
      for(int j=0;j<col1Size;j++){
        arr1[i][j]=sc.nextInt();
      }
    }
   
    System.out.print("enter the row size: ");
    int row2Size=sc.nextInt();
    System.out.print("enter the column size: ");
    int col2Size=sc.nextInt();
    int [][]arr2=new int [row2Size][col2Size];
    System.out.println("enter 2nd array elements : ");
    for(int i=0;i<row2Size;i++){
      for(int j=0;j<col2Size;j++){
        arr2[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<arr1.length;i++){
      System.out.println("Input :"+ Arrays.toString(arr1[i]));
    }
    for(int i=0;i<arr2.length;i++){
      System.out.println("Input :"+ Arrays.toString(arr2[i]));
    }
    {
      int arr3[][]=new int[arr1.length][];
      for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
          System.out.print(arr1[i][j]+arr2[i][j] +"  ");
        }
        System.out.println();
      }
      System.out.println(arr3);
    }
    sc.close();
  }
}
