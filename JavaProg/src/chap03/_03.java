package chap03;

import java.io.IOException;		//자동 import -> <Ctrl> + <Shift> + o

public class _03 {
	public static void main(String[] args) throws IOException {		// 예외처리
		
		int re1 = 10>30? 100 : -100;
		System.out.println(re1);
		
		int re2 = 10>30 ? 70 > 50 ? 200 : -200 : 300;
		System.out.println(re2);
		
		try {
			int num = System.in.read();		// 입력 값의 아스키코드
			System.out.println("num: " + num);
		}
		catch(Exception e) {
			System.out.println("ㅠㅠ");
		}
		
		
		
	}
}
