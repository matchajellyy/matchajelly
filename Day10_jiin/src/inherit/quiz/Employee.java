package inherit.quiz;

public class Employee extends Person {

	String departments;

	String info() {
		return super.info() + "부서: " + departments;
	}
	
	
	
	
}
