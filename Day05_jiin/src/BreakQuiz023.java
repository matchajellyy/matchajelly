import java.util.Scanner;

public class BreakQuiz023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** UP & DOWN 게임***");
		System.out.println(" # 1부터 100까지의 정수 중 어느 숫자가 선택되었을까요");
		int i = sc.nextInt();
		
		int num1 = (int) (Math.random() * 100 + 1);
		int count = 0;
		
		while(true) {
			System.out.println("> ");
			int answer = sc.nextInt();
			if(answer > 100 || answer < 1) {
				System.out.println("범위에서 벗어났습니다.");
				break;
			}
			
		if(i > num1) {
			System.out.println("DOWN");
		}else if (i < num1 ) {
			System.out.println("UP");
		}else {
			System.out.println("정답입니다.");
			break;
		}
		
		if(count < 7 ) {
		System.out.println("정답 기회" + (7 - count) + "번 남았습니다.");
		}else {
			System.out.println("정답 기회를 모두 소진하셨습니다.");
			System.out.println("마저 정답을 입력해 주세요.");
		}
		
			
		}
		System.out.println(count + "번 만에 맞혔습니다.");
		if(count <= 7) {
			System.out.println("승리했습니다.");
		}else {
			System.out.println("패배했습니다.");
		}
		sc.close();
	}

}
