package modi.constructor.pac2;

import modi.constructor.pac1.A;

public class C {

	A a1 = new A(false); //public
	A a2 = new A(23); //default 같은 패키지까지 접근 가능
	A a3 = new A(3.14); //private
	
}
