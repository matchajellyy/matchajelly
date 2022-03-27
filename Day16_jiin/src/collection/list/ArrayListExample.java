package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		/*
		 # ArrayList
		 - 배열과 다르게 크기가 자동으로 조절되는 자료 구조 클래스입니다.
		 - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋습니다.
		 - 인덱스를 활용하며, 객체의 중복 저장을 허용합니다.
		 */
		
		List<String> nick = new ArrayList<>();
		
		String str = "야옹이";
		
		//add(객체): 리스트에 객체를 추가하는 메서드
		nick.add("멍멍이");
		nick.add(str);
		nick.add(new String("개구리"));
		nick.add("짹짹이");
		nick.add("야옹이");
		System.out.println(nick);
		
		//add(인덱스, 객체): 특정 인덱스에 객체를 삽입하는 메서드
		nick.add(3,"어흥이");
		System.out.println(nick);
		
		//get(인덱스): 리스트 내부의 객체를 참조하는 메서드
//		String name = nick[3]; (x)
		String name = nick.get(3);
		System.out.println("3번 인덱스의 값: " + name);
		
		//size(): 리스트의 크기를 반환
		System.out.println("nick의 크기: " + nick.size());
		
		//set(인덱스, 수정할 객체): 리스트 내부의 객체를 수정
		nick.set(2, "삐약이");
		System.out.println(nick);
		
		//remove(인덱스), remove(객체)
		nick.remove(5);
		System.out.println(nick);
		nick.remove(str);
		System.out.println(nick);
		
		//리스트의 반복문 처리
		for(int i=0; i<nick.size(); i++) {
			System.out.println(nick.get(i));
		}
		System.out.println("===========================");
		
		//향상 for문 (forEach)
		for (String n : nick) {
			System.out.println(n);
		}
		
		//contains(객체): 리스트 내의 객체의 존재 유무를 파악하는 메서드
		System.out.println(nick.contains("삐약이"));
		
		//clear(): 리스트 내부 요소 전체 삭제
		nick.clear();
		System.out.println(nick);
		
		//isEmpty(): 리스트가 비어 있는지의 여부 확인
		System.out.println(nick.isEmpty());
		
		// # 컬렉션 객체들은 Collections의 기능을 사용할 수 있습니다.
		// Collections은 컬렉션 객체들의 부가 기능들을 지원합니다.
		
		
		//리스트는 객체를 모으는 친구이기 때문에 Integer로 포장해서 리스트로 보내야 합니다.
		List<Integer> score = new ArrayList<>();
		score.add(65);
		
		Collections.addAll(score, 78,100,88,99,1000);
		System.out.println(score);
	}

}
