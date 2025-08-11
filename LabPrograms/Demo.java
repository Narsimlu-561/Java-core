package LabPrograms;

class parent{
	int a=10;
	void display() {
		System.out.println("Parent");
	}
}
class child extends parent{
	int b=20;
	void show() {
		System.out.println("Child");
	}
}
public class Demo {
	public static void main(String[] args) {
		child obj=new child();
		obj.display();
		System.out.println(obj.a);
		obj.show();
		System.out.println(obj.b);
	}
}
