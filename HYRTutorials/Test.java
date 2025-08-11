package HYRTutorials;
/**
 * it is a documentation comment 
 * it is completely different from single & multi line comments
 * @author Achiever
 * @version 1.0.0
 */
public class Test {
	int a;
	int b;
	public Test() {
		a=10;
		b=10;
	}
	protected Test(int a,int b) {
		this.a=a;
		this.b=b;	
		
	}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test(50,20);
		Test t3=new Test(40,5);
		Test t4=new Test(80,2);
		System.out.println(t1.add());
		System.out.println(t2.sub());
		System.out.println(t3.mul());
		System.out.println(t4.dev());
		
		System.out.println(t1==t2);
		System.out.println(t2==t3);
		System.out.println(t3==t4);
		System.out.println("we can use Public, Private, protected while creating an object or a constructor");
//		System.out.println(t1.hashCode());
//		System.out.println(t2.hashCode());
//		System.out.println(t3.hashCode());
		
	}
	/**
	 * 
	 * @return it returns the calculations based on our input
	 */
	/**
	 * @param passing parameters
	 *
	 */
	protected int add() {
		return a+b;
	}
	protected int sub() {
		return a-b;
	}
	protected int mul() {
		return a*b;
	}
	private int dev() {
		return a/b;
	}
	

}
