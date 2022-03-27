package api.lang.wrapper;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a = 100;
		boolean b = false;
		char c = 'A';
		double d = 3.14;
		
		//boxing: 기본 데이터 타입을 객체 타입으로 변환하는 과정
		
		Integer v1 = new Integer(50);
		Boolean v2 = new Boolean(b);
		Character v3 = new Character(c);
		Double v4 = new Double(d);

		//autoboxing: 기본 타입을 자동으로 객체 타입으로 변환
		Integer x1 = 400;
		Boolean x2 = true;
		Character x3 = c;
		Double x4 = d;
		
		//autounboxing: 객체 포장을 기본형으로 해제 가능
		int i = x1;
		double d2 = x4;
		
		//autoboxing 이후에 wrapper 클래스는 문자열을 기본형으로
		//변환하는데 많이 사용됩니다.
		
		String s1 = "10";
		String s2 = "3.14";
		System.out.println(s1 + s2);
		 
		//문자로 이루어진 정수를 실제 정수로 변환하는 메서드
		int num = Integer.parseInt(s1);
		//문자로 이루어진 실수를 실제 실수로 변환하는 메서드
		double num2 = Double.parseDouble(s2);
		
		//해당 타입으로 변환할 수 없는 문자열을 시도했을 경우
		//NumberFormatException 예외가 발생합니다.
		System.out.println(num + num2);
		
	}

}
