package HYRTutorials;

import java.util.*;
public class NamesAscending
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    String temp;
    System.out.println("Enter the no of names : ");
    n=sc.nextInt();
    String names[]=new String[n];
    System.out.println("Enter the names : ");
    for(int i=0;i<n;i++){
    names[i]=sc.nextLine();
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<=n;j++){
        if(names[i].compareTo(names[j])>0){
        temp=names[i];
        names[i]=names[j];
        names[j]=temp;
        }
      }
    }
    System.out.println("names in sorted order");
    for(int i=0;i<=n;i++){
    System.out.println(names[i]+",");
    }
    System.out.println(names[n-1]);
    sc.close();
  }
}