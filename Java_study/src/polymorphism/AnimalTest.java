package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
	
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가  네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가  사냥을 합니다.");
	}
}
	
public class AnimalTest {
	ArrayList<Animal> aTest = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest a= new AnimalTest();
			
		a.addAnimal();
		
		System.out.println("==========형 변환 전으로 다운캐스팅 실행");
		a.testCasting();
	}

	
	public void addAnimal() {
		aTest.add(new Human());
		aTest.add(new Tiger());
		
		for (Animal a : aTest) {
			a.move();
		}
	}
	
	public void testCasting() {
		for (int i = 0; i < aTest.size(); i++) {
			Animal ani =  aTest.get(i);
			if (ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}
			else if (ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else 
				System.out.println("지원되지 않은 자료형입니다.");
		}
	}
	
}	


