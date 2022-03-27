package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		/*
		 # Map
		 - Key / Value가 한 세트를 이루는 자료 구조입니다.
		 - Key 값을 통해 Value를 참조하는 방식.
		 - Key는 중복 저장을 허용하지 않는다.
		 */
		
		//Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 생성합니다.
		Map<String, String> map = new HashMap<>();
		
		//Map에 데이터를 추가하는 메서드: put(key, value)
		map.put("멍멍이", "김철수");
		map.put("야옹이", "지니");
		map.put("짹짹이", "박영휘");
		System.out.println(map);
		
		//Map은 Key의 중복 저장을 허용하지 않습니다.
		//만약 중복 Key를 사용하여 put을 호출하면 Value만 수정됩니다.
		map.put("멍멍이", "김뽀삐");
		map.put("쀠약이", "지니");
		System.out.println(map);
		
		//ContainsKey(key): Map 내부에 key의 존재 유무를 확인하는 메서드
		System.out.println(map.containsKey("멍멍이"));
		System.out.println(map.containsKey("삐약탱"));
		
		//get(key): Map 내부의 값을 참조하는 법
		String name = "어흥이";
		if(map.containsKey(name)) {
			System.out.printf("%s의 주인 이름은 %s입니다.\n"
					, name, map.get(name));
		}else {
			System.out.println("그런 동물은 없습니다.");
		}
		
		//size(): map의 크기를 확인하는 메서드
		System.out.println("map의 크기: " + map.size());
		
		//KeySet(): Map에서 Key들만 추출하는 메서드
		//모든 Key들을 Set에 담아서 반환합니다.
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		
		//remove(Key): Map의 객체를 삭제
		//Key를 주면 value도 함께 제거됩니다.
		map.remove("야옹이");
		System.out.println(map);
		
		
	}

}
