package regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexEx01 {

	public static void main(String[] args) {
		/*
		 # 정규 표현식 (regular expression)
		 - 특정한 규칙을 가진 문자열의 집합을 표현하는데 사용하는 형식 언어입니다.
		 - 지정한 패턴과 일치하는 문자열을 검증할 수 있습니다.
		 
		 # Pattern 클래스
		 - 정규 표현식을 다루는 클래스입니다
		 
		 # Matcher 클래스
		 - 패턴을 이용하여 대상 문자열을 검색할 때 사용하는 클래스입니다.
		 */

		String info = "30세/서울시 마포구/02-123-4567/010-2345-6789/kkk@naver.com";
		
		/*전화번호 형식
		 \\d: 숫자 형식인지를 파악합니다.
		 \\\d{3}: 숫자 3개를 찾습니다.
		 \\d{3,4}: 숫자가 3이상 4이하를 찾습니다.
		*/
		
		String pattern = "\\d{2,3}-\\d{3,4}-\\d{4}";
		
		//비교 및 검증이 가능한 정규 표현식을 만들어 내는 메서드입니다.
		Pattern p = Pattern.compile(pattern);
		//데이터를 비교해서 Matcher 클래스로 반환합니다.
		Matcher m = p.matcher(info);
		
		if(m.find()) {
			System.out.println("시작 인덱스: " + m.start());
			System.out.println("끝 인덱스: " + m.end());
			System.out.println("찾은 값: " + m.group());
		}
		
		/*이메일 형식
		 \\w: 영문자와 숫자를 찾습니다.
		 \\w+: 영문자와 숫자 여러 개를 찾습니다.
		 */
		
		String pattern2 = "\\w+@\\w+.\\w+";
		Matcher m2 = Pattern.compile(pattern2).matcher(info);
		while(m.find()) {
			System.out.println("시작 인덱스: " + m2.start());
			System.out.println("끝 인덱스: " + m2.end());
			System.out.println("찾은 값: " + m2.group());
		}
		
	}

}
