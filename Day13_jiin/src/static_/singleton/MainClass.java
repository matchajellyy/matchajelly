package static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		
		
//		Singleton s = new Singleton();
//		s.method1();
//		s.method2();
		
		Singleton s1 = Singleton.getInstance();
		s1.method1();
		s1.method2();
		
		
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		Singleton s4 = Singleton.getInstance();
		Singleton s5 = Singleton.getInstance();

		System.out.println("주소값: " + s1);
		System.out.println("주소값: " + s2);
		System.out.println("주소값: " + s3);
		System.out.println("주소값: " + s4);
		System.out.println("주소값: " + s5);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		

	}

}
