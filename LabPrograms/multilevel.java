package LabPrograms;
class A{
	int a=15;
	void show() {
		System.out.println("Grand parent");
	}
}
class B extends A{
	int b=10;
	void display() {
		System.out.println("Parent");
	}
}
class C extends B{
	int c=5;
	void show2() {
		System.out.println("Child");
	}
}
public class multilevel {
	public static void main(String[] args) {
		C obj=new C();
		System.out.println(obj.a);
		obj.show();
		System.out.println(obj.b);
		obj.display();
		System.out.println(obj.c);
		obj.show2();
	}

}
