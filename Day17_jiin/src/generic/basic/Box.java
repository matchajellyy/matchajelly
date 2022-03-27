package generic.basic;

public class Box<T>{ // 제네릭 클래스로 선언, <> 안에 대문자 써 주는 것이 관례

	private T t;
	
	public void setT(T t) {
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
