package chap05_class.calc;

import java.io.IOException;
import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		String op;
		
		System.out.println("피연산자1 입력 >> ");
		n1 = sc.nextInt();
		System.out.println("사칙연산 부호 입력 >> ");
		op = sc.next();
		System.out.println("피연산자2 입력 >> ");
		n2 = sc.nextInt();
		
		Calculator c = new Calculator(n1, n2, op);
		c.calc(); //print result 
	}
}
