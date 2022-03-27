import java.util.Arrays;

public class MethodQuiz01 {
	//1.
	static void method1 () {
		System.out.println("안녕");
	}
	
	//2.
	static String method2 (String str) {
		return str;
	}
		
	static double method3 (int n1, int n2, double d) {
		return  n1 + n2 + d;
	}
	
	static String method4(int i) {
		if(i % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
		
		
		//5.
		static void method5(String s, int i ) {
			for(int j=1; j<=i; j++) {
				System.out.println(s);
			}
		}
		//Num
		static int maxNum (int n1, int n2) { //return i > j ? i : j;
			if(n1 > n2) {
			return n1;
			}else {
			return n2;
		}
		
	}
		
		//abs
		static int abs(int i){
			return i < 0 ? i : -i;
		}
		//6
		static int method6(int i) {
			int total = 0;
			for(int j=0; j<i; j++) {
				total += j;
			}
			return total;
		}
		
		//7.
		static int method7(int[] arr) {
			return arr.length;
		}
		
		//8.
		static String[] method8(String s1, String s2) {
			return new String[] {s1,s2};
		}
		//과제.
		static String java(int i) {
			String result = "";
			for(int j=1; j<=i; j++) {
				if(j % 2 != 0) {
					result += "자";
				}else{
					result += "바";
				}
			}
			return result;
		}
	
	
	
	
	public static void main(String[] args) {
		//1.
		method1();
		//2.
		System.out.println(method2("안녕하세용"));
		//3.
		System.out.println(method3(3,4,3.14));
		//4
//		System.out.println(method4(23));
		//5.
		method5("메롱메롱", 3);
		//Num
		System.out.println(maxNum(22,1));
		//abs
		System.out.println(-44);
		//6.
		System.out.println(method6(100));
		//7.
		System.out.println("배열의 길이는" + method7(new int[] {1,2,3,4,5}));
		//8.
//		System.out.println(method8("자바", "java")); 주소값이 튀어나옴
		System.out.println(Arrays.toString(method8("자바", "java")));		
		//과제
		System.out.println(java(10));
	}

}
