package chapter5;

public class OrderTest {

	public static void main(String args[]) {
		Order firstOrder = new Order();
		firstOrder.address = "서울시 영등포구 여읟동 20번지";
		firstOrder.date = "2019년 7월 21일";
		firstOrder.Id = "abc123";
		firstOrder.name = "홍긿순";
		firstOrder.orderNum = "201907210001";
		firstOrder.productNum = "PD0345-12";
		
		firstOrder.showOrderInfo();
	}
}
