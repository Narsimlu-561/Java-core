package Function_in_JAVA;
import java.util.Scanner;
public class Multiplication_of_Two_nums {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two numbers :");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println(Multiplication(a,b));
    sc.close();
    
  }
  public static int Multiplication(int a,int b){
    return a*b;
  }
}
