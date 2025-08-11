package helloworld.java;

public class Class {
	static int c=200;
	String name="Achiever";
	public static void main(String[] args) {
		System.out.println(c);
		System.out.println(new Class().name);
		//or
		Class n=new Class();
		System.err.println(n.name);
	}

}
