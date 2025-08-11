package Interface;

public class Me {

	public static void main(String[] args) {
		System.out.println("----interface implemented in interface----"); 
		Mobile.eclipse();
//		mobile.intelliJ();  it is not executed because it is not visible. it is private.
		System.out.println("----Realme----");
		Realme realme=new Realme();
		realme.camera();
		realme.call();
		realme.internet();
		realme.VScode();
		System.out.println("----Samsaung----");
		Samsaung samsaung=new Samsaung();
		samsaung.camera();
		samsaung.call();
		samsaung.internet();
		samsaung.VScode();//here we are accessing the VScode method in SAMSAUNG GALAXY class

	}

}
