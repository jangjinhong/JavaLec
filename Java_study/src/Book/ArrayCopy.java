package Book;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		// arraycopy(복사대상배열, 복사할 첫번째 위치, 붙여넣기 배열, 붙여넣기 시작 위치, 복사 요소 개수)
		System.arraycopy (array1, 0, array2, 1, 4);		
		
		for (int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
	}
}
