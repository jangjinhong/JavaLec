package chap02_variables;

public class _01_type {
	public static void main(String[] args) {
		// 1. int형 변수 선언
		int n1;
		
	
		// 2. 초기화
		n1 = 10;
		
		// 3. 출력
		System.out.println("n1: " + n1);
		
		
		// 4. long형 변수 선언 및 초기화
		long ln1 = 100000000L;
		System.out.println("ln1: " + ln1);
		
		
		// 5. short형 변수 연산	-> int형으로 자동 형변환
		short sn1 = 1;
		short sn2 = 2;
		System.out.printf("sn1 + sn2: %d \n", sn1 + sn2);
		
		
		// 6. char 변수 선언 및 초기화
		char ch1 = 'A';
		int ch2 = ch1;
		System.out.println("ch1: " + ch1 + "\t ch2: "+ ch2);
		
		
		// 7. float, double
		float fn1 = 3.14f;
		double dn1 = 3.14;
		
		System.out.printf("fn1: %f \t dn1: %f \n", fn1, dn1);
		
		
		// 8. boolean
		boolean re1 = false;
		boolean re2 = false;
		
		int n2 = 11, n3 = 12;
		
		re1 = n2 % 2 == 0 ? true : false;
		re2 = n3 % 2 == 0 ? true : false;
		
		System.out.println(re1);
		System.out.println(re2);
	}

}


