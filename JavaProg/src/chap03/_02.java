package chap03;

public class _02 {
	public static void main(String[] args) {
		
		int a = 10, b = 6;
		int re = a + b;
		System.out.println(re);
		
		re = a - b;
		System.out.println(re);
		
		re = a * b;
		System.out.println(re);
		
		re = a / b;
		System.out.println(re);
		
		re = a % b;
		boolean bRe = (re < 0) && (re % 2 == 0);
		System.out.println(bRe);
		
	}
}
