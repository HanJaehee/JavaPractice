package date;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(31, 12, 2021);
		MyDate date2 = new MyDate(31, 13, 2021);
		
		if(date1.isValid()) {
			System.out.println(" ������ ��¥~");
		}
		else {
			System.out.println(" ��¥ Ʋ����");
		}
		
		if(date2.isValid()) {
			System.out.println(" ������ ��¥~");
		}
		else {
			System.out.println(" ��¥ Ʋ����");
		}
	}

}
