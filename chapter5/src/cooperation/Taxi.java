package cooperation;

public class Taxi {

	int money;
	int PassengerCount;
	
	public void take(int money) {
		this.money += money;
		this.PassengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println("�¿� �°��� " + PassengerCount + "�� " + "������ " + money + "�� �Դϴ�.");
	}
}
