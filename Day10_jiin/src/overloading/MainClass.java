package overloading;

public class MainClass {

	public static void main(String[] args) {
		Calculator r1 = new Calculator();
		System.out.println("직사각형의 넓이: " + r1.calcRectArea(5));
		System.out.println("정사각형의 넓이: " + r1.calcRectArea(5,4));
		System.out.println("정사각형의 넓이: " + r1.calcRectArea(5,6,5));
		
		
		
		

	}

}
