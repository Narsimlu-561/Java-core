package Function_in_JAVA;
import java.util.*;
public class Power_of_a_Number {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter x value : ");
    int x=sc.nextInt();
    System.out.println("enter n value : ");
    int n=sc.nextInt();

    System.out.println(Number_Power(x,n));
    sc.close();
  }
  public static int Number_Power(int x,int n){
    int power=(x*n);
    return power;
  }
}
