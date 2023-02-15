package chap04_controllStatement;

public class _10 {

	public static void main(String[] args) {
		
		int n=0;

		while(n++ < 10) {
			if(n == 6)
				continue;
			System.out.println(n);
		}
	
		System.out.println("-----------------------");
		
	for (int i = 2; i <= 9; i++) {
		System.out.println("===" + i+"단 ===");
		if(i > 5)
			break;
		if(i == 4)
			continue;
		for(int j = 1; j <= 9; j++) 
			System.out.println(i + "*" + j + "= " + i*j);
		}
	}
}
