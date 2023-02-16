package Student;

public class StudentTest {
	public static void main (String[] args) {
		Student stuLee = new Student(1001, "Lee");
		stuLee.addSub("국어", 100);
		stuLee.addSub("수학", 50);
		
		Student stuKim = new Student(1002, "Kim");
		stuKim.addSub("국어", 70);
		stuKim.addSub("수학", 85);
		stuKim.addSub("영어", 100);
		stuLee.showBookInfo();
		stuKim.showBookInfo();
	}
} 