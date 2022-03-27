
public class Practice {

	
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) { // 10번 반복해라
			for(int j=1; j<=i; j++) { //i만큼 반복해라
				System.out.print("*");
				
				//i=1, j=1이고, i=2, j= 1,2이고, i=3, j=1,2,3 -> 계단 모형이 됨
				//별의 개수가 증가하는 것은 매번 다시 1부터 시작하는 j가 i보다 작거나 같은 값이 될 때까지 반복이라서
				//중첩 for 문의 반복 횟수가 늘어남에 따라 별 개수도 증가한다.
				
			}
			System.out.println();
		}
		
		/*
		 1. 구구단을 다음과 같이 가로로 출력해 보세요.
		 
		 2단: 2x1=2 2x2=4 2x3=6 .....
		 3단: 3x1=3 3x2=6 3x3=9 .....
		 4단: 4x1=4 4x2=8 4x3=12 .....*/
		 
		for(int dan=2; dan<=9; dan++) {
			System.out.print(dan + "단: ");
			for(int hang=1; hang<=9; hang++) {
				System.out.printf("%d x %d = %d ", dan, hang, dan*hang);
			}
			System.out.println();
		}
		System.out.println("==========================");
		/*2. 구구단을 다음과 같이 세로로 출력해 보세요.
		 각 단의 간격은 탭 하나로 고정하겠습니다.
		 2단         3단
		 2x1=2      3x1=3
		 2x2=4      3x2=6
		 2x3=6      3x3=9
		 .
		 .	 */
		
		for(int hang=0; hang<=9; hang++) {
			for(int dan=2; dan<=9; dan++) {
			if(hang==0) {
			System.out.print(dan+"단\t");
			}else {
				System.out.printf("%dx%d=%d\t", dan, hang, dan*hang);
			}
		}
			System.out.println();

	}
		
		int a=1;
		int sum=1;
		while(a<=3) {
			sum=sum*a;
			a++;
		}
		System.out.println(sum);
	}
}
	

