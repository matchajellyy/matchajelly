import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		String[] foods = {"삼겹살", "치킨", "탕수육", "떡볶이"};
		System.out.println(Arrays.toString(foods));

		System.out.println("-------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("탐색할 음식을 입력하세요: ");
		String name = sc.next();
		
		boolean flag = false;
		for(int i=0; i<foods.length; i++) {
			if(name.equals(foods[i])) {
				System.out.println("탐색 완료!");
				System.out.println("인덱스 " + i + "번");
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("없는 음식입니다.");
		}
		sc.close();
	}
}
