package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�");
		
	}

	@Override
	public void jump() {
		System.out.println("���� �ܴ�");
		
	}

	@Override
	public void turn() {
		System.out.println("������ Trun");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println(" **** ������ &&&&");
		
	}
}
