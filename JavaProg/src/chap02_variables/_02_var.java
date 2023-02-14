package chap02_variables;

public class _02_var {

	public static void main(String[] args) {
		var s1 = "hello";
		
		System.out.println(s1);
		System.out.println(s1.getClass().getName());		// 원시타입 변수엔 사용 불가
		System.out.println();
		
		var n1 = 100;
		System.out.println(n1);
		// 원시타입은 wrapper 클래스로 변환 후 클래스 확인 가능
		// 원시타입에는 각각 wrapper 클래스가 존재한다.
		// int → Integer
		// long → Long
		// byte → Byte
		System.out.println(((Object)n1).getClass().getName());
	
		var n2 = 12d;
		System.out.println(n2);
		System.out.println(((Object)n2).getClass().getName());
	}

}
