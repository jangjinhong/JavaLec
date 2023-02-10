package chap02_variables;

public class _05 {
	public static void main(String[] args) {
		
		// 강제 형변환
		long longVal = 30000000L;
		int intVal = (int) longVal;
		System.out.println(intVal);
		
		short shortVal = (short)longVal;
		System.out.println(shortVal);
		
		float floatVal = 3.14f;
		intVal = (int)floatVal;
		System.out.println(intVal);
		
		longVal = (long)floatVal;
		System.out.println(longVal);
	}
}
