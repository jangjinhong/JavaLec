package polymorphism;

public class VIPCustomer extends Customer {				
	private int agentID;					// VIP 고객 담당 상담원 아이디
	double SaleRatio;						// 할인율
	
	public VIPCustomer () {			// [VIP] → 보너스 5% 적립, 항상 10% 할인
		super();
		cusGrade = "VIP";
		bonusRatio = 0.05;				
		SaleRatio = 0.1;
		agentID = 0000;
		//System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer (int cusID, String cusName, int agentID) {			
		super(cusID, cusName);
		cusGrade = "VIP";
		bonusRatio = 0.05;				
		SaleRatio = 0.1;
		this.agentID = agentID;
		// System.out.println("VIPCustomer() 생성자 호출");
	}
	
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * SaleRatio);
	}
	
	@Override
	public String showInfo() {
		return super.showInfo() + " 담당 상담원 번호는 " + agentID + "입니다.";
	}

    
	public int getAgentID() {
		return agentID;
	}


	
}
