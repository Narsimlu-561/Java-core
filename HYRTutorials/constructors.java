package HYRTutorials;

public class constructors {
	public int a=10;
	public int i;
	int j;
	public constructors() {
		i = 2;
	    j=15;
	}
	public constructors(int a) {
		System.out.println(a=5);
	}
	public static void main(String[] args) {
		constructors cs=new constructors(10);
		constructors c1=new constructors();
		System.out.println(cs.a);
		System.out.println(c1.mul());
	}
	public int mul() {
		return i*j;
	}
}
