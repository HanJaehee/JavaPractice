package chapter5;

public class OrderTest {

	public static void main(String args[]) {
		Order firstOrder = new Order();
		firstOrder.address = "����� �������� ���ȵ� 20����";
		firstOrder.date = "2019�� 7�� 21��";
		firstOrder.Id = "abc123";
		firstOrder.name = "ȫ����";
		firstOrder.orderNum = "201907210001";
		firstOrder.productNum = "PD0345-12";
		
		firstOrder.showOrderInfo();
	}
}
