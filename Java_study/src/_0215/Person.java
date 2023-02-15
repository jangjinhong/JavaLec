package _0215;

public class Person {
	String name;
	String gender;
	
	public Person() {
		this("이름없음", "성별지정 전");
	}
	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	Person returnSelf() {
		return this;
	}
	
	public static void main(String[] args) {
		Person p = new Person("James", "woman");
		Person p2 = new Person();
		p.gender = "man";
		System.out.println(p.returnSelf());  //_0215.Person@4e718207
		
		// this 반환 메소드는 거의 사용하지 않음
		// 반환값:  자신의 주소값 반환
	}
}
