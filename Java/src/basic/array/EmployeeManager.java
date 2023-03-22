package basic.array;

import java.util.Scanner;

public class EmployeeManager {

	public static void main(String[] args) {
//		SpringApplication.run(DemoApplication.class, args);

		Scanner sc = new Scanner(System.in);
		// 사원의 정보 : 사번, 이름, 나이, 부서명

		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];

		// 실제로 입력된 데이터 (사원의 정보)의 개수를 체크하는 변수.
		int count = 0;

		while (true) {
			System.out.println("\n======== 사원 관리 프로그램 ========");

			System.out.println("#1. 사원 정보 신규 등록");
			// 사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
			// 사번은 중복되면 안됩니다. 이름은 같은 이름이 있기 때문에 중복이되도 상관이 없다
			// (무한루프를 구현해서 중복이 발생하면 다시 입력받기.)

			System.out.println("#2. 모든 사원 정보 보기");
			// 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
			// 만약 사용자가 사원 등록을 한 명도 하지 않았다면
			// "등록된 사원 정보가 없습니다." 를 출력하시면 됩니다

			System.out.println("#3. 사원 정보 검색");
			// 입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
			// 입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.

			System.out.println("#4. 사원 정보 수정");
			// 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
			// 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
			// 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
			// 사번이 존재하지 않는다면 없다고 얘기해 주세요.

			System.out.println("#5. 사원 정보 삭제");
			// 해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
			// 삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
			// y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
			// 배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
			// 앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

			System.out.println("#6. 프로그램 종료");
			System.out.println("=================================");

			System.out.print("> ");
			int menu = sc.nextInt();

			boolean saveFlag = true;

			String user = "";
			String name = "";
			int ag = 0;
			String depar = "";

			if (menu == 1) {

				// 사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
				// 사번은 중복되면 안됩니다. 이름은 같은 이름이 있기 때문에 중복이되도 상관이 없다
				// (무한루프를 구현해서 중복이 발생하면 다시 입력받기.)

				while (true) {

					System.out.print("사번 : ");
					user = sc.next();

					for (int j = 0; j < userNums.length; j++) {
						if (user.equals(userNums[j])) {
							saveFlag = false;
							break;// 사번 저장
						} // if문 끝
					} // j포문 끝

					if (saveFlag == false) {
						System.out.println("중복 사번입니다.");
						saveFlag = true;
						continue;
					} // 중복사번 골라내기

					System.out.print("이름 : ");
					name = sc.next();
					System.out.print("나이 : ");
					ag = sc.nextInt();
					System.out.print("부서명 : ");
					depar = sc.next();

					userNums[count] = user;
					names[count] = name;
					ages[count] = ag;
					departments[count] = depar;

					count++;

					break;
				} // 1.번 if for문 끝

			} else if (menu == 2) {

				// 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
				// 만약 사용자가 사원 등록을 한 명도 하지 않았다면
				// "등록된 사원 정보가 없습니다." 를 출력하시면 됩니다

				System.out.print("====================================\n");
				for (int i = 0; i < count; i++) { // 추가한 배열 나열하기

					System.out.print("사번 : " + userNums[i] + "\n");
					System.out.print("이름 : " + names[i] + "\n");
					System.out.print("나이 : " + ages[i] + "\n");
					System.out.print("부서명 : " + departments[i] + "\n");
					System.out.print("====================================\n");
				}
			} else if (menu == 3) {

				// 입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
				// 입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.

				System.out.print("사번 : ");
				user = sc.next();
				int j;
				for (j = 0; j < count; j++) {
					if (user.equals(userNums[j])) { // 사번을 입력해서 그 안에 있는 배열을 나열하기

						System.out.print("====================================\n");
						System.out.print("사번 : " + userNums[j] + "\n");
						System.out.print("이름 : " + names[j] + "\n");
						System.out.print("나이 : " + ages[j] + "\n");
						System.out.print("부서명 : " + departments[j] + "\n");
						System.out.print("====================================\n");

						break;
					}
				}
				if (j == count) {
					System.out.println("조회하신 사원정보는 존재하지 않습니다.");
				}
				// j포문 끝
			} else if (menu == 4) {

				// 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
				// 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
				// 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
				// 사번이 존재하지 않는다면 없다고 얘기해 주세요.

				System.out.print("사번 : ");
				user = sc.next();

				boolean exists = false;

				for (int j = 0; j < count; j++) { // 사번을 입력해서 변경하기

					if (user.equals(userNums[j])) {

						// 수정
						System.out.print("1. 나이변경 or 2. 부서변경 or 3.취소 : ");
						int idx = sc.nextInt();

						if (idx == 1) {
							System.out.print("나이 : ");
							ag = sc.nextInt(); // 나이변경
							ages[j] = ag;
						} else if (idx == 2) {
							System.out.print("부서명 : ");
							depar = sc.next();
							departments[j] = depar; // 부서변경
						} else if (idx == 3) {
							System.out.print("변경을 취소합니다."); // 취소
						} else {
							j--;
							System.out.print("없는 숫자입니다 다시 입력하세요.");
							continue; // 다시 선택
						}
						
						exists = true;

						break;
					}
				} // j포문 끝

				if (exists == false) { // 사번이 없을때 메뉴로 돌아간다
					System.out.print("사번이 존재하지 않습니다.");
				}

			} else if (menu == 5) { // 사번을 입력받아 삭제하고 뒤에 있는 배열을 앞으로 땡기는 작업

				// 해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
				// 삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
				// y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
				// 배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
				// 앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.

				System.out.print("사번 : ");
				user = sc.next();

				int j;
				boolean exists = false;

				for (j = 0; j < count; j++) {

					if (user.equals(userNums[j])) {

						System.out.print("정말 삭제하시겠습니까? ");
						String yn = sc.next();
						if (yn == "Y") {
							// 삭제
							userNums[j] = null;
							names[j] = null;
							ages[j] = 0;
							departments[j] = null;
							count--;
							exists = true;
						}
						break;
					}
				}

				if (exists == true) {
					for (int i = j; i < count; i++) {

						userNums[i] = userNums[i + 1];
						names[i] = names[i + 1];
						ages[i] = ages[i + 1];
						departments[i] = departments[i + 1];
					}
				}

			} else if (menu == 6) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break; // while true break
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
				// continue 써도 되지만 마지막이라 자동으로 위로 올라가기 때문에 굳이 안써도 된다.
			}

		} // end while true (표시를 해두면 어디까지인지 확인하기 쉽다) *개꿀팁*
	}

}
