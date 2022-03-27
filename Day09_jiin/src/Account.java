
public class Account {

	String name;
	int password;
	int balance;
	
	Account(){}
	
	Account(String aName, int aPassword, int aBalance){
		name = aName;
		password = aPassword;
		balance = aBalance;
	}
	
	void deposit(int money) {
		if(money<=0) {
			System.out.println("입금액은 0원 이상입니다.");
			return;
		}
		balance += money; //왜 += 냐면 기존 잔액에 + 개념이니까!
	}

	void withDraw(int money, int pw) {
		if(pw == password) {
			if(money>balance) {
				System.out.println("잔액이 부족합니다.");
			}
		balance -= money;
		}else {
			System.out.println("잘못된 비밀번호입니다.");
		}
	}
	
	int getBalance() {
		return balance;
	}
}
