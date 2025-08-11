package abstract_Classes;

public abstract class Realme implements Mobile{

	@Override
	public void copy() {
		System.out.println("Realme copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Realme paste code");
		
	}
	abstract public void cut();
	
	abstract public void keyboard();
	
}
