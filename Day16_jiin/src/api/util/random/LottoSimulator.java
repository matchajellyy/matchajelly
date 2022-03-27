package api.util.random;

import java.util.Arrays;

import java.util.Random;

public class LottoSimulator {
	
	static Random r = new Random();
	
	static int prize1 = 0; //1등 당첨 횟수를 세어 줄 변수입니다.
	static int prize2 = 0; 
	static int prize3 = 0; 
	static int prize4 = 0; 
	static int prize5 = 0; 
	static int failCnt = 0; //꽝
	
	public static int[] createLotto() {
	
	int[] lotto = new int[6];
	
	int i = 0; // lotto 배열의 인덱스
	
	while(i<lotto.length) {
		boolean flag = false; //중복 여부를 알려주는 변수 선언
		int rn = r.nextInt(45)+1;
		for(int j=0; j<=i; j++) {
			if(rn == lotto[j]) { //중복 발생
				flag = true;
				break;
			}
		}
		if(!flag) { //중복이 발생하지 않았다면
			lotto[i] = rn;
			i++; //다음 인덱스 이동, 중복 발생 시에는 수가 올라가지 않습니다.
		}
	}
	Arrays.sort(lotto);
	return lotto;
}
	
	//보너스 번호를 생성하는 메서드
	public static int createBonusNum(int[] win) {
		int bonus = 0;
		while(true) {
			boolean flag = false;
			int rn = r.nextInt(45) + 1;
			for(int i : win) {
				if(rn == i) { //중복이 발생
					flag = true;	
					break;
				}
			}
			if(!flag) {
				bonus = rn;
				break;
			}
		}
		return bonus;
	}
	
	//당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(int[] myLotto, int[] win, int bonus) {
		int count = 0; //내 로또번호와 당첨번호가 몇 개 일치하는지 세어 줄 변수
		
		for(int i: myLotto) {
			for(int j : win) {
				if(i == j) {
					count++;
					break;
				}
			}
		}
		if(count == 6) prize1++;
		else if(count == 5) {
			boolean flag = false;
			for(int num : myLotto) {
				if(num == bonus) {
					prize2++;
					flag = true;
					break;
				}
			}
			if(!flag) prize3++;
		}else if(count == 4) prize4++;
		else if(count == 3) prize3++;
		else failCnt++;
	}

	public static void main(String[] args) {
	
		//당첨번호 고정
		int[] win = createLotto();
		//보너스번호 고정
		int bonus = createBonusNum(win);
		
		int paper = 0; //로또를 몇 장 샀는지
		long money = 0;
		
		while(true) {
			
			int[] myLotto = createLotto();
			paper++;
			checkLottoNumber(myLotto, win, bonus);
			
			if(prize1 == 1) {
				money = paper * 1000;
				System.out.println("1등에 당첨되었습니다.");
				System.out.println("=======================");
				System.out.println("1등에 당첨되는 동안 누적 당첨 횟수는");
				System.out.printf("2등 당첨 횟수: %d회\n", prize2);
				System.out.printf("3등 당첨 횟수: %d회\n", prize3);
				System.out.printf("4등 당첨 횟수: %d회\n", prize4);
				System.out.printf("5등 당첨 횟수: %d회\n", prize5);
				System.out.printf("꽝 당첨 횟수: %d회\n", failCnt);
				System.out.println("1등을 위해 사용한 금액: " + money + "원");
				break;
			}else {
				System.out.printf("로또 %d장 째 구매 중...\n", paper);
			}
		}


	}
}
