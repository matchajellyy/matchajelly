package abs.good;

public class SeoulStore extends HeadStore {

	public SeoulStore() {
		super();
	}
	
	@Override
	public void orderApple() {
		System.out.println("사과 주스의 가격은 3000원입니다.");
		
	}

	@Override
	public void orderBanana() {
		System.out.println("사과 주스의 가격은 2800원입니다.");
	}
	

	@Override
	public void orderGrape() {
		System.out.println("사과 주스의 가격은 3200원입니다.");
	}

	
}
