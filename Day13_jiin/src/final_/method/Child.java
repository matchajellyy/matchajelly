package final_.method;

public class Child extends Parent {

	@Override
	void method1() {
		super.method1();
	}

	@Override
	void method2() {
		super.method2();
	}
}
/*
	void method3() {
		final 메서드는 오버라이딩을 막습니다 (주는 대로 쓰세요)
		
	}
	*/
