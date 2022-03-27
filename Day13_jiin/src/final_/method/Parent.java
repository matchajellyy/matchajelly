package final_.method;

public class Parent{

	/*
	 - 클래시 선언 시 final을 사용하면 그 클래스는 상속이 불가능해집니다.
	 
	 - final 클래스는 자식 클래스를 가질 수 없고, 오직 외부에서 객체 생성을
	 통해서만 가능합니다.
	 - 더 이상의 개념의 확장을 막기 위해서 사용합니다.
	 */
	
	void method1() {}
	void method2() {}
	final void method3() {}
}
