package Function_in_JAVA;

import java.util.Scanner;

public class Greatest_of_2Nums {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 2 numbers : ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(Greatest(a,b));
    sc.close();
  }
  public static int Greatest(int a,int b){
    if(a>b){
      return a;
    }else{
      return b;
    }
  }
}
