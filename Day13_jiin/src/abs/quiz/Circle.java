package abs.quiz;

public class Circle extends Shape{

	private int radius;
	
	public Circle(String name, int radius) {
		super(name); // 내 name 도 가지고 가서 초기화 해 주세요.
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius * radius * Math.PI; //static 필드이기 때문에 Math.PI 가능합니다.
	}

	
}
