package gamelevel;

public class BegginerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�");
		
	}

	@Override
	public void jump() {
		System.out.println("jump ����");
		
	}

	@Override
	public void turn() {
		System.out.println("Turn ����");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println(" **** �ʱ��� &&&&");
		
	}
	
	
}
