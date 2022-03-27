
public class EnhancedForLoop {

	public static void main(String[] args) {
		/*
		 # 향상된 for문 (forEach)
		 - 제어변수(인덱스)의 사용 없이 배열 내부의 요소를
		 전체 참조할 수 있게 해 주는 반복문입니다.
		 
		 ex)
		 for(배열 요소를 받아줄 수 있는 변수 : 배열변수명){
		 반복 실행문...
		 }
		
		 */
		
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
//		for(int i=0; i<week.length; i++) {
//			System.out.println(week[i] + "요일");
//			}

		for(String day : week) { //전범위를 다 돌리기에 좋습니다.
			System.out.print(day + "요일 ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		
		int[] scores = {96, 88, 74, 63, 100, 55};
		int total = 0; //총점을 담아 줄 변수
		
		for(int s : scores) {
			total += s;
		}
		
		double avg =  (double) total / scores.length;
		
		System.out.printf("총점: %d점, 평균: %.2점\n", total, avg);
		//오류 고치기
	}

}
