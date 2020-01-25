package staticex;

public class Student {
	
	private static int serialNum = 1000;
	private int studentID; //public -> 접근제어자, private -> 이 변수는 해당 클래스 내에서만 접근 가능(외부접근불가)
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
		address = "주소 없음";
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
		//클래스를 만들고 직접 실행하기 위할때 main생성, 이 안에서도 클래스 선언은 직접해야한다.
		Student studentPark = new Student();
		studentPark.address = "서울";
		studentPark.studentName = "박대범";
		studentPark.showStudentInfo();
	}
*/
}
