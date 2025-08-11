package LabPrograms;

import java.util.*;
abstract class Shape{
	int a,b;
	abstract public void area();
	Scanner sc=new Scanner(System.in);
}
class Rectangle extends Shape{
	public void area() {
		System.out.println("Enter Length and Bridth:");
		int l=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("area of Rectangle:"+(l*b));
	}
}
class Triangle extends Shape{
	public void area() {
		System.out.println("Enter Base and height:");
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("area of Triangle:"+(0.5*b*h));
	}
}
class Circle extends Shape{
	public void area() {
		System.out.println("Enter radius:");
		int r=sc.nextInt();
		System.out.println("area of Circle:"+(3.14*r*r));
	}
}
public class Areas {
	public static void main(String[] args) {
		System.out.println("Rectangle...");
		Rectangle r=new Rectangle();
		r.area();
		System.out.println();
		System.out.println("Triangle...");
		Triangle t=new Triangle();
		t.area();
		System.out.println();
		System.out.println("Circle...");
		Circle c=new Circle();
		c.area();
		System.out.println();
	}
}