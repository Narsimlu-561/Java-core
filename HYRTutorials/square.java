package HYRTutorials;

import java.util.Scanner;
public class square {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers: ");
    int x=sc.nextInt();
    int y=sc.nextInt();
    System.out.println("Squares are: "+(x*y));
    sc.close();
  }
}
