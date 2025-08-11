package HYRTutorials;
import java.util.Scanner;

public class create_array_squares_2D_array {
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
    System.out.println("square of array is :");
    for(int i=0;i<rowSize;i++){
      for(int j=0;j<colSize;j++){
        System.out.print((arr[i][j]=arr[i][j]*arr[i][j])+"  ");
      }
      System.out.println();
    }
    sc.close();
  }
}
