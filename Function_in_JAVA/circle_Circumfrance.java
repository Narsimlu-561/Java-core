package Function_in_JAVA;
import java.util.Scanner;
public class circle_Circumfrance {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter radius : ");
    float r=sc.nextInt();
    Circumfrance(r);
    sc.close();
  }
  public static double Circumfrance(double r){
    double circumfrance=(2*3.14*r*r);
    return circumfrance;
    // System.out.println("Circumfrance of circle :",circumfrance);
    // return circumfrance;
  }
}
