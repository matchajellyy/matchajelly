import java.util.Scanner;

public class ForExample {
	
public static void main(String[] args) {

	/*
	 int i = 1;
	 int total = 0;
	 while (i <= 10 {
	 	total += i;
	 	i++;
	 	}
	 */
	
	int total = 0;
	for(int i=1; i <= 10; i++) {
		total += i;
	}
	
	for(int i = 1; i <= 200; i++)
		if(i % 6 == 0 && i % 12 != 0) {
			System.out.println(i + " ");
		}
	
	System.out.println();

	int count = 0;
	for(int a = 1; a <= 60000; a++)
		if(a % 177 == 0) {
			count++;
		}
	
	System.out.println("1~60000중 177의 배수의 개수: " + count + "개");
	System.out.println("----------------------------------");
	//입력 받은 정수까지의 팩토리얼값을 구하세요.
	Scanner sc = new Scanner(System.in);
	System.out.println("정수: ");
	
	int num = sc.nextInt();
	
	int fac = 1;
	
	for(int i = 1; i<=num; i++) {
		fac *= i;
	}
	
	
//	for(int i = num; i >= 1; i--) {
//		fac *= i;
//	}
	
	
	System.out.printf("%d!: %d\n", num, fac);
	
	sc.close();
	
			
		}
	
		
}
