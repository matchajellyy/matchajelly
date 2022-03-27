
public class MainClass03 {

	public static void main(String[] args) {
		
		Account myAcc = new Account("홍길동", 1234, 3600);
		
		myAcc.deposit(8000);
		myAcc.withDraw(1900,1234);
		
		int bal = myAcc.getBalance();
		System.out.println(myAcc.name + " 님의 계좌 잔액은 " + bal + "원 입니다.");

	}

}
