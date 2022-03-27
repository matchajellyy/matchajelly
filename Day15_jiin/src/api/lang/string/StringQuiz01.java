package api.lang.string;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("아이디: ");
		String id = sc.nextLine().trim();
		id = id.replace(" ", "");

		if(id.length() < 5) {
			System.out.println("아이디는 5글자 이상 입력해야 합니다.");
		}else {
			System.out.println("id가 등록되었습니다.");
			break;
		}
		}
		sc.close();
}
}
