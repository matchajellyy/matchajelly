package final_.field;

public class MainClass {

	public static void main(String[] args) {

		Person kim = new Person("김철수");
//		kim.nation = "미국"; (x)nation은 final 변수이기 때문에 변경이 불가합니다.
//		kim.name = "김마이클"; (x)
		
		Person park = new Person("박영희") ;
//		park.nation = "영국"; (x)
//		park.name = "박영국"; (x)
		
		}
	}

