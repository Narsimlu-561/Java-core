package HYRTutorials;

import java.util.Scanner;
import java.util.Arrays;

public class sum_Of_Integers {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter array size: ");
    int arrSize=sc.nextInt();
    int []arr=new int[arrSize];
    System.out.println("enter array elements: ");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Input :");
    for(int i=0;i<arr.length;i++){
      System.out.print("Input :"+Arrays.toString(arr));
    }
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println("sum of Array Integers are : "+sum);
    //finding te avg of given array
    System.out.println("average of given array is: "+sum/arr.length);
    
    sc.close();
  }
}
