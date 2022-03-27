package anonymous.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Car s1 = new Sonata(); // 실제로 존재하는 객체
		s1.run();
		
//		Garage g = new Garage();
		
		Car tesla = new Car() {

			@Override
			public void run() {
				System.out.println("테슬라가 달립니다.");
			}
		};
		tesla.run();
		
		new Car() {

			@Override
			public void run() {
				System.out.println("포르쉐는 쌩쌩 달립니다~");
				
			}
			
		}.run();

	}

}
