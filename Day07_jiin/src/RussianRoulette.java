import java.util.Arrays;
import java.util.Scanner;

public class RussianRoulette {

	public static void main(String[] args) {
		/*
		- 게임 인원은 2~4명입니다.
		- 실탄 개수는 6개 미만으로 설정하겠습니다.
		- 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
		또한 총알의 위치도 랜덤으로 설정됩니다.
		- 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
		ex) [false, false, false, true, false, true]
		- 룰은 정해진 것은 없지만
		랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
		원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
		
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("게임 인원(2~4) --> ");
		int playerNum = sc.nextInt();
		
		if(playerNum < 2 || playerNum > 4) {
			System.out.println("게임 인원이 올바르지 않습니다. 게임을 종료합니다.");
			return; //main함수 종료
		}
		System.out.println("\n플레이어의 이름을 등록합니다.");
		String[] players = new String[playerNum]; //사용자의 이름이 들어 있는 배열
		for(int i=0; i<players.length; i++) {
			System.out.printf("%d번 플레이어 이름: ", i+1); //i가 0부터기 때문에 +1 해 준다.
			players[i] = sc.next();
			}
		System.out.println(Arrays.toString(players)+" 참가!");
		
		System.out.println("\n실탄 개수 (6미만): ");
		int bullet = sc.nextInt();
		
		if(bullet <1 || bullet > 5) {
			System.out.println("실탄 개수가 올바르지 않습니다");
			return;
		}
		System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
		boolean[] bulletPos = new boolean[6];
		int checkCount = 0; //실탄을 정확하게 장전한 횟수
		while(checkCount < bullet) {
			int position = (int) (Math.random()*bulletPos.length);
		}else {
			bulletPos[postion] = true;
			checkCount++;
		}
	}
	// 총알 배치 종료
//	while(true) {
//		if(checkCount == bullet) {
//			break;
	
		//실행 순서 정하기
	int startIdx = (int)(Math.random()*playerNum);
	System.out.printf("\n총을 돌렸습니다. %s부터 시작합니다.\n",
			players[startIdx]);

	//일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
	sc.nextline();
	
	while(true) {
		//최후의 1인이 남을 때까지 게임을 진행해 주세요.
		//또는 총알을 다 소비할 때까지 게임을 진행해 주세요.
		//총알을 사용하면 true 값을 false로 변경해 주세요.
		//사람이 한 명 out되면 배열의 크기를 줄여 주세요.

	}
	}
		
			
			

