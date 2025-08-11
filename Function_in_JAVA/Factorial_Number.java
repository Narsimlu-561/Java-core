package Function_in_JAVA;
import java.util.Scanner;

public class Factorial_Number {

  public static void Factorial(int n){
    if(n <0){
      System.out.println("Invalid number");
      // return;
    }
    int fact=1;
    for(int i=n;i>=1;i--){
      fact=fact*i;
    }
    System.out.println(fact);
    // return;
  }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number : ");
    int n=sc.nextInt();
    Factorial(n);
    sc.close();
  }
}
