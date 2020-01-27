package staticex;

public class CardCompany {
	
	private static CardCompany instance  = new CardCompany();
	private static int serialNum = 10000;
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance  = new CardCompany();
		}
		return instance;
	}
	
	public Card createCard() {
		serialNum++;
		Card card = new Card(serialNum);
		return card;
	}
	
}
