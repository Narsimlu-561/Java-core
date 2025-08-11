package HYRTutorials;

import java.util.Scanner;
public class print_ {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter no of rows: ");
    int rowSize=sc.nextInt();
    System.out.print("enter no of columns: ");
    int colSize=sc.nextInt();
    int [][]arr=new int[rowSize][colSize];
    for(int i=1;i<rowSize;i++){
      for(int j=1;j<colSize;j++){
        System.out.printf("%2d ", arr[i][j]);
      }
      System.out.println();
    }
    sc.close();
  }
}
