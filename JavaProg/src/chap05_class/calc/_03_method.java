package chap05_class.calc;

public class _03_method {
	static int sum;
	
	public static void main(String[] args) {
		int addResult = add(1, 2);
		System.out.println(addResult);	
		
		add (5, 6, 7);
		System.out.println(sum);	
		
		long mulResult = multiple(1, 2);
		System.out.println(mulResult);
		
		multiple(5, 6, 7);
		System.out.println(sum);
	}
	
	 public static int add(int a, int b) {
		return a+b;
	}

	 public static void add(int a, int b, int c) {
		sum = a+b+c;
	}
	 
	 public static long multiple (int a, int b) {
		 return a*b;
	 }
	 
	 public static void multiple (int a, int b, int c) {
		 sum = a*b*c;
	 }
}