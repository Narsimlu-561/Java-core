package HYRTutorials;

import java.io.*;
public class Student
{
  String hno,name,dept;
  public Student()
  {
    hno=name=dept="no value";
  }
  public void read_data(String h,String n,String d)
  {
    hno=h;
    name=n;
    dept=d;
  }
  public void display(){
    System.out.println(hno+"  "+name+"  "+dept);
  }
  public static void main(String args[])throws Exception
  {
    String h,n,d;
    int no;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter no of Records of a Student");
    no=Integer.parseInt(br.readLine());
    Student[] s=new Student[no];
    for(int i=0;i<s.length;i++){
      System.out.println("Student Record "+(i+1)+":");
      s[i]=new Student();
      System.out.println("enter hall Ticket number");
      h=br.readLine();
      System.out.println("enter student name");
      n=br.readLine();
      System.out.println("enter student dept");
      d=br.readLine();
      s[i].read_data(h,n,d);
    }
    System.out.println("HNO"+"\t"+"NAME"+"\t"+"DEPT");
    for(int i=0;i<s.length;i++){
      s[i].display();
    }
  }
}