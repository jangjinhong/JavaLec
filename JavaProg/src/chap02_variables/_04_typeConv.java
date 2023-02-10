package chap02_variables;

public class _04_typeConv {

	public static void main(String[] args) {
		byte bVal = 10;
		char chVal = 'A';
		int intVal = bVal;
		
		System.out.println(intVal);
		
		intVal = chVal;
		System.out.println(intVal);
		
		float fVal = intVal;
		System.out.println(fVal);
	}

}
