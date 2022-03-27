package thread.Quiz;

public class MainClass {

	public static void main(String[] args) {
		
		/*
	    run() 메서드 안에는 랜덤값을 이용해서 개표 진행사항을 화면에 출력합니다.
	    
	    멤버변수: int finish -> 최대 개표율
	          int sum -> 개표율
	          Random r -> 난수 생성용
	          StringBuilder -> *찍기용
	    
	    조건: 개표율은 100%가 최대값입니다.
	     문자는 StringBuilder를 이용하여 개표율만큼의 *을 출력했습니다.
	     개표율은 1 ~ 10까지의 난수를 생성해서 개표율에 적용했습니다.
	     개표가 한 번 일어날 때마다 스레드는 1초씩 일시정지됩니다.
	    */
		
		VoteThread voteLocation1 = new VoteThread();
		VoteThread voteLocation2 = new VoteThread();
		VoteThread voteLocation3 = new VoteThread();
		
		Thread Location1 = new Thread(voteLocation1, "Location1");
		Thread Location2 = new Thread(voteLocation2, "Location2");
		Thread Location3 = new Thread(voteLocation3, "Location3");
		
		Location1.start();
		Location2.start();
		Location3.start();

	}

}
