package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("이순신");
		studentLee.address = "신곡2동";
		//studentLee.studentName = "이진박";
		//studentLee.studentID = 2; private일 경우 이렇게는 안됨 하지만 밑에 생성할때 매개변수로 넣어줄수는있음.
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "김배기");
		//studentKim.studentName = "김박수";
		//studentKim.address = "평양";
		
		studentKim.showStudentInfo();
		
		//System.out.println(studentLee);
		//System.out.println(studentKim);
		
	}

}
