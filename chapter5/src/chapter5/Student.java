package chapter5;

public class Student {
	
	private int studentID; //public -> ����������, private -> �� ������ �ش� Ŭ���� �������� ���� ����(�ܺ����ٺҰ�)
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address + ", " + studentID);
	}
	
	public String getStudentName() {
		return studentName;
	}
/*
	public static void main(String[] args) {
		//Ŭ������ ����� ���� �����ϱ� ���Ҷ� main����, �� �ȿ����� Ŭ���� ������ �����ؾ��Ѵ�.
		Student studentPark = new Student();
		studentPark.address = "����";
		studentPark.studentName = "�ڴ��";
		studentPark.showStudentInfo();
	}
*/
}
