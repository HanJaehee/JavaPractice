package chapter5;

public class Order {
	String orderNum;
	String Id;
	String date;
	String name;
	String productNum;
	String address;
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ��ȣ : " + orderNum);
		System.out.println("�ֹ��� ���̵� : " + Id);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ��� �̸� : " + name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + productNum);
		System.out.println("��� �ּ� : " + address);
		
	}
}
