import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
	
		/*
		 사용자에게 섭씨온도를 입력받아서
		 화씨온도로 변환하여 출력하는 로직을 작성하세요
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨 온도를 입력하세요: ");
		int C = sc.nextInt();
		
		double F = C * 9.0 / 5.0 + 32.0;
		System.out.printf("입력한 섭씨: %d℃\n", C);
		System.out.printf("변환된 화씨: %.1f℉\n", F);
		
		sc.close();
		
	}

}