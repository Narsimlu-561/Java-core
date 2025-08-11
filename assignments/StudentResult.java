package assignments;

import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
		System.out.println("Enter your Marks: ");
		int marks;
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>85) {
			System.out.println("Student Secured first class");
		}
		else if(marks<=85 && marks>=70) {
				System.out.println("Student Secured second class");
		}
		else if(marks<=70 && marks>=35) {
			System.out.println("Student Secured third class");
		}	                     
		else if (marks==35) {
			System.out.println("Pass");
		}
		else {
			System.err.println("Student is Failed!");
		}
		sc.close();
	}
}
