package Encapsulation;

public class Test {
	private int rollno;
	private boolean present;
	private String name="something";
	private Test(int rollno) {
		this.rollno=rollno;
	}
	private void setdata(boolean flag) {
		if( !present) 
			present=flag;
		System.out.println("teacher assigned the student attendance");
	}
	private boolean getdata() {
		System.out.println("teacher accessed the student attendance");
		return present;
	}
	public static void main(String[] args) {
		Test t=new Test(100);
		t.setdata(true);
		t.getdata();
		System.out.println(t.name);
		System.out.println(t.rollno);
	}
}
