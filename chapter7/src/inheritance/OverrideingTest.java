package inheritance;

public class OverrideingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "이순시");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원");
	
		Customer customerNo = new VIPCustomer(10030, "김박수");
		customerNo.bonusPoint = 10000;
		// Customer로 생성되었지만 실질적으로 불리는 메서드는 VIPCustomer의 메서드.
		// 이것이 가상 메서드(Virtual Method), 재정의된(override된) 함수가 호출된다.
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000) + "원");
	}

}
