package gamelevel;

public class AdvancedLevel extends PlayerLevel{
	
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
		System.out.println("Turn 못함");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println(" **** 중금자 &&&&");
		
	}
}
