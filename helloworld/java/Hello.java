package helloworld.java;

public class Hello {
	static // class variables ->static fields *we can access the variables through out the program
	int id=502;
	public static void main(String[] args) {
		System.out.println(id);
//		test1();
//		test2();
	}
	public static void test1() {
		System.out.println(id);
	}
	public static void test2() {
		System.out.println(id);
	}
}
