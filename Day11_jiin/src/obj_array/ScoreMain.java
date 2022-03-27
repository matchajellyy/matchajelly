package obj_array;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		// Score 객체를 담을 수 있는 객체를 선언
//		배열의 크기는 100개
		
		Scanner sc = new Scanner(System.in);
		
		Score [] s = new Score[100];

		for(int i=0; i<s.length; i++) {
			System.out.println("이름을 입력하세요: ");
			String name = sc.next();
			
			if(name.equals("그만")) {
				System.out.println("입력을 종료합니다.");
				break;
			}
		
			System.out.println("국어 점수를 입력하세요: ");
			int korean = sc.nextInt();
			System.out.println("영어 점수를 입력하세요: ");
			int english = sc.nextInt();
			System.out.println("수학 점수를 입력하세요: ");
			int math = sc.nextInt();
			
		
		s[i] = new Score (name, korean, english, math);
		}
		for(Score ss : s) {
			//입력이 중간에 그만두어진다면,
			//배열의 나머지 인덱스는 모두 null로 가득 차 있습니다.
			if(ss == null) break;
			ss.scoreInfo();			
			}
		sc.close();
	}
		
	}

