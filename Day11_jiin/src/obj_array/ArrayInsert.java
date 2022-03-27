package obj_array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] people = new Person[3];
		
		for(int i=0; i<people.length; i++) {
			
//			Person p = new Person(); 다음, people.setName(sc.next());
			
			System.out.println("이름을 입력해 주세요: ");
			String name = sc.next();
			
			System.out.println("나이를 입력해 주세요: ");
			int age = sc.nextInt();
			
			System.out.println("성별을 입력해 주세요: ");
			String gender = sc.next();
		
		//객체 만들기 (여기 기억~)
		people[i] = new Person(name, age, gender); //people이라는 배열의 i번째 인덱스에 넣겠습니다.
		

		
		}
		for(Person p : people) {
			p.personInfo();
		}
		sc.close();
	}
	


}
