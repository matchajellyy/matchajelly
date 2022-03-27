package obj_array;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

//		Person kim = new Person("김냐냐", 32, "남성");
//		Person lee = new Person("이냐냐", 34, "여성");
//		Person park = new Person("박냐냐", 80, "남성");
//		
//		kim.personInfo();
//		lee.personInfo();
//		park.personInfo();
//		
//		int[] arr = new int[5];
		
//		Person[] people = new Person[3];
//		people[0] = new Person ("김냐냐", 32, "남성");
		
//		int[] arr = {1,2,3,4,5}; -> 배열에 들어갈 값을 알면 더 쉬워진다
				
		Person[] people = {
				new Person("김냐냐", 32, "남성"),
				new Person("이냐냐", 34, "여성"),
				new Person("박냐냐", 80, "남성")
			};
//			System.out.println(Arrays.toString(people));
		
//		people[0].personInfo();
//		people[1].personInfo();
//		people[2].personInfo();
		
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person p : people) { //String, int로 받을 수 없고 그 배열 자체를 받아야 한다.
			p.personInfo();
		}
		
		}

	}

