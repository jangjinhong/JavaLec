package polymorphism;

public class GOLDCustomer extends Customer {
	double SaleRatio;		// 할인율
	
	public GOLDCustomer(int cusID, String cusName) { 
		super(cusID, cusName);
		cusGrade = "GOLD";
		bonusRatio = 0.02;
		SaleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*SaleRatio);
	}
}
