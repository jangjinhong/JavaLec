package Student;

public class StudentTest {
	public static void main (String[] args) {
		Student1 st = new Student1();
		st.setStuName("jjh");			// st.stuName = "jjh";	-- x
		st.korean.scorePoint = 95;
	}
} 