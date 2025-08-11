package HYRTutorials;
import java.util.Scanner;
public class factorial {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a Number: ");
    int n=sc.nextInt();
    int factorial=1;
    // for(int i=1;i<=n;i++){
    //   factorial=factorial*i;
    // }
    for(int i=n;i>=1;i--){
      factorial=factorial*i;
    }
    System.out.println(factorial);
    sc.close();
  }
}
