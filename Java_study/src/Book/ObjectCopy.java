package Book;

// 얉은 복사
public class ObjectCopy {
	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("A", "aaa");
		bookArray1[1] = new Book("B", "bbb");
		bookArray1[2] = new Book("C", "ccc");
		
		System.arraycopy (bookArray1, 0, bookArray2, 0, 3);
		
		
		for(int i=0; i<bookArray2.length; i++)
			bookArray2[i].showBookInfo();
		
		System.out.println("====================");
		
		
	// [0] 원소 변경 후,  bookArray2 배열 출력
		bookArray1[0].setBookName("D");
		bookArray1[0].setAuthor("ddd");
		
		for(int i=0; i<bookArray2.length; i++)
			bookArray2[i].showBookInfo();
		
		
		
	}
}