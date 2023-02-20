package abstractttt;

public class Add implements Calculator {
	public void calc (int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
}