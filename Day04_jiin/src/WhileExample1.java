
public class WhileExample1 {

	public static void main(String[] args) {
		
		/*
		 # while 문의 진행 순서
		 1. 제어변수를 서언함. (시작값이 정해짐)
		 2. 조건식을 검사해서 true면 반복문이 진행.
		 3. while문 블록 내부가 한 번 진행되면, 다시 조건식을 검사하여
		 true면 반복문 진행
		 4. 반복문 내에서 증감식을 배치해서 제어변수의 값을 조정.
		 */

		int n = 1; //제어변수: 반복문의 횟수를 제어할 변수 (begin)
		
		while(n <= 10) { //논리형 조건식: 반복문의 끝을 지정. (end) 
			System.out.println("안녕하세요. 반갑습니다.");
			n++; //증감식: 반복문의 종류를 위해 제어변수의 값을 조정. (step)
		}
		System.out.println("------------------------------------");
		
		// 1 ~ 10까지의 누적합을 구하는 로직
		int i = 1; //begin
		int total = 0; //누적합을 기억해 줄 변수
		
		while(i <= 10) {
			total += i; //계속 누적을 하겠다
			i++; //(step)
		}
		
		System.out.println("1~10까지의 누적값: " + total);
		
		
		
		
	}

}
