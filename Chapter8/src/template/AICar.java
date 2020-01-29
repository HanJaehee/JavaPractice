package template;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차 스스로 주행");
	}
	
	@Override
	public void stop() {
		System.out.println("스탑");
	}
}
