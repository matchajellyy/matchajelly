
public class ForQuiz01 {

	public static void main(String[] args) {
		
		//2~19 난수를 생성하셔서 구구단을 출력해 보세요.(for)
		
		int rn = (int) (Math.random()*18 + 2);
		System.out.println("*** 구구단 " + dan + "단 ***");
		System.out.println("-------------------------");
		
		for(int hang = 1; hang <= 19; hang++) {
		
		System.out.printf("%d x %d = %d\n", rn, hang, rn*hang);
		
		}
		

	}

}
