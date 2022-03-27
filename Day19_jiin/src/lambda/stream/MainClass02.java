package lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainClass02 {

	public static void main(String[] args) {
		
		/*
		 # 람다의 구현매개변수 사용문법
		 - Predicate: 매개변수를 받고, boolean 형으로 반환합니다.
		 - Function: 매개변수를 받고, 임의의 값을 반환합니다.
		 - Consumer: 리턴을 받고, 반환은 없는 형태입니다.
		 - Supplier: 매개변수는 없고, 반환 형태는 지정이 가능합니다. (Consumer와 반대입니다.)
		 */

		List<Integer> list = new ArrayList<>();
		
		for(int i=1; i<=100; i++) {
			list.add((int) (Math.random()*100) + 1);
		}

		System.out.println(list);
		
		System.out.println("============================");
		
		//distinct(): 중복 제거!
		list.stream()
			.distinct()
			.forEach((num) -> System.out.print(num + " "));
		
		System.out.println("\n================================\n");
		
		//filter(): 걸러내는 기능!
		
		Stream<Integer> s1 = list.stream()
								.filter((num) -> num % 2 == 0); //짝수를 뽑아내겠습니다.
									//작성한 조건식의 결과가 true면 리턴합니다.
		
		s1.forEach((num) -> System.out.print(num + " "));
		
		System.out.println("\n============================");
		
		//sorted(): 정렬
		list.stream()
			.sorted()
			.forEach((num) -> System.out.print(num + " "));
		
		
		System.out.println("\n============================");
		
		//map(): 메서드 안에 정의된 새로운 stream 으로 반환합니다.
		
		Stream<String> s2 = list.stream().map((num) -> {
			return num % 2 == 0 ? "짝수" : "홀수";
		});
		
		s2.forEach((str) -> System.out.print(str + " "));
		
		System.out.println("\n============================");
		
		//50보다 크면 값을 반환, 아니면 0을 반환합니다.
		
		list.stream().map((t) -> t > 50 ? t : 0)
					.forEach((t) -> System.out.print(t + " "));
		
		
		System.out.println("\n============================");
		
		//50보다 크면 원본을 반환, 아니면 0을 반환, 0을 제거 후 출력합니다.
		
		list.stream()
			.map((a) -> a > 50 ? a : 0)
			.filter((i) -> i != 0) //true면 리턴, false면 리턴을 안 하기 때문에 != 사용해야 합니다.
			.forEach((j) -> System.out.print(j + " "));
		
		
	}

}
