package gamelevel;

public class BegginerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 못함");
		
	}

	@Override
	public void turn() {
		System.out.println("Turn 못함");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println(" **** 초급자 &&&&");
		
	}
	
	
}
