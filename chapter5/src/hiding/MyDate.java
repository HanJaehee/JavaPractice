package hiding;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	private boolean isValid = true;
	
	// private 변수로 해놓고 public 함수로 하는 이유
	//get만 할 수 있는 경우도 있음 -> readonly
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			isValid = false;
		}
		else { this.month = month; }
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void ShowDate() {
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}
		else {
			System.out.println(" 달이 안맞아!");
		}
	}
		
		
}
