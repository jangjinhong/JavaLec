package Student;

public class Student1 {
	int stuID;
	private String stuName;
	Subject korean;
	Subject math;
	
	public int getStuID() {
		return stuID;
	}

	public void setStuID(int stuID) {
		this.stuID = stuID;
	}

	public Subject getKorean() {
		return korean;
	}

	public void setKorean(Subject korean) {
		this.korean = korean;
	}

	public Subject getMath() {
		return math;
	}

	public void setMath(Subject math) {
		this.math = math;
	}

	public String getStuName () {
		return stuName;
	}
	
	public void setStuName (String stuName) {
		this.stuName = stuName;
	}
	

}
