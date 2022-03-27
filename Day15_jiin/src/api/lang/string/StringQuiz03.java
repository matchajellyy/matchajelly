package api.lang.string;

import java.util.Scanner;

public class StringQuiz03 {
	
	public static String palindrome(String word) {

		/*word = word.replace(" ", "");
		for(int i=0; i<word.length()/2; i++) {
			if(word.charAt(i) != word.charAt(word.length()-1 -i)){
				return "회문이 아닙니다.";
			}
		}
		return "회문입니다.";
		
		String word2 = "";
		for(int i=word.length()-1; i>=0; i--) {
			word2 += word.charAt(i);
		}
		if(word.equals(word2)) {
			return "회문입니다";
		}else {
			return "회문이 아닙니다.";
		}
		*/
		
		StringBuilder sb = new StringBuilder(word);
		if(sb.reverse().toString().equals(word)) {
			return "회문입니다.";
		}else {
			return "회문이 아닙니다.";
		}
			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		String sen = sc.nextLine();
		
		System.out.println(palindrome);
		
		sc.close();
		
		}

	}
