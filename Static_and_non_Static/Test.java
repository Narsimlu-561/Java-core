package Static_and_non_Static;

import java.util.Random;

public class Test {
     int number;//give static you'll get the difference
	public static void main(String[] args) {
		Test t1=new Test();
		t1.number=new Random().nextInt();
		
		Test t2=new Test();
		t2.number=new Random().nextInt();
		
		Test t3=new Test();
		t3.number=new Random().nextInt();
		System.out.println(t1.number);
		System.out.println(t2.number);
		System.out.println(t3.number);
//		System.out.println(Test.number); //it is for static
		print();
		Test t4=new Test();
		t4.method();
	}
	public static void print() {
		System.out.println("this is a static method from Test class");
	}
	public void method() {
		System.err.println("this is a non-static method to access non-static we need to create object");
	}

}
