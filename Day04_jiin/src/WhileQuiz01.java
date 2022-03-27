import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		/*
		 # 사용자에게 구구단 단수를 입력받아서
		 해당 단수의 구구단을 출력해 보세요.
		 ex)
		 구구단을 입력하세요: x
		 *** 구구단 4단 ****
		 *
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 입력하세요: ");
		int a = sc.nextInt();
		System.out.println("**** 구구단 " + a +" 단 ****");
		
		int b = 1;
		while (b <= 9) {
			System.out.printf("%d x %d = %d\n", a, b, a*b);
			b++;
			}
		sc.close();
		
		}
		

	}

