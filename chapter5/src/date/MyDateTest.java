package date;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(31, 12, 2021);
		MyDate date2 = new MyDate(31, 13, 2021);
		
		if(date1.isValid()) {
			System.out.println(" 적절한 날짜~");
		}
		else {
			System.out.println(" 날짜 틀려써");
		}
		
		if(date2.isValid()) {
			System.out.println(" 적절한 날짜~");
		}
		else {
			System.out.println(" 날짜 틀려써");
		}
	}

}
