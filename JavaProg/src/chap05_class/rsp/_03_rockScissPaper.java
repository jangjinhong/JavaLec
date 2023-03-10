package chap05_class.rsp;

import java.util.*;

public class _03_rockScissPaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int win = 0;
		int draw = 0;
		int lose = 0;

		//승점 담아줄 변수(승:1, 무:0, 패:-1)
		int score = 0;

		//승무패 기록을 담아줄 배열
		int[] wdl = new int[10];

		//총 10판 진행
		for(int i = 0; i < wdl.length; i++) {
			//1 ~ 3까지 랜덤 변수 발생(1:가위, 2:바위, 3:보)
			int randomVal = (int)(Math.random() * 3) + 1;

			System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
			String userNumStr = sc.nextLine();
			//가위, 바위, 보를 숫자로 담아줄 변수
			int userNum;

			if(userNumStr.equals("가위")) {
				userNum = 1;
			} else if(userNumStr.equals("바위")) {
				userNum = 2;
			} else if(userNumStr.equals("보")) {
				userNum = 3;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				i--;
				continue;
			}

	// 가위, 바위, 보 비교
			// 무승부
			if(userNum == randomVal) {
				System.out.println("비겼습니다.");
				draw++;
				wdl[i] = 0;
			} 
			else {
				// 승리와 패배 조건 나누기
				// 승리
				if((userNum == 1 && randomVal == 3) ||
					(userNum == 2 && randomVal == 1) ||
					(userNum == 3 && randomVal == 2)) {
					System.out.println("이겼습니다.");
					win++;
					wdl[i] = 1;
				} 
				else {
					System.out.println("졌습니다.");
					lose++;
					wdl[i] = -1;
				}
			}


		}

		//승점 계산
		for(int j = 0; j < wdl.length; j++) {
			score += wdl[j];
		}

		System.out.println("전적은 " + win + "승 " + draw + "무 " 
				+ lose + "패. 총 승점 : " + score);
	}

}