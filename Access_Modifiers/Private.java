package Access_Modifiers;

public class Private {
	private int i=20;
	private Private() {
		i=i+5;
	}
	private void info() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Private p=new Private();
		p.info();
		System.out.println(p.i);
		p.print();
	}
	private void print()
	{
		System.out.println("this is private method");
	}
}
