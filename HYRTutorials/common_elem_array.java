package HYRTutorials;
import java.util.Scanner;
import java.util.Arrays;
public class common_elem_array {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter array1 row size: ");
    int row1Size=sc.nextInt();
    System.out.print("enter array1 column size: ");
    int col1Size=sc.nextInt();
    int [][]arr1=new int[row1Size][col1Size];
    System.out.println("enter array1 elements: ");
    for(int i=0;i<arr1.length;i++){
      for(int j=0;j<arr1.length;j++){
        arr1[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<arr1.length;i++){
      System.out.println("Input :"+Arrays.toString(arr1[i]));
    }
    System.out.print("enter array2 row size: ");
    int row2Size=sc.nextInt();
    System.out.print("enter array2 column size: ");
    int col2Size=sc.nextInt();
    int[][] arr2=new int[row2Size][col2Size];
    System.out.println("enter array2 elements: ");
    for(int i=0;i<arr2.length;i++){
      for(int j=0;j<arr2.length;j++){
        arr2[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<arr2.length;i++){
      System.out.println("Input2: "+Arrays.toString(arr2[i]));
    }
    int outputArr[][]=new int[arr1.length][arr1.length];
    for(int i=0;i<outputArr.length;i++){
      for(int j=0;j<outputArr[i].length;j++){
        if(arr1[i][j]==arr2[i][j])
        outputArr[i][j]=1;
        else
        outputArr[i][j]=0;

      }
    }
    System.out.println();
    for(int i=0;i<outputArr.length;i++){
      System.out.println("Output: "+Arrays.toString(outputArr[i]));
    }

    sc.close();
  }
}
