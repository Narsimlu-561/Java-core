package helloworld.java;

import java.util.Objects;

import java.util.Scanner;

public class Interview {
	public static void main(String[] args) {
		System.out.println("what is your exam status?");
		Scanner sc=new Scanner(System.in);
		String examStatus=sc.nextLine();
		if(Objects.equals(examStatus,"pass")) {
			System.out.println("wait for further rounds");
			System.out.println("what is your round1 status?");
			String round1=sc.nextLine();
			if(Objects.equals(round1,"pass")) {
				System.out.println("you have cleared round1, please wait for round2");
				System.out.println("what is your round2 status?");
				String round2=sc.nextLine();
				if(Objects.equals(round2,"pass")) {
					System.out.println("you have cleared round2, please wait for HR round");
					System.out.println("what is your HRround status?");
					String HRround=sc.nextLine();
					if(Objects.equals(HRround,"pass")) {
					System.out.println("Congratulations you got the job!!!");		
			}
			else {
			    System.err.println("we'll get back to you!");
		}
					
		}
		else {
			System.err.println("we'll get back to you!");
		}
     }
		else {
			System.err.println("we'll get back to you!");
  } 
			
   }
		else {
			System.err.println("we'll get back to you!");
	     }
		sc.close();
	}
	}
