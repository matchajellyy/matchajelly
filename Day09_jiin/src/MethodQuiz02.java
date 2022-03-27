
public class MethodQuiz02 {
	static int calcDivisor(int num) {
	int count=0;
	System.out.print("약수: ");
	for(int i=1; i<num; i++) {
		if(num % i == 0) {
			System.out.print(i + " ");
			count++;
		}
	}
	System.out.println();
	return count;
}

	public static void main(String[] args) {
		System.out.println("72의 약수의 개수: " + calcDivisor(72) +"개");
		System.out.println("10의 약수의 개수: " + calcDivisor(10)+ "개");
	}

}
