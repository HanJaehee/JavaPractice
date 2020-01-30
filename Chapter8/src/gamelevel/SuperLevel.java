package gamelevel;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 뜀다");
		
	}

	@Override
	public void turn() {
		System.out.println("멋지게 Trun");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println(" **** 고급자 &&&&");
		
	}
}
