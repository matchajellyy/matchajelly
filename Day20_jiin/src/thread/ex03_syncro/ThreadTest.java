package thread.ex03_syncro;

public class ThreadTest implements Runnable {

	int num = 0;
	
	@Override
	public synchronized void run() { //동기화하라는 키워드를 붙여줌.
		//동시 작업이 진행되는 동안 충돌이 일어날 수 있는 메서드라면,
		//한 곳에서 먼저 완료하고 진행되게
		
		System.out.println("현재 쓰레드: " + Thread.currentThread());
		System.out.println("쓰레드 시작!");
		
		for(int i=1; i<=10; i++) {
			
			if(Thread.currentThread().getName().equals("쓰레드1")) {
				System.out.println("-==================");
				num++;
			}
				
			System.out.println("현재 쓰레드:" + Thread.currentThread());
			System.out.println("num: " + num );
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}