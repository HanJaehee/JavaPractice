package cooperation;

public class Taxi {

	int money;
	int PassengerCount;
	
	public void take(int money) {
		this.money += money;
		this.PassengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println("태운 승객은 " + PassengerCount + "명 " + "수입은 " + money + "원 입니다.");
	}
}
