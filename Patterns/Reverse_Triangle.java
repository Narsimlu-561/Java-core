package Patterns;

public class Reverse_Triangle {
  public static void main(String[] args) {
    int n=5;
    for(int i=n-1;i>=0;i--){
      for(int j=0;j<n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
