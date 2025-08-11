package Function_in_JAVA;

import java.util.Scanner;

public class Numbers_Checking {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter a number: ");
    while(true){
      int n=sc.nextInt();
      if(n >0){
        System.out.println("Number is positive");
      }else if(n< 0){
        System.out.println("Number is negative");
      }else{
        System.out.println("Number is zero");
      }
      System.out.println("Do you want to exit ? press '1'");
      int choice=sc.nextInt();
      if(choice==1)
        break;
    }
    sc.close();
  }
}
