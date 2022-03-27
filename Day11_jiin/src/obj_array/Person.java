package obj_array;

public class Person {
	
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	//변수 선언 후 private 붙여주고 단축키 사용해서 불러오기
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	void personInfo() {
	System.out.printf("이름: %s\n나이: %d세\n성별: %s\n",
			this.name, this.age, this.gender);

}
}
