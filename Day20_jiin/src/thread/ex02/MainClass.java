package thread.ex02;

public class MainClass {

	public static void main(String[] args) {
		
		ThreadTest t1 = new ThreadTest(); //직접 상속했기 때문에 thread 객체를 해 줄 필요 없습니다.
		t1.setName("쓰레드1");
		t1.start();
		
	}

}
