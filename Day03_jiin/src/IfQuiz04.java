import java.util.Scanner;

public class IfQuiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int a = sc.nextInt();
		System.out.println("정수2: ");
		int b = sc.nextInt();
		System.out.println("정수3: ");
		int c = sc.nextInt();
		
		int max, mid, min;
		
		if(a > b && a > c) {
			max = a;
			if (b > c) {
				mid = b;
				min = c;
			} else {
				mid = c;
				min = b;	
			}
		} else if(b > c && b > a) {
			max = b;
			if (a > c) {
				mid = a;
				min = c;
			} else {
				mid = c;
				min = a;
				
			}
		} else {
			max = c;
			if (a > b) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("중간값: " + mid);
		System.out.println("최소값: " + min);
		
		sc.close();
	}

}
