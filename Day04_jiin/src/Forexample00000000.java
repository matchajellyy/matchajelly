import java.util.Scanner;

public class Forexample00000000 {

	public static void main(String[] args) {
		
		/*
		 1. 정수를 두개 입력받으세요. (x, y)
		 2. x부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
		 ex) 입력: 3, 7 -> "3부터 7까지의 누적합계: 25"
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		
		if (num1 > num2 ) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
			
		}
		
		int total = 0;
		int start = (num1 > num2 ? num2 : num1);
		int end = (num1 > num2 ? num1 : num2);
		
		while (start <= end) {
			total += start;
			start++;
		}
		
		System.out.printf("%d부터 %d까지 누적 합계: %d\n", num1, num2, total);
		
		sc.close();
	}
}
		
		
	


