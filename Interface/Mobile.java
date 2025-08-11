package Interface;

public interface Mobile {
	
	public void camera();
	
	public void call();
	
	public void internet();
	
	default void VScode() {
		System.out.println("this is a default method");
	}
	static void eclipse() {
		intelliJ();
		System.out.println("this is a static method");
	}
	private static void intelliJ() {
		
		System.out.println("this is a private method used for code repitition");
	}
}
