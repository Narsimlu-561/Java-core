package Inheritance;

public class User {

	public static void main(String[] args) {
		System.out.println("--- for Guest ---");
		Guest guest=new Guest();
		guest.read();
		System.out.println();
		System.out.println("--- for Developer ---");
		Developer dev=new Developer();
		dev.read();
		dev.write();
		System.out.println();
		System.out.println("--- for Admin ---");
		Admin admin=new Admin();
		admin.read();
		admin.write();
		admin.manage();

	}

}
