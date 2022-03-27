import java.util.Scanner;

public class BreakQuiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int correctCount = 0;
		int incorrectCount = 0;
		
		
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		
		while(true) {
			
			int num1 = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);
			int cal = (int) (Math.random()*2);
			
			int correct;
			
			if(cal == 0) {
				System.out.printf("%d + %d = ???\n", num1, num2);
				correct = num1 + num2;
			} else {
				System.out.printf("%d - %d = ???\n", num1, num2);
				correct = num1 - num2;
			}
			
			System.out.println("> ");

		
		int answer = sc.nextInt();
		
	
		if(answer == correct) {
			System.out.println("정답입니다.");
			correctCount++;	
		}else if (answer == 0) {
			System.out.printf("정답은 %d 였습니다.", num1 * num2);
			System.out.println("");
			break;
		}else {
			System.out.println("틀렸습니다.");
			incorrectCount++;
		}
		
		}
		
		System.out.println("정답 횟수: " + correctCount + "회");
		System.out.println("틀린 횟수: " + incorrectCount + "회");
		
		sc.close();

	}

}
