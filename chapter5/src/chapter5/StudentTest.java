package chapter5;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("�̼���");
		studentLee.address = "�Ű�2��";
		//studentLee.studentName = "������";
		//studentLee.studentID = 2; private�� ��� �̷��Դ� �ȵ� ������ �ؿ� �����Ҷ� �Ű������� �־��ټ�������.
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(100, "����");
		//studentKim.studentName = "��ڼ�";
		//studentKim.address = "���";
		
		studentKim.showStudentInfo();
		
		//System.out.println(studentLee);
		//System.out.println(studentKim);
		
	}

}
