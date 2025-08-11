package Encapsulation;

public class Student {
	private int rollno;
	private String name;
	private boolean isPresent;
	Student(int rollno) {
		this.rollno=rollno;
	}
	public void setStudentAttendence(boolean flag) {
		if( !isPresent)
			isPresent=flag;
		System.out.println("teacher assigned the attendence");
	}
	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence");
		return isPresent;
	}
	
	
}
