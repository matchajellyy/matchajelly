package abs.bad;

public class HeadStore {
	
	//상속을 받는 클래스에게 오버라이딩을 권유합니다. 강제는 아닙니다.
	public void orderApple() {
		System.out.println("0원입니다. 가게에서 알아서 가격을 정해주세요.");
	}
	public void orderBanana() {
		System.out.println("0원입니다. 가게에서 알아서 가격을 정해주세요.");
	}
	public void orderGrape() {
		System.out.println("0원입니다. 가게에서 알아서 가격을 정해주세요.");
	}
}
