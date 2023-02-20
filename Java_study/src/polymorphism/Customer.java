package polymorphism;

public class Customer {
	protected int cusID;						// 고객 아이디
	protected String cusName;			// 고객 이름
	protected String cusGrade;			// 고객 등급
	int bonusPoint;								// 보너스 적립
	double bonusRatio;						// 포인트 적립 비율
	
	public Customer() {		// 기본 : [실버등급, 적립 1%]로 지정
		initCustomer();
	}
	
	public Customer (int cusID, String cusName) {
		this.cusID = cusID;
		this.cusName = cusName;
		initCustomer();
		//System.out.println("Customer() 매개변수 생성자 호출");
	}
	
	// 생성자에서만 호출되므로 private으로 선언
	private void initCustomer() {
		this.cusGrade = "SILVER";
		this.bonusRatio = 0.01;		
		//System.out.println("initCustomer() 생성자 호출");
	}
	
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showInfo() {
		return cusName + "의 등급은 " + cusGrade + ", 포인트는 " + bonusPoint + "입니다.";
	}
	
	public int getCusID() {
		return cusID;
	}

	public void setCusID(int cusID) {
		this.cusID = cusID;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusGrade() {
		return cusGrade;
	}

	public void setCusGrade(String cusGrade) {
		this.cusGrade = cusGrade;
	}
	
}
