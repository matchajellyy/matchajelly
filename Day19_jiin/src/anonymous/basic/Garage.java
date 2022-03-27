package anonymous.basic;

interface Car{
	public void run(); //추상 메서드
}

class Sonata implements Car { //소나타라는 클래스는 car을 구현합니다.

	@Override
	public void run() {
		System.out.println("소나타가 달립니다~");		
	} 
}
	
public class Garage {

//	public Car car = new Sonata(); 소나타와 car은 구현 관계. 추상 메서드 오버라이딩 진행, 객체 생성 가능 (다형성)
	//일반적인 인터페이스 구현 객체 사용법
	
	public Car car = new Car() {
		public void run() {
			System.out.println("익명 객체가 달립니다~");
		}
};

	public Garage() {
		car.run();
	}
	
}
