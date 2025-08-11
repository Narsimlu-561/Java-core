package Static_and_non_Static;

public class Test_3 {
	static {
		System.out.println("This is static block");
	}
	
	{
		System.out.println("this is non-static block");
	}
	public Test_3() {
		System.out.println("this is constructor");
	}
	public static void main(String[] args) {
		System.out.println("this is main method");

	}

}
