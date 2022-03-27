package encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
//		my.day = 03; x
		my.setYear(1997);
		my.setMonth(1);
		my.setDay(3);
		
		System.out.printf("내 생일은 %d년 %d월 %d일입니다.\n"
				,my.getYear(),my.getMonth(),my.getDay());
	}

}
