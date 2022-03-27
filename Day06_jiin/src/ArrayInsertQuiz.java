import java.util.Scanner;
//오류 고치기

public class ArrayInsertQuiz {

	public static void main(String[] args) {
		
	String[] foods = new String[50];
	Scanner sc = new Scanner(System.in);
	
	for(int i=0; i<foods.length; i++) {
		System.out.print("먹고 싶은 음식 이름을 입력해 주세요: ");
		String food = sc.next();
		
		if (food.equals("배불러")) {
			System.out.println("입력을 종료합니다.");
			break;
		}
		int j;
		for(j=0; j<foods.length; j++) {
			if(food.equals(foods[j])) {
				break;
			}
		}
		
		if(j != foods.length) {
			System.out.println("이미 존재하는 음식입니다.");
			i--;
			continue;
		}
			
			
			foods[i] = food;
			
	}
			System.out.println("----------------------");
			
			System.out.print("내가 먹고 싶은 음식들: ");

			for(String f : foods) {
				if(f == null) break;
				System.out.println(f + " ");
				}
		
	sc.close();
	}
		
	
	}

