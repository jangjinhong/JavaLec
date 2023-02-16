package Book;
import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList<Book>lib = new ArrayList<Book>();
		
		// ArrayList class 메소드 :  add() 활용
		lib.add(new Book("A", "aaa"));
		lib.add(new Book("B", "bbb"));
		lib.add(new Book("C", "ccc"));
		
		// ArrayList 길이 : size() 활용
		for (int i = 0; i < lib.size(); i++) {
			Book b = lib.get(i);
			b.showBookInfo();
		}
		
		// 향상된 for문 사용
		for (Book b : lib)
			b.showBookInfo();
	}
}
