package Interface;

public class User {

	public static void main(String[] args) {
		System.out.println("----Apple----");
		Apple apple=new Apple();
		apple.copy();
		apple.paste();
		apple.cut();
		apple.keyboard();
		apple.capture();
		System.out.println("----HP----");
		HP hp=new HP();
		hp.copy();
		hp.paste();
		hp.cut();
		hp.keyboard();
		System.out.println("----Lenovo----");
		Lenovo lenovo=new Lenovo();
		lenovo.copy();
		lenovo.paste();
		lenovo.cut();
		lenovo.keyboard();

	}

}
