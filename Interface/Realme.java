package Interface;

public class Realme implements Mobile{

	public void camera() {
		System.out.println("this is Realme camera");
	}
	public void call() {
		System.out.println("this is Realme call");
	}
	@Override    //this override keyword is not necessary for this place
	public void internet() {
		System.out.println("this is Realme internet");		
	}
	public void gotIT() {
		System.out.println("this is overriding the method VScode");
	}
	
}
