import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		/*
		 정수를 하나 입력 받고, 연산자를 하나 입력 받으세요.
		 다시 정수를 입력 받아서, 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 */
//정수1:
//연산을 선택하세요. [+,-,*,/]:
//정수2:
//두 수의 곱셈은:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1: ");
		int a = sc.nextInt();
		
		System.out.println("연산을 선택하세요. [+,-,*,/]: ");
		String b = sc.next();
		
		System.out.println("정수2: ");
		int c = sc.nextInt();
		
		switch (b) {
		case "+":
			System.out.println(a + c);
			break;
		case "-":
			System.out.println(a - c);
			break;
		case "*":
			System.out.println(a * c);
			break;
		case "/":
			System.out.println(a / c);
			break;
			
		default:
			System.out.println("사칙연산 기호를 입력해 주세요.");
			System.out.println("[+, -, *, /]");
		}
		sc.close();
		
		
	}

}
