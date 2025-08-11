package Access_Modifiers;

public class Student {
	public int rollNo=100;
	public Student() {
		rollNo=100+1;
	}
	public void rollNumber() {
		System.out.println(rollNo);
	}
	private void print() {
		System.out.println(rollNo);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.print();
	}
	

}
