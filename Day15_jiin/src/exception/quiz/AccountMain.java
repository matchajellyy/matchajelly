package exception.quiz;

public class AccountMain {

	public static void main(String[] args) {

		Account acc = null;
		//지역변수라서 초기화해야 합니다.
		
		try {
			acc = new Account(1000);
			acc.deposit(200);
			acc.withDraw(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("계좌 잔액: " + acc.getBalance());

	}

}
