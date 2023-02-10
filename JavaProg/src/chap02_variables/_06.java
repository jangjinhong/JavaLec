package chap02_variables;

public class _06 {
	public static void main(String[] args) {
		//
		long longVal = 10000L;
		int intVal = 200;
		
		long result = longVal + intVal;
		System.out.println(result);
		
		//
		int intRe = (int)longVal + intVal;
		System.out.println(intRe);
		
		//
		String strVal = "Hello";
		System.out.println(strVal + intVal);
	}
}
