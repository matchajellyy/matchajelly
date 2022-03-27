package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
	       1. 스캐너를 통해서 정수 2개를 입력받습니다.
	       2. 입력받은 값이 정수라면, 단순히 정수의 합을 출력하고
	        반복문을 종료시키세요.
	       3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요"
	        를 출력한 후에 다시 입력받을 수 있도록 작성해 주세요.
	       4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워 주세요.
	       
	       만약 nextInt()가 정수를 가지고 오지 못하는 경우, (문자열 등등)
	       버퍼에 해당 쓰레기 문자가 여전히 남아 있어서입니다.
	       그걸 nextLine() 라는 메서드를 통해 정리해 줘야 합니다.
	       
	       */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		try {
			
			System.out.println("정수1: ");
			int n = sc.nextInt();
			System.out.println("정수2: ");
			int k = sc.nextInt();
			
			System.out.println("합: "+(n + k));
			break;
			
			
		} catch (Exception e) {
			System.out.println("정수를 입력하세요!");
			sc.nextLine();
	}
		
		System.out.println();
		System.out.println("프로그램 종료!");
		sc.close();
		}
}
	}
