package chap05_class.calc;

public class Calculator {
	public int num1;
	public int num2;
	private String op;
	int result;
	private int num4;
	
	public Calculator(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	public void calc() {
		switch(op) {
		case "+" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + add());
			break;
			
		case "-" :
			if(num1 > num2)
				System.out.println(num1 + " " + op + " " + num2 + " = " + minus());
			else
				System.out.println(num2 + " " + op + " " + num1 + " = " + minus());
			break;
			
		case "*" :
			System.out.println(num1 + " " + op + " " + num2 + " = " + multiple());
			break;
			
			
		case "/" :
			if(num1 > num2)
				System.out.println(num1 + " " + op + " " + num2 + " = " + divide());
			else
				System.out.println(num2 + " " + op + " " + num1 + " = " + divide());
			break;
			
		default:
			System.out.println("+, -, /, * 중 하나를 입력해 주세요.");
			break;
		}
	}
	
	public int add () {
		return num1 + num2;
	}
	
	public int minus () {
		if (num1 > num2)
			return num1 - num2;
		else
			return num2 - num1;
	}
	
	public long multiple () {
		return num1 * num2;
	}
	
	public double divide () {
		if (num1 > num2)
			return num1 / num2;
		else
			return num2 / num1;
	}
}
