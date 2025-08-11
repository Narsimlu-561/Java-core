package Inheritance;

public class Test {

	public static void main(String[] args) {
		Child c=new Child();
		c.child();
		c.me();
		
		Parent p=new Parent();
		p.parent();
		p.child();

	}

}
