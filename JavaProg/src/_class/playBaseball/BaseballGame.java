package _class.playBaseball;

import java.util.*;

public class BaseballGame {
	public static void main(String[] args) {
		int com[] = new int[3];
		int user[] = new int[3];
		int strike = 0, ball = 0;
		int cnt = 0;

			
		for(int i = 0; i< com.length; i++) {
			int r = (int)(Math.random() * 9) + 1;
			com[i] = r;
			
			boolean isComDuplicated = false;
			
			if (i > 0) {
				for(int j = 0; j< i; j++) {
					if(com[i] == com[j]) {
						isComDuplicated = true;
						break;
					}
				}
			}
			
			if(isComDuplicated) {			// 해당 인덱스 랜덤 값 다시 생성
				i--;
				continue;
			}
			
		}

		System.out.println("computer: " + Arrays.toString(com));
		System.out.println("숫자 3개 입력 >> ");
		Scanner sc = new Scanner(System.in);
		
		while(true) {		
			strike = 0;
			ball = 0;
			
			for (int i = 0; i < 3; i++) {
				int userNum = sc.nextInt();
				user[i] = userNum;
				
				boolean isUserDuplicated = false;
				
				for(int j = 0; j < i; j++) {
					if(user[i] == user[j]) {
						isUserDuplicated = true;
						System.out.println("중복되지 않은 값을 입력해주세요.");
						break;
					}
				}
				
				if(isUserDuplicated) {
					i--;
					continue;
				}
			}
			
			cnt++;
			
			if(cnt >= 3) {
				strike++;
			}
			if(cnt == 0) {
				System.out.println("out");
			}
			else {
				System.out.println();
			}

			
		}
		
	}
}
