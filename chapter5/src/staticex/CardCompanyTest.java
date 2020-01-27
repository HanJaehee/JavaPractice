package staticex;

public class CardCompanyTest {

	public static void main(String[] args) {
		
		CardCompany company1 = CardCompany.getInstance();
		
		Card MyCard = company1.createCard();
		Card YourCard = company1.createCard();
		
		System.out.println(MyCard.getCardNum());
		System.out.println(YourCard.getCardNum());

	}

}
