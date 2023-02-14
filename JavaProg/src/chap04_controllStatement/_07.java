package chap04_controllStatement;

import java.util.Scanner;

public class _07 {
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 >>  ");
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) 
			sum += i;
			
		System.out.printf("1부터 %d까지의 합: %d \n", n, sum);
		
	}
}
