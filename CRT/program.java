

import java.util.Scanner;

public class program {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the money :");
		int money=sc.nextInt();
		int r2000,r500,r200,r100,r50,r20,r10,r5,r2,r1;
		if(money>=2000) {
			r2000=money/2000;
			if(r2000 !=0)
				System.out.println("2000's :"+r2000);
			r2000=money %2000;
		}
		if(money>=500) {
			r500=money/500;
			if(r500 !=0)
				System.out.println("500's :"+r500);
			r500=money %500;
		}
		if(money>=200) {
			r200=money/200;
			if(r200 !=0)
				System.out.println("200's :"+r200);
			r200=money %200;
		}
		if(money>=100) {
			r100=money/100;
			if(r100 !=0)
				System.out.println("100's :"+r100);
			r100=money %100;
		}
		if(money>=50) {
			r50=money/50;
			if(r50 !=0)
				System.out.println("50's :"+r50);
			r50=money %50;
		}
		if(money>=20) {
			r20=money/20;
			if(r20 !=0)
				System.out.println("20's :"+r20);
			r20=money %20;
		}
		if(money>=10) {
			r10=money/10;
			if(r10 !=0)
				System.out.println("10's :"+r10);
			r10=money %10;
		}
		if(money>=5) {
			r5=money/5;
			if(r5 !=0)
				System.out.println("5's :"+r5);
			r5=money %5;
		}
		if(money>=2) {
			r2=money/2;
			if(r2 !=0)
				System.out.println("2's :"+r2);
			r2=money %2;
		}
		if(money>=1) {
			r1=money/1;
			if(r1 !=0)
				System.out.println("1's :"+r1);
			r1=money %1;
		}	
		sc.close();
	}
}
