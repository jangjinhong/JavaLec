package chap04_controllStatement;

import java.io.IOException;

public class _01 {
	public static void main(String[] args) throws IOException {
		
		int a = System.in.read();
		
		if (a >= 65 && a<= 90) 
			System.out.printf("대문자입니다. 소문자로 변경: %c", (char)a+32);
		else if (a >= 97 && a<= 122) 
			System.out.printf("소문자입니다. 대문자로 변경: %c", (char)a-32);
		else
			System.out.println("알파벳 대/소문자만 입력해주세요.");
		
	}
}
