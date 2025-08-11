package Interface;

public class Samsaung implements Mobile{
	public void camera() {
		System.out.println("thiS iS Samsaung camera");	
	}
	public void call() {
		System.out.println("thiS iS Samsaung call");
	}
	@Override  //thiS override keyword iS not neceSSary for thiS place
	public void internet() {
		System.out.println("thiS iS Samsaung internet");	
	}
}
