package car;

public class Genesis extends Car{
	
	String carName = "Genesis";
	
	@Override
	public void start() {
		System.out.println(carName + "�õ��� �մϴ�.");
	}

	@Override
	public void drive() {
		System.out.println(carName + "�޸��ϴ�.");
		
	}

	@Override
	public void stop() {
		System.out.println(carName + "����ϴ�.");
		
	}

	@Override
	public void turnoff() {
		System.out.println(carName + "�õ������ϴ�.");
		
	}

}
