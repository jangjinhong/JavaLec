package chap02_variables;

public class _03_const {
	public static void main(String[] args) {
		
		// 1. 상수 선언
		final int COUNT_MONTHS = 12;
		final int COUNT_DAYS_WEEK = 7;
		final double PI = 3.14;
		final int MAX_VALUE;
		
		// 2. 상수 선언 후 초기화
		MAX_VALUE = 100;
		System.out.println(MAX_VALUE);
		
		
		System.out.println("1년은 " + COUNT_MONTHS + "개월입니다.");
		System.out.println("일주일은 " + COUNT_DAYS_WEEK + "일입니다.");
		System.out.println("반지름이 2인 원의 넓이는 " + 2*2*PI + "입니다.");
		System.out.println("반지름이 3인 원의 둘레는 " + 3*PI + "입니다.");
		
		
		/*
		 * !
		 * 상수 선언 및 초기화, 선언 후 초기화 가능
		 * 상수 재할당 불가능
		*/
		
	}
}
