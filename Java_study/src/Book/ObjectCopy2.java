package Book;

//깊은 복사
public class ObjectCopy2 {
	public static void main(String[] args) {
		
		Book [] bookArray1 = new Book[3];
		Book [] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("A", "aaa");
		bookArray1[1] = new Book("B", "bbb");
		bookArray1[2] = new Book("C", "ccc");
		
		for(int i=0; i<bookArray2.length; i++) 
			bookArray2[i] = new Book();
		
		for(int i=0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}

		for(int i = 0; i < bookArray2.length; i++)
			bookArray2[i].showBookInfo();
		
		bookArray1[0].setBookName("D");
		bookArray1[0].setAuthor("ddd");
		
		for(int i = 0; i < bookArray2.length; i++)
			bookArray2[i].showBookInfo();
	}
}
