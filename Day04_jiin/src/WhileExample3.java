import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		
		int total = 0;
		int start = num1;
		
		while (start <= num2) {
			total += start;
			start++;	
		}
		System.out.printf("%d부터 %d가지 누적 합계: %d\n",
				num1, num2, total);
		
		sc.close();
		

	}

}
