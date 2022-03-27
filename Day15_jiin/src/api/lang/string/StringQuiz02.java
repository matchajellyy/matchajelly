package api.lang.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		a: while(true) { //언제 입력을 정확하게 할지 잘 모르기 때문에
			System.out.println("주민등록번호 13자리를 '-'를 포함해서 입력하세요.");
			String num = sc.next();
			
			num = num.replace("-", "");
			
			if(num.length() != 13) {
				System.out.println("13자리를 입력하셔야 합니다.");
				
				//여기 고장남
			}else {
				char c = num.charAt(6);
				if(c != 2 && c != 4) {
					System.out.println("남성입니다");
					break a;
					
				}else if(c == 2 && c == 4){
					System.out.println("여성입니다.");
					break a;
			}

		}
		}
		
		

	}

}
