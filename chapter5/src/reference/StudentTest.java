package reference;

public class StudentTest {
	public static void main(String args[]) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("����", 79);
		studentLee.setMathSubject("����", 100);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("����", 120);
		studentKim.setMathSubject("����", 101);
	
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}
}
