package poly.quiz;

public class MyCart {

	public static void main(String[] args) {
		
		
		private void add(Product p) {
			if(i >= cart.length) { //배열에 자리가 없습니다.
				//새로운 장바구니를 만드는 과정
				Product[] temp = new Product[cart.length * 2];
				//기존 배열에 들어 있는 상품을 새로운 배열에 옮깁니다.
				for(int n=0; n<cart.length; n++) {
					temp[n] = cart[n];
				}
				cart = temp;
				temp = null;
			}
		}
			
			cart[i] = p; //물건을 배열에 추가합니다.
			i++; //개수 증가합니다.

			info();
	}

	/*
	 - public void info()
	 
	 - 장바구니 안에 담긴 물건의 목록(name)을 출력합니다.
	 - 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력합니다.
	 
	 -MyCart 선언이 완료되었다면 MainClass에서 buy메서드를 호출합니다.
	 */
	
	public void info() {
		System.out.println("-----------------------");
		System.out.println("*** 현재 장바구니 정보 ***");
		
		int sum = 0; // 총 상품의 합계를 담아줄 변수입니다.
		
		
		/* 일반 for문으로도 가능합니다.
		 for(int idx=0; idx < i; i는 위에서 상품의 개수의 지표 idx++){
		 	System.out.println(cart[idx].name + " ");
		 	sum += cart[idx].price
		 */
		
		
		
		//향상 for문
		for (Product P : cart) { //cart를 돌리고 싶습니다.
			if(p == null) break;
			System.out.println(p.name + " ");
			sum += p.price;
		}
		System.out.println();
		System.out.println("구매 금액 합계: " + sum + "원");
		System.out.println("남은 금액: " + this.money);
		
	}
