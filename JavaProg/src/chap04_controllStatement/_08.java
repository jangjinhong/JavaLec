package chap04_controllStatement;

import java.io.IOException;
import java.util.Scanner;

public class _08 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("영문자 하나 입력 >>  ");
		int a = System.in.read();
		
		// 대문자
		if (a >= 65 && a <= 90) {
			for (int i = a; i <= 90; i++) 
				System.out.printf((char)i + " ");	
			System.out.println();
			System.out.println("대문자 -> 소문자 변경 : " + (char)a + " -> " + (char)(a+32));
		}
		
		// 소문자
		else if (a >= 97 && a <= 122) {
			for (int i = a; i <= 122; i++) 
				System.out.printf((char)i + " ");
			System.out.println();
			System.out.println("소문자 -> 대문자 변경 : " + (char)a + " -> " + (char)(a-32));
		}
		
		else
			System.out.println("하나의 영문자를 입력해주세요");
	}
}
