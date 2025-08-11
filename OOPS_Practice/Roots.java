package OOPS_Practice;

import java.util.*;

public class Roots {
	public static void main(String[] args) {
		double r1,r2;
		System.out.println("enter a,b,c values: ");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=(b*b)-4*a*c;
		if(d==0) {
			System.out.println("roots are real and equal");
			r1=r2=-b/(2*a);
			System.out.println("R1="+r1);
			System.out.println("R2="+r2);
		}
		if(d>0) {
			System.out.println("roots are real and distinct");
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println("R1="+r1);
			System.out.println("R2="+r2);
		}
		else {
			System.out.println("roots are imaginary and distinct");
			double x=-b/(2*a);
			double y=Math.sqrt(-d)/(2*a);
			System.out.println("R1="+x+"+i"+y);
			System.out.println("R2="+x+"-i"+y);
		}
	sc.close();
	}

}
