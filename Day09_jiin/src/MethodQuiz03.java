import java.util.Scanner;
//오류 고치기
public class MethodQuiz03 {
	static int calcGCD (int i, int j) {
		
//		int min;
//		int max;
//		if (i>j) {
//			min = j; max = i;
//		}else {
//			min = i; max = j;
//		}
		
		if(i<j) {
			int temp = i;
			i = j;
			j = temp;
			
		}
		
		while(j > 0) { //j가 0보다 클 때는 반복문이 계속 돈다. 
			int temp = i;
			i=j;
			j=temp % j;
			
		}
		return i; // 0일 때 i를 가지고 오겠다.
		
//		
//		while(i % j != 0) {
//			int temp = i % j;
//			i = j; //(j 값을 i에게 준다.)
//			j = temp;
//		}
//		return j;
}
}	
	public static void main(String[] args) {
		/*
		 - 정수 2개를 입력받아서(main)
		 두 숫자의 최대 공약수를 구해주는 메서드
		 calcGCD()를 선언하세요.
		 - 최대공약수: 두 숫자의 공통된 약수 중 가장 큰 약수
		 ex) 12, 18의 최대 공약수: 6
		 
		 # 임의의 두 자연수 a,b가 주어졌을 때, 둘 중 큰 값이 a라고 가정.
		 a를 b로 나눈 나머지를 n이라고 했을 때 (a % b -> n)
		 n이 0이 된다면 b가 최대 공약수입니다.
		 
		 #만약 n이 0이 아니라면 (안 나누어 떨어졌다면)
		 a의 자리에 b값을 다시 넣고
		 b의 자리에 n의 값을 대입한 후에 위의 행동을 반복.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1: ");
		int i = sc.nextInt();
		System.out.println("정수2: ");
		int j = sc.nextInt();
		
		
	 System.out.printf("%d와 %d의 최대공약수: %d\n",
			 i, j, calcGCD(i,j));
	}

}
