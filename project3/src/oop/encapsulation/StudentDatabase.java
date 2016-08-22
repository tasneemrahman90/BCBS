  package oop.encapsulation;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.setStudentId(100);
		st1.setStudentName("Nahreen");
		st1.setSsn("970-23-9087");
		st1.setDob("07-23-1990");
		System.out.println(st1.getStudentId()+" "+ st1.getStudentName()+" "+st1.getSsn()+" "+ st1.getDob());
		
		Student st2 = new Student();
		st2.setStudentId(101);
		st2.setStudentName("Tanveer");
		st2.setSsn("345-23-4567");
		st2.setDob("08-23-2090");
		System.out.println(st2.getStudentId()+" "+ st2.getStudentName()+" "+st2.getSsn()+" "+ st2.getDob());
		
		Student st3 = new Student(102,"Ghost","425-90-4536", "07-04-1776");
		System.out.println(st3.getStudentId()+" "+ st3.getStudentName()+" "+st3.getSsn()+" "+ st3.getDob());

	}

}
