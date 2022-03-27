import java.util.Arrays;

public class Array2DQuiz {

	public static void main(String[] args) {
		int[][] score = {
				{79,80,99},
				{95,85,89},
				{90,65,56},
				{69,78,77}
		};
		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};
		
		double totalAvg = 0.0; // 학생들의 평균 점수의 총합
		
		//1번
		int idx = 0; //stuName배열에서 학생의 이름을 꺼내올 용도로 사용할 변수
		for(int[] stu : score) {
			int total = 0;
			for(int s : stu) {
				total += s;
			}
			double avg = (double) total / subName.length;
			System.out.printf("%s평균: %.1f점\n", stuName[idx],avg);
			idx++;
		}
		
		//2번
		for(int sub=0; sub<subName.length; sub++) {
			int total = 0;
			for(int stu=0; stu<stuName.length; stu++) {
		total += score[stu][sub];
			}
			double avg = (double) total / stuName.length;
		System.out.printf("%s 평균 점수: %.1f점\n", subName[sub], avg);
		}
		
		//3번 오류 해결하기
		double classAvg = totalAvg / stuName.length;
		System.out.printf("우리반 평균: %.1점\n", classAvg);
				
		}
	}



