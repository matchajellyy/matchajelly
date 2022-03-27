package inherit.quiz;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "냐냐";
		s1.age = "25";
		s1.studentId = "3180300449";
		System.out.println(s1.info());
		
		System.out.println("===================");
		
		Teacher t1 = new Teacher();
		t1.name = "냐냐쌤";
		t1.age = "35";
		t1.subject = "도덕";
		System.out.println(t1.info());

		System.out.println("===================");
		
		Employee e1 = new Employee();
		e1.name = "웅냐냐";
		e1.age = "25";
		e1.departments  = "냥?";
		System.out.println(e1.info());
		
	}

}
