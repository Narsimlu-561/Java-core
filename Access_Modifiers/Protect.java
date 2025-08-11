package Access_Modifiers;

public class Protect {
	protected int i=100;
	protected Protect() {
		i=i+5;
	}
	protected void data() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		Protect p=new Protect();
		p.data();
		System.out.println(p.i);
	}
}
