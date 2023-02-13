package chap04_controllStatement;

public class _03 {
	public static void main(String[] args) {
		
		int score = 75;
		
		
		if(score >= 90) {
			 if(score >= 95)
				System.out.println("A+학점입니다.");
			else 
				System.out.println("A0학점입니다.");
		}

		if(score >= 80) {
			 if(score > 85)
				System.out.println("B+학점입니다.");
			else 
				System.out.println("B0학점입니다.");
		}
		
		if(score >= 70) {
			 if(score > 75)
				System.out.println("C+학점입니다.");
			else 
				System.out.println("C0학점입니다.");
		}
		
		else
			System.out.println("F학점입니다.");
	}
}
