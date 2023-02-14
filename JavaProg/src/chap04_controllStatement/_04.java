package chap04_controllStatement;

import java.io.IOException;

public class _04 {
	public static void main(String[] args) throws IOException {

		int n = System.in.read();
		
		if (n >= 65 && n <= 90) {
			if((char)n == 'Q')
				System.out.println("종료");
			else 
				System.out.println("입력 값: " + (char)n);
		}
		else 
			System.out.println("알파벳 대문자만 입력해주세요.");
		
	}
}
