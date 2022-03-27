
public class WhileExample2 {

	public static void main(String[] args) {
	
		// 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력
		
		int n = 48;
		while (n <= 150) {
		if (n % 8 ==0) {
		System.out.print(n + " ");
		
	}
		n++;
	}
		
		
		int i = 1;
		while (i <= 100) {
			if (i % 4 ==0 && i % 8 !=0) {
				System.out.print(i + " ");
			}
			i++;
	}
		
		System.out.println();
		
		int x = 1;
		int count = 0;
		
		while (x <= 30000) {
		if(x % 258 == 0) {
		count++;
		}
		x++;
		System.out.print(x + "1~30000 중 258의 배수의 개수: " );
		
			}
		
		
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠 보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
	int k = 1;
	int cnt = 0;
	while(k <= 1000) {
		if(1000 % k == 0) {
			cnt++;
		}
		k++;
		}
	System.out.printf("1000의 약수의 개수: %d개\n", cnt);
		
	}
}
		
		
		
		
		
		
		




