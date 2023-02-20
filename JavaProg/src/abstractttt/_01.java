package abstractttt;

public class _01 {
	public static void main(String[] args) {
		
		Add add = new Add();
		Minus min = new Minus();
		
		// 동일한 calc 메서드 호출
		// 동일한 이름의 메소드는 전혀 다른 기능으로 실행됨
		add.calc(5, 3);
		min.calc(5, 3);
	}
}
