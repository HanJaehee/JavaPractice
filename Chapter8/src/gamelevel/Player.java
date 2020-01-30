package gamelevel;

public class Player {

	PlayerLevel level;
	
	public Player() {
		level = new BegginerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
		
	}
	
	public void play(int count) {
		level.go(count);
	}
}
