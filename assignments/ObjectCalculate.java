package assignments;

/**
 * it is a documentation comment 
 * it is completely different from single & multi line comments
 * @author Achiever
 * @version 1.0.0
 */
public class ObjectCalculate {
	//the objects are used to allocate the data to the class
	int i;
	int j;
	int bank;
	public ObjectCalculate() {
		/*
		 * the class is a blueprint of objects
		 * in that the entire information about the class is presented
		 * 
		 */
		i=10;
		j=20;
		
	}
	public ObjectCalculate(int i,int j) {
		this.i=i;
		this.j=j;
	}
	public static void main(String[] args) {
		ObjectCalculate obj1=new ObjectCalculate();
		ObjectCalculate obj2=new ObjectCalculate();
		ObjectCalculate obj3=new ObjectCalculate();
		ObjectCalculate obj4=new ObjectCalculate();
		
		System.out.println(obj1.add());
		System.out.println(obj1.sub());
		System.out.println(obj1.mul());
		System.out.println(obj1.dev());
		System.out.println(obj1==obj2);
		System.out.println(obj2==obj3);
		System.out.println(obj3==obj4);	
	}
	public int add() {
		return i+j;
	}
	private int sub() {
		return i-j;
	}
	protected int mul() {
		return i*j;
	}
	public int dev() {
		return i/j;
	}
}
