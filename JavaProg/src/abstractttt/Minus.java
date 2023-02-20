package abstractttt;

public class Minus implements Calculator {
	public void calc(int a, int b) {
		if (a>b)
			System.out.println(a + " - " + b + " = " + (a-b));
		else
			System.out.println(b + " - " + a + " = " + (b-a));
	}

}
