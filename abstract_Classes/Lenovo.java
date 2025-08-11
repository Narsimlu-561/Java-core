package abstract_Classes;

public abstract class Lenovo implements Laptop {
	public void copy() {
		System.out.println("lenovo cut code");		
	}
	public void paste() {
		System.out.println("lenovo paste code");
	}
	public abstract void cut();
	
	public abstract void keyboard();
}
