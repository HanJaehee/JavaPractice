package array;

import java.util.ArrayList;

public class Student {

	int StudentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.StudentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for( Subject subject : subjectList) {
			total += subject.getScore();
			System.out.println(studentName + "�л��� " + subject.getName() + " ������ ������ " + subject.getScore());
		}
		System.out.println(studentName + "�л��� ������ " + total);
	}
}