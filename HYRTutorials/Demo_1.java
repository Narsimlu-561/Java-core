package HYRTutorials;

import java.util.*;
abstract class Shape{
	int l,b;
	abstract public void area();
	Scanner sc=new Scanner(System.in);
}
class Rectangle extends Shape{
	public void area() {
		System.out.println("enter length and breadth: ");
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("area of Rectangle: "+(l*b));
	}
}
class Triangle extends Shape{
	public void area() {
		System.out.println("enter length and breadth: ");
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("area of Triangle: "+(0.5*l*b));
	}
}
class Circle extends Shape{
	public void area() {
		System.out.println("enter radius: ");
		int r=sc.nextInt();
		System.out.println("area of Circle: "+(3.14*r*r));
	}
}
public class Demo_1 {

	public static void main(String[] args) {
		System.out.println("Rectangle.....");
		Rectangle r=new Rectangle();
		r.area();
		System.out.println();
		System.out.println("Triangle.....");
		Triangle t=new Triangle();
		t.area();
		System.out.println();
		System.out.println("Circle.....");
		Circle c=new Circle();
		c.area();
		System.out.println();
		
	}

}
