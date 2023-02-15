package _0215;

public class CompanyTest {
	public static void main(String[] args) {
		
		// "유일"한 인스턴스를 대입한 두 변수 생성
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);		// true
	}
}
