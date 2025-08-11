package Static_and_non_Static;

public class Test_4 {
	int number;
	static {
		System.out.println("static block");
	}
	{
		System.out.println("non-static block");
	}
	public Test_4(){
		System.out.println("constructor");
		number=10; //constructor is not suitable for static block
		           //static fields are initialize at only time 
		           //if you initialize the static variable in this constructor 
		           //for every creation of objects the initialized number will be executed
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Test_4 t4 =new Test_4();
		System.out.println(t4.number);
		// Test_4 t3 =new Test_4();
		// Test_4 t2 =new Test_4();
		// Test_4 t1 =new Test_4();//this is the disadvantage of initialize the variable in 
		                        //the constructor
		                        //thats why you need to put it on static block
	}

}
