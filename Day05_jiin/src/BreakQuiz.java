import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int correctCount = 0;
		int incorrectCount =0;
		
		// while문 안에서 누적 합계를 설정하면 누적이 안 됩니다.
		
		System.out.println("*** 덧셈 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해 주세요.");
		
		//여기서 난수를 설정하면 난수가 고정돼서 나옵니다.
		
		while(true) {
			
			int num1 = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);
			
			System.out.printf("%d + %d = ??", num1, num2);
			System.out.println("");
			System.out.println("> ");

		
		int answer = sc.nextInt();
		
		int correct = num1 + num2;
	
		
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
