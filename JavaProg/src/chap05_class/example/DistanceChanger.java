package chap05_class.example;

public class DistanceChanger {
	private long distance;
	public long changeDistance;
	public String unit;
	public String changeUnit;
	
	// 변환할 거리 long(m)
	public void setChangeDistance (int changeDistance) {
		this.changeDistance = changeDistance;
	}

	public void setChangeUnit (String changeUnit) {
		this.changeUnit = changeUnit;
	}

	// 변환 단위 (cm, m, km, inch)
	public void changed () {
		// 1km -> 100,000cm
		// 				1000m
		//					39370.1inch
		// 1m -> 100cm
		//				39.3701inch
		// 1inch -> 2.54cm
		switch(changeUnit) {
		case "cm ":
			break;
			
		case "m" :
			break;
			
		case "km" :
			if (unit == "cm")
				changeDistance = distance/100000;
			else if (unit == "m")
				changeDistance = distance/1000;
			else if (unit == "inch");
				changeDistance = (long) (distance/39370.1);
			break;
			
		case "inch" :
			break;
		default:
			System.out.println("cm, m, km, inch 중 하나를 입력해 주세요.");
			break;
		}
	}
	


	// 기본 생성자
	public DistanceChanger() {
		this.distance = 0;
		this.unit = "단위없음";
	}
	
	// 생성자(거리와 단위) -> 멤버변수 초기화
	public DistanceChanger(int distance, String unit) {
		this.distance = distance;
		this.unit = unit;
	}
	
	// 선택된 단위로 거리 변환 후 출력하는 메소드 (m -> inch = m*39.37)
	
}
