package thread.Quiz;

import java.util.Random;

public class VoteThread implements Runnable{

	int finish = 100; //개표 끝!
	int sum = 0;
	Random r = new Random();
	StringBuilder sb = new StringBuilder();
	
	@Override
	public void run() {
		while(true) {
			int num = r.nextInt(10) + 1; 
			sum += num;
			
			if(finish > sum) { //개표가 아직 덜 된 경우
				for(int i=1; i<num; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + "개표율: " + sum + "%: " + sb);
				System.out.println("\n===============================");
			}else { //개표율이 100보다 큰 경우
				sum = 100;
				sb.delete(0, sum);
				for(int i=1; i<100; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + "개표율: " + sum + "%: " + sb);
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} //end while(true)
		
		System.out.println("\n" + Thread.currentThread().getName() + "의 개표가 완료되었습니다.");
	}

}
