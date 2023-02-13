package chap03;

import java.io.*;

public class _04 {
	public static void main(String[] args) throws IOException{

		System.out.print("영문자 1개 입력: ");
		int a = System.in.read();
		
		// 대．소문자 판별
		System.out.println(	 a >= 65 && a <= 90 ? "대문자입니다." : 
			a >= 97 && a <= 122 ? "소문자입니다." : "잘못입력했습니다." );
		
		// 대문자->소문자,  소문자->대문자 변경
		System.out.println(	 a>=65 && a <= 90? (char)(a+32) : 
			a >= 97 && a <= 122? (char)(a-32 ) : "잘못입력했습니다." );
	}

}
