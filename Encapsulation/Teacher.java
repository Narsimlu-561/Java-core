package Encapsulation;

public class Teacher {

	public static void main(String[] args) {
		Student s=new Student(101);
		System.out.println("student is present");
		s.setStudentAttendence(true);
		s.getStudentAttendence();
	}

}
