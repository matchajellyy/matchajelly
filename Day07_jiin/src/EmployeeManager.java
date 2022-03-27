import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//사원의 정보: 사번, 이름, 나이, 부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];
		
		int count = 0; // 실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수
		
		while(true) {
			System.out.println("\n==========사원 관리 프로그램==========");
			System.out.println("# 1. 사원 정보 신규 등록");
			System.out.println("# 2. 모든 사원 정보 보기");
			System.out.println("# 3. 사원 정보 검색");
			System.out.println("# 4. 사원 정보 수정");
			System.out.println("# 5. 사원 정보 삭제");
			System.out.println("# 6. 프로그램 종료");
			System.out.println("========================================");
			
			System.out.println("메뉴 입력: ");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				//사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				//사번은 중복되면 안됩니다.
				//무한루프를 구현해서 중복이 발생하면 다시 입력받기
				
				System.out.println("# 사원정보 등록을 시작합니다.");
			
				System.out.println("사번: ");
				String userNum = sc.next();
				while(true) { //중복인지 확인
					boolean flag = false;
					for(int i=0; i<count; i++) {//i<userNums.length 도 가능
						if(userNum.equals(userNums[i])) { //입력한 사번이 이미 존재하는 경우
							System.out.println("중복된 사원입니다.");
							flag = true;
							break;
						}
				}
					if(!flag) { //중복이 발생하지 않았다면,
						userNums[count] = userNum;
						break; // 사번 확인용 무한 루프를 탈출
					}
					System.out.println("- 사번 재입력:");
					userNum = sc.next();
						
					}
				
				System.out.println("이름: ");
				names[count] = sc.next();
				
				System.out.println("나이: ");
				ages[count] = sc.nextInt();
				
				System.out.println("부서명: ");
				departments[count] = sc.next();
				
					//지금 등록된 사람의 이름을 언급하면서 
				System.out.println(names[count] + "님의 정보가 정상 등록되었습니다.");
				count++; // 다음 사람은 다음 인덱스에 저장해야 하니까 작성 끝나면 올려두기
			
			}else if(menu == 2) {
				
				//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성
				//만약 사용자가 사원 등록을 한 명도 하지 않았다면,
				//등록된 사원 정보가 없습니다."를 출력하시면 됩니다.
				
				if(count==0) {
					System.out.println("등록된 사원 정보가 없습니다.");
				}else {
					System.out.println("==========전체 사원 정보==========");
					for(int i=0; i<count; i++) {
						System.out.printf("%s %s %d세 %s\n", userNums[i],
								names[i], ages[i], departments[i]);
					}
				}

			}else if(menu == 3) {
				System.out.println("# 조회하실 사원의 번호를 입력하세요.");
				System.out.println("> ");
				String userNum = sc.next();
				
				//입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				//입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다"를 출력하세요.
				
				/*
				int i;
				for(i=0; i<count; i++){
				if(userNum.equals(userNums[i])){
				System.out.printf("%s %s %d세 %s",userNums[i],
								names[i], ages[i], departments[i]);
								break;
								}
								}
				if(i == count){
				System.out.println("조회하신 사원의 정보가 없습니다.");
				}
				 */
				
				
				
				
				
				int idx = 0;
				while(true) {
					boolean flag = false;
					if(userNum.equals(userNums[idx])) {
						System.out.printf("%s %s %d세 %s",userNums[idx],
								names[idx], ages[idx], departments[idx]);
						flag = true;
						break;
					}
				
				if(!flag) {
					System.out.println("조회하신 사원의 정보가 없습니다.");
					break;
				}
				
				}
				
				
			}else if(menu == 4) {
				
				//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				//프로그램을 구성하고, 나이와 부서를 수정하는 코드를 작성하세요.
				//사번 입력 -> 존재하는 사번이 맞다면 -> [1.나이변경|2.부서변경|3.취소]
				//사번이 존재하지 않는다면 없다고 얘기해 주세요.
				
				System.out.println("# 수정하실 사원의 번호를 입력하세요.");
				System.out.println("> ");
				String userNum = sc.next();
				
				boolean flag = false;
				for(int i=0; i<count; i++) {
					if(userNum.equals(userNums[i])) {
						System.out.println("# " +names[i] + "님의 정보를 변경합니다.");
						System.out.println("[1.나이변경|2.부서변경|3.취소]");
						System.out.println("> ");
						int choose = sc.nextInt();
						
						switch(choose){
						case 1:
							System.out.println("- 변경하실 나이를 입력하세요");
							System.out.println("> ");
							ages[i] = sc.nextInt();
							System.out.printf("나이가 %d세 변경되었습니다.\n", ages[i]);
							break;
						case2:
							System.out.println("- 변경하실 부서를 입력하세요");
							System.out.println("> ");
							departments[i] = sc.next();
							System.out.printf("부서가 %s로 변경되었습니다.\n", departments[i]);
							break;
							
						case3:
							System.out.println("- 정보 수정을 취소합니다.");
						default:
							System.out.println("- 변경 메뉴를 잘못 입력하셨습니다.");
						}
						
						flag = true;
						break;
						
						
					}
				}
				
				if(!flag) {
					System.out.println("조회하신 사원번호는 존재하지 않습니다.");
				}
				
		
//				int idx = 0;
//				while(true) {
//					boolean flag = false;
//					if(userNum.equals(userNums[idx])) {
//						System.out.println("[1.나이변경|2.부서변경|3.취소]");
//						int choose = sc.nextInt();
//						if(choose == 1) {
//							int newAge = sc.nextInt();
//							userNums[idx] = userNum;
//						}else if(choose == 2) {
//							String newDepartment = sc.next();
//							
//						}
//						
//						System.out.printf(userNums[idx] + names[idx] + ages[idx] + departments[idx]);
//						flag = true;
//						break;
//					}
//				
//				if(!flag) {
//					System.out.println("조회하신 사원의 정보가 없습니다.");
//					break;
				}
		}
		
			}else if(menu == 5) {
				//해당 사번과 일치하는 사번의 4가지 정보를 각 배열에서 모두 삭제하고
				//삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				//Y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				//배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				//앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
				System.out.println("# 삭제하실 사원의 번호를 입력하세요.");
				System.out.println("> ");
				String userNum = sc.next();
				
				
				
				for(int=i; i<count; i++) {
					if(userNum.equals(userNums[i])) {
					System.out.println("삭제할 사원 이름: " + names[i]);
						System.out.println("정말 삭제하시겠습니까? [Y/N]");
						System.out.println("> ");
						String YN = sc.next();
						
				if(YN.equals(Y)) { //switch(answer){ case: "Y":
					for(int j=i; j<count-1; j++) { //맨 뒤의 값은 땡길 것이 없으니까 -1
						userNums[j] = userNums[j+1]; //바로 뒤의 값을 넣자
						names[j] = names[j+1];
						ages[j] = ages[j+1];
						departments[j] = departments[j+1];
					}
					count--; //비어 있지 않게 하기 위해서
					System.out.println("# 삭제가 정상적으로 진행되었습니다.");
					break;
				}else if(YN.equals(N)){ 
					System.out.println("# 삭제를 취소합니다.");
					break;
				}else {
					System.out.println("# 잘못 입력하셨습니다.");
					}
				flag = true;
				break;
					}
				}
				if(!flag) {
					System.out.println("#존재하지 않는 정보입니다.");
				
				
				
			}else if(menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			}else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				
				
				
				
			}
		}
		
		
		
	}

}
