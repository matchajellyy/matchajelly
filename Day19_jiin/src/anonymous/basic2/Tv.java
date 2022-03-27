package anonymous.basic2;

public class Tv implements RemoteController {

	private int volume;
	
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv를 끕니다.");
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		volume++;
		System.out.println("tv의 볼륨: " + volume);
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		volume--;
		System.out.println("tv의 볼륨: " + volume);
		
	}

	
	
}

