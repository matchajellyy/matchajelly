import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
	System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));
	System.out.println("삭제할 친구를 입력하세요: ");
	String name = sc.next();
	
	//삭제할 친구를 입력받아서 삭제를 진행하세요.
	//입력받은 이름이 없다면 없다고 얘기해 주세요.
	
	
	boolean flag = false;
	for(int i=0; i<kakao.length; i++) { //i가 가리키는 값이 삭제할 값
		if (name.equals(kakao[i])) {
			flag = true;
			for(int j=i; j<kakao.length-1; j++ ) {
				//맨 마지막 값은 더이상 땡겨올 수 없기 때문에
				//삭제하려고 하는 값을 기준으로 뒤의 값을 땡겨 올 것이다
				kakao[j] = kakao[j+1];
			}
			break;
			
		}
	}
	if(!flag) {
		System.out.println("은 없는 이름입니다.");
		
	}else {
		String[] temp = new String[kakao.length-1]; //기존보다 작은 배열
		for(int k=0; k<temp.length; k++) {
			temp[k] = kakao[k]; //위에서 땡기는 작업을 해 놨기 때문에 k대로
	}
		kakao = temp;
		temp = null;
		System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
		
	}
	sc.close();
		
	}
}

