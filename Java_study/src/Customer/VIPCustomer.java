package Customer;

public class VIPCustomer extends Customer {				
	private int agentID;					// VIP 고객 담당 상담원 아이디
	double SaleRatio;						// 할인율
	
	public VIPCustomer () {			// [VIP] → 보너스 5% 적립, 항상 10% 할인
		super();
		cusGrade = "VIP";
		bonusRatio = 0.05;				
		SaleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer (int cusID, String cusName) {			
		super(cusID, cusName);
		cusGrade = "VIP";
		bonusRatio = 0.05;				
		SaleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * SaleRatio);
	}

	public int getAgentID() {
		return agentID;
	}
	
    public String showVIPInfo() {
        return super.showInfo() + "담당 상담원 아이디- " + agentID;
    }
}
