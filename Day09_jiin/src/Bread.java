
public class Bread {

	String breadName;
	int breadPrice;
	String breadIng;
	
	Bread(){} //하나 있는 게 좋음 (기본 생성자)
	
	Bread(String bName, int bPrice, String bIng){
		breadName = bName;
		breadPrice = bPrice;
		breadIng = bIng;
	}
		
	void showBread() {
		System.out.println("이 빵의 이름: " + breadName );
		System.out.println("이 빵의 가격: " + breadPrice + "원" );
		System.out.println("이 빵의 재료: " + breadIng );
		
	}
	

	}
	
	
