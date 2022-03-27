
public class MainClass {

	public static void main(String[] args) {
		//피자빵, 초코케이크의 정보를 호출
		
		Bread Pizza = new Bread();
		Pizza.breadName = "피자빵";
		Pizza.breadPrice = 2500;
		Pizza.breadIng =  "밀가루";
		Pizza.showBread();
		
		System.out.println("============");
		
		Bread Choco = new Bread();
		Choco.breadName = "초코빵";
		Choco.breadPrice = 2500;
		Choco.breadIng =  "밀가루";
		Choco.showBread();

	}

}
