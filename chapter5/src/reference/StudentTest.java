package reference;

public class StudentTest {
	public static void main(String args[]) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKoreaSubject("국어", 79);
		studentLee.setMathSubject("수학", 100);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKoreaSubject("국어", 120);
		studentKim.setMathSubject("수학", 101);
	
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}
}
