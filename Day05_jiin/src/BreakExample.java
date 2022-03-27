
public class BreakExample {

	public static void main(String[] args) {
		
		
		/*
		 -내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에 종료시키고 싶다면
		 바깥쪽 반복문에 label을 붙입니다.
		 그리고, break 선언 시 label을 같이 선언합니다.
		 */
		
	
	outer: for(int i = 0; i <= 2; i++) {
		for(int j = 0 ; j <= 1; j++) {
			if (i == j) {
				break outer;
			}
			System.out.println(i + "-" + j);
		}
	}

	}

}
