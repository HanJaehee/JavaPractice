package staticex;

public class Student {
	
	private static int serialNum = 1000;
	private int studentID; //public -> ����������, private -> �� ������ �ش� Ŭ���� �������� ���� ����(�ܺ����ٺҰ�)
	public String studentName;
	public String address;
	
	public Student(String name) {
		studentName = name;
		serialNum++;
		this.studentID = serialNum;
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNum++;
		this.studentID = serialNum;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address + ", " + studentID);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return this.studentID;
	}
	
	public static int getSerialNum() {
		return serialNum;
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
