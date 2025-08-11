package HYRTutorials;

import java.util.Scanner;
public class jagged_Array {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter array Size :");
    int arrSize=sc.nextInt();
    int arr[][]=new int[arrSize][];
    for(int i=0;i<arr.length;i++){
      arr[i]=new int[i+1];
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        arr[i][j]=count++;
      }
    }
    System.out.println("Resultant Jagged Array is : ");
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
    }
}
