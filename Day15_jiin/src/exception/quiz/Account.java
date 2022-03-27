package exception.quiz;

public class Account {

	private long balance;
	
	public Account(int money) throws Exception {
		if(money <= 0) {
			throw new MyException("최소 금액은 1,000원입니다.");
		}
		this.balance = money;
	}
	
	
	public void deposit(int money) throws Exception {
		if(money <= 0) {
			throw new MyException("입금액은 0원보다 커야 합니다.");
		}
		this.balance += money;
}
	
	public void withDraw(int money) throws Exception {
		if(this.balance < money) {
			throw new MyException("잔액 부족: " + (money - this.balance) + "원");
		}
		this.balance -= money;
	}
	
	public long getBalance() {
		return this.balance;
	}
}

