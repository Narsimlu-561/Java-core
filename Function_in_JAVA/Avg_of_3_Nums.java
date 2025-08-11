package Function_in_JAVA;

import java.util.Scanner;

public class Avg_of_3_Nums {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 3 numbers: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println( Average(a,b,c));
    sc.close();
  }
  public static int Average(int a,int b,int c){
    int avg=(a+b+c)/3;
    return avg;
  }
}
