package HYRTutorials;

import java.util.Scanner;
import java.util.Arrays;
public class sec_largest_num_array {
  public static void sec_largest_num(int []arr){
    int size=arr.length;
    if(size<2){
      System.err.println("Invalid input !");
      return;
    }
    Arrays.sort(arr);
    System.out.println("second largest element is: "+ arr[size-2]);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter array size: ");
    int arrSize=sc.nextInt();
    int []arr=new int [arrSize];
    System.out.println("enter array elements: ");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sec_largest_num(arr);
    
    sc.close();
  }
}
