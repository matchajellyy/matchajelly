package exception.quiz;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("정수 1: ");
		int num1 = sc.nextInt();
		System.out.println("정수 2: ");
		int num2 = sc.nextInt();
		return num1 + num2;
		
			} catch(Exception e) {
				throw new Exception("정수를 입력해야 합니다.");
			}finally {
			sc.close();
		}
	}
}
