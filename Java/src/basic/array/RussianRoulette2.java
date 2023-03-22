package basic.array;

import java.util.Scanner;

public class RussianRoulette2 {

	public static void main(String[] args) {
		
		/*
        - 게임 인원은 2 ~ 4명 입니다.
        - 실탄 개수는 6개 미만으로 설정하겠습니다.
        - 게임이 시작되면, 시작 인원은 랜덤으로 순서가 설정됩니다.
         또한 총알의 위치도 랜덤으로 설정됩니다.
        - 총알의 위치는 boolean 타입의 배열로 선언하여 배치하였습니다.
        ex)  [false, false, false, true, false, false]
        - 룰은 정해진 것은 없지만, 한명이 사망하면 총알의 위치를 
         랜덤으로 바꿔서 남은 인원으로 다시 진행을 할 생각입니다.
         원하는 규칙이 있다면 자유롭게 커스텀해서 작성해 보세요.
        */
		Scanner sc = new Scanner(System.in);
		
		// 1. 게임 인원 입력
		
		int full = 0;
		int i;
		
		while (true) {
			System.out.println("게임에 참가하실 인원을 입력하세요.");
			System.out.println("최소 2인 최대 4인까지 참여 가능합니다.");
			System.out.print("> ");
			full =  sc.nextInt(); // 인원
			
			
			if(2>full || 4<full) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			} else if (2<=full || full<=4) {
				System.out.println(full + "명의 인원을 선택하셨습니다.");
			}
			
			
			break;
		}
		
		// 2. 플레이어 이름 등록
		// 배열을 하나 생성해서 플레이어들을 배치하시면 됩니다.
		// 배열의 크기는 게임 참가자의 명수와 동일합니다.
		
		String[] userNames = new String [full];
		
		String user = "";
		
		for (i=0; i<full; i++) {
			
			System.out.println("참가자의 이름을 등록하세요.");
			System.out.print("> ");
			user = sc.next();
			
			userNames[i] = user;
			
			System.out.println(userNames[i] + "님이 참가하셨습니다.\n");
		}
		
		// 실탄 개수 입력(1미만이면 안되고 5초과도 안된다)
		
		// 실탄을 탄창에 배치합니다.
		
		int bullet = 0;
		while (true) {
			System.out.println("총알의 개수를 입력하세요");
			System.out.println("최소 1발부터 최대 5발까지 입력가능");
			System.out.print("> ");
			bullet = sc.nextInt(); // 총알 개수
			if (bullet<1 || bullet>5) {
				System.out.println("총알의 개수가 맞지 않습니다");
				continue;
			} else if (bullet>0 || bullet<6) {
				System.out.println(bullet + "발을 선택하셨습니다.");
			}
			
			break;
		}
		
		
		// 난수를 생성하셔서 실탄을 탄창에 배치합니다.
		// false -> true로 바꾸는 것이 실탄 장전입니다.
		// 난수는 중복으로 발생 할 가능성이 있기 때문에 중복 방지 로직을 세워서
		// 같은 위치에 두개의 실탄이 장전되지 않도록 해 주시면 됩니다.
		
		boolean[] bulletPos = new boolean[6];
		
		int count = 0; // 실탄을 정확하게 장전한 횟수.
		
		while (count < bullet) {
			int ran = (int) (Math.random()*bulletPos.length); 
			// bulletPos.length만큼의 난수를 발생시킨다
			
			if (bulletPos[ran] == true) {
				continue;
				// 총알이 삽탄이 되어있는지 확인하는 작업
				// 총알이 삽탄이 되있으면 다시 while문 처음시작부분으로 올라간다
			} else {
				// 카운트에 적은 숫자만큼의 난수가 발생하고
				// 난수가 나온 숫자의 위치에 따라 true가 잡힌다
				// ex ) 카운트 3 난수 1 2 6
				// 		0인덱스 true 1인덱스 true 5인덱스 true
				bulletPos[ran] = true;
				count++;
			}
		}
		
//		System.out.println(Arrays.toString(bulletPos));
		
		// 실행 순서 정하기
		// 난수를 이용해서 실행 순서를 정합니다.
		// 시작 인덱스를 난수로 정해서 돌아가게 하셔도 되고
		// 아예 배치를 섞으셔도 상관없습니다.
		
		int human = (int) (Math.random()*userNames.length);
		
//		System.out.println(human); //난수 발생하는지 확인
		count = 0;
		sc.nextLine();
		while (true) {
			System.out.println("\n"+userNames[human] + "님의 차례입니다");			
			System.out.println("Enter를 누르시면 격발합니다.");
			sc.nextLine();
			
			System.out.println("격발");
			
			if (bulletPos[count]) {  //if 문은 죽는 사람이 발생한다
				System.out.println(userNames[human] + "님이 사망하셨습니다.");
				for (i=human; i<userNames.length-1; i++) {
					userNames[i] = userNames[i+1];					
				} // 첫번째 포문에서는 죽은사람을 배열에서 없애고 그 다음사람을 땡기는 작업
				
				String[] back = new String[userNames.length-1];
				
				for (int j=0; j<back.length; j++) {
					back[j] = userNames[j];
				} // 두번째 포문에서는 back.length의 값을 
				  // userNames.length의 -1값만큼 받는 작업이다 
				userNames = back; back = null;
				  // 두번째 포문에서 받은 벡의 값을 userNames에 넘겨주며 
				  // back을 빈 공간처리를 하는 작업이다.
			} else {
				System.out.println(userNames[human] + "님이 생존하셨습니다.");
				human++;
			}
			count++;
		}
		// 일부러 입력 대기를 해서 흐름을 잠시 끊어줍니다.
		// 이 입력값(enter)은 받아서 활용할 것이 아니기 때문에
		// 따로 변수를 선언하지 않습니다.
		
		
		
		// 최후의 1인이 남을 때 까지 게임을 진행해 주세요.
		// 또는 총알이 다 소비될 때 까지 게임을 진행해 주세요.
		// 총알을 소모하면 true값을 false로 변경해 주세요.
		// 사람이 한 명 아웃되면 배열의 크기를 줄여 주세요.
//sc.close();
	}

}
