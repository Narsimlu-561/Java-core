package Function_in_JAVA;
import java.util.Scanner;
public class Vote {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your age : ");
    int age=sc.nextInt();
    Eligibility(age);
    sc.close();
  }
  public static void Eligibility(int age){
    if(age >=18){
      System.out.println("Eligible to vote");
    }else{
      System.out.println("Not eligible to vote!");
    }
  }
}
