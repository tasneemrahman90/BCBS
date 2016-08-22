package oop.encapsulation;

public class Student {
	
	private int studentId;
	private String studentName;
	private String ssn;
	private String dob;

	
	public Student(int studentId, String studentName, String ssn, String dob) {
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.ssn = ssn;
		this.dob = dob;
	}
	
	public Student() {
		
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
}
