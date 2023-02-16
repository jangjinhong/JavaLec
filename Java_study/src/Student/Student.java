package Student;

import java.util.*;

public class Student {
	int stuID;
	private String stuName;
	// Subject korean;
	// Subject math;
	ArrayList<Subject> subList;
	
	
	public Student(int stuID, String stuName) {
		this.stuID = stuID;
		this.stuName = stuName;
		subList = new ArrayList<Subject>();		//ArrayList 선언
	}
	
	public void addSub(String SubName, int scorePoint) {
		Subject sub = new Subject();
		sub.setSubName(SubName);
		sub.setScorePoint(scorePoint);
		
		subList.add(sub);		//ArrayList에 하나씩 저장
	}
	
	public void showBookInfo() {		//각 과목 성적과 total 점수 출력
		int total = 0;

		for (Subject s : subList) {
			total += s.getScorePoint();
			System.out.println("학생 " + stuName + "의 " + s.getSubName() + " 과목 성적은 " +
			s.getScorePoint() + "점 입니다.");
		}
		System.out.println("::  학생 " + stuName + "의 총점은 " + total + "점 입니다.  ::");
		System.out.println("====================");
	}
	
	/*
	 * public int getStuID() { return stuID; }
	 * 
	 * public void setStuID(int stuID) { this.stuID = stuID; }
	 * 
	 * public String getStuName () { return stuName; }
	 * 
	 * public void setStuName (String stuName) { this.stuName = stuName; }
	 */
}
