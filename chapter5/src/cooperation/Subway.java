package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(lineNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money);
	}
}

