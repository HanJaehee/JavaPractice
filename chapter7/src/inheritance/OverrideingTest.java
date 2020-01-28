package inheritance;

public class OverrideingTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "���ұݾ��� " + priceLee + "��");
		System.out.println(customerKim.showCustomerInfo() + "���ұݾ��� " + priceKim + "��");
	
		Customer customerNo = new VIPCustomer(10030, "��ڼ�");
		customerNo.bonusPoint = 10000;
		// Customer�� �����Ǿ����� ���������� �Ҹ��� �޼���� VIPCustomer�� �޼���.
		// �̰��� ���� �޼���(Virtual Method), �����ǵ�(override��) �Լ��� ȣ��ȴ�.
		System.out.println(customerNo.showCustomerInfo() + "���ұݾ��� " + customerNo.calcPrice(10000) + "��");
	}

}
