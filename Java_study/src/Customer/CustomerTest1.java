package Customer;

public class CustomerTest1 {
	public static void main(String[] args) {
		
		Customer cus1 = new Customer();
		cus1.setCusID(10010);
		cus1.setCusName("이순신");
		cus1.bonusPoint = 1000;
		
		Customer Vcus1 = new VIPCustomer(10020, "김유신", 12345);
		Vcus1.bonusPoint = 10000;
		
		System.out.println(cus1.showInfo());
		System.out.println(((VIPCustomer) Vcus1).getAgentID());
		
		
		System.out.println("=================");
		int bag = 100000;
		System.out.println(cus1.getCusName() + "이 지불해야하는 값: " + cus1.calcPrice(bag));
		System.out.println(Vcus1.getCusName() + "이 지불해야하는 값: " + Vcus1.calcPrice(bag));
	}
}
