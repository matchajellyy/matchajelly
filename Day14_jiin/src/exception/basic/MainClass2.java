package exception.basic;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int cCount=0; //정답 횟수
		int iCount=0; //오답 횟수
		int eCount=0; //에러 횟수
		
		while(true) {
		
		int rn1 = (int) ((Math.random()*100)+ 1);
		int rn2 = (int) ((Math.random()*100)+ 1);
		
		int correct = rn1 + rn2;
		
		System.out.printf("%d + %d = ???\n", rn1, rn2);
		
		int answer; //try문을 깔끔하게 쓰기 위해 밖에다가 선언하겠습니다.
		
		try {
			System.out.println("> ");
			answer = sc.nextInt();
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
			eCount++;
			sc.nextLine();
			continue; //코드를 다시 진행시킬 수 있게 하겠습니다.
		}
		if(answer==0) {
			System.out.println("종료합니다.");
			break;
		}else if(answer == correct) {
			System.out.println("정답입니다.");
			cCount++;
		}else {
			System.out.println("오답입니다.");
			iCount++;
		}
			
		} 
		
		System.out.println("===============================");
		System.out.println("정답 횟수: " + cCount + "회");
		System.out.println("오답 횟수: " + iCount + "회");
		System.out.println("에러 횟수: " + eCount + "회");
	}

}
