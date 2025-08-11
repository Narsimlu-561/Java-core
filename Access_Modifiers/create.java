package Access_Modifiers;

public class create {
	private int i=100;
	private create() {
		i=i+1;
	}
	protected void getinfo() {
		System.out.println(i);
	}
	private void data() {
		System.out.println(i);
	}
	public static void main(String[] args) {
		create c=new create();
		System.out.println(c.i);
		c.getinfo();
		c.data();
	}
}
