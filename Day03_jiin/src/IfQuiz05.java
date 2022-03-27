import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어: ");
		int x = sc.nextInt();
		System.out.println("영어: ");
		int y = sc.nextInt();
		System.out.println("수학: ");
		int z = sc.nextInt();
		
		double avg = x + y + z / 3.0;
		System.out.println("평균 점수: %.1f점\n" + avg);
		
		
		if (avg >= 90) {
			if(avg > 100 || avg < 0) {
				System.out.println("잘못된 점수입니다.");
			}else if(avg >= 95) {
			System.out.println("당신의 학점은 A+입니다.");
			} else {
			System.out.println("당신의 학점은 A0입니다.");
			}
		}else if(avg >= 80) {
			System.out.println("당신의 학점은 B입니다.");
			}else if(avg >= 70) {
			System.out.println("당신의 학점은 C입니다.");
			}else if(avg >= 60) {
			System.out.println("당신의 학점은 D입니다.");
			}else {
			System.out.println("당신의 학점은 F입니다.");
			}
		sc.close();
		}
	}
				

