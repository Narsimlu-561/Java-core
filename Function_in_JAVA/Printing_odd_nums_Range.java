package Function_in_JAVA;
import java.util.Scanner;
public class Printing_odd_nums_Range {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter starting number :");
    int start=sc.nextInt();
    System.out.println("enter ending number :");
    int end=sc.nextInt();

    System.out.println(OddNumbers_Range(start,end));
    sc.close();
  }
  public static int OddNumbers_Range(int start,int end){
    int sum=0;
    for(int i=start;i<=end;i++){
      if(i%2!=0){
        sum+=start;
      }
    }
    return sum;
  }
}
