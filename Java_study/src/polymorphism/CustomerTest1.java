package polymorphism;

import java.util.*;

public class CustomerTest1 {
	public static void main(String[] args) {
		ArrayList<Customer> cs = new ArrayList<Customer>();
		
		Customer csutomer1 = new Customer(10010, "aaa");
		Customer csutomer2 = new Customer(10020, "bbb");
		Customer csutomer3 = new GOLDCustomer(10030, "ccc");
		Customer csutomer4 = new GOLDCustomer(10040, "ddd");
		Customer csutomer5 = new VIPCustomer(10050, "eee", 12345);
			
		cs.add(csutomer1);
		cs.add(csutomer2);
		cs.add(csutomer3);
		cs.add(csutomer4);
		cs.add(csutomer5);
		
		System.out.println("====== customer Info ======");
		for(Customer c : cs)
			System.out.println(c.showInfo()); 
		System.out.println();
		
		System.out.println("====== point Info ======");
		int price = 10000;
		for(Customer c : cs) {
			System.out.println(c.getCusName()+"님이 " + c.calcPrice(price) + "원 지불 하셨습니다.");
			System.out.println(c.getCusName()+"님의 현재 보너스 포인트는 " + c.bonusPoint + "점입니다.");
			System.out.println();
		}
			
	}
}
