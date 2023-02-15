package _0215;

// 싱클톤 패턴 - static
public class Company {
	private static Company instance = new Company();		//유일한 인스턴스 생성 (static)
	private Company() {}		//private 생성자
	
	public static Company getInstance() {		
		if(instance == null)
			instance = new Company();
		
		return instance;
	}
	/*
	 * private형 유일한 인스턴스를 외부에서도 사용할 수 있도록 -> public 메소드 생성하고,
	 * 																							인스턴스 반환
	 * 인스턴스 반환 메소드는 반드시 static 선언 필요
	 * 해당 메소드는 인스턴스 생성과 관계없이 호출할 수 있어야 하기 때문
	 *
	 * 
	 */
	
}
