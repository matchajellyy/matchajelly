import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1: ");
		int a = sc.nextInt();
		System.out.println("정수2: ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(a + "이 큰 수 입니다.");
		} else if(a < b) {
			System.out.println(b + "이 큰 수 입니다.");
		} else { 
			System.out.println("같은 수 입니다.");
		}
		
		

	}

}
