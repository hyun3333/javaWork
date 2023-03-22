package basic.loop;

import java.util.Scanner;

public class BreakQuiz02 {

	public static void main(String[] args) {
		 
		/*
        # UP&DOWN 게임을 제작합니다.
        1. 기준이 되는 수는 난수 범위 1~100까지로 지정해 주세요.
        2. 사용자에게 정답을 입력받아서, 기준이 되는 수보다
        작은 수를 입력하면 UP, 큰 수를 입력하면 DOWN이라고 출력해서
        정답에 근접할 수 있도록 유도해 주세요.
        3. 승리 조건 횟수는 7회로 제한하겠습니다.
        7회가 넘어가도 정답은 계속 맞출 수 있도록 작성해 주세요.
        정답을 맞췄다면, 반복문 종료와 함께 승리/패배 여부를 알려 주세요.
        */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ~ 100 까지의 Up Down 숫자게임");
		System.out.println("숫자를 입력해주세요. : ");
		int number = (int)((Math.random()*100)+1);
		
		int count = 0;
		while (true) {
			int i = sc.nextInt();
			
			if (number == i) {
				System.out.println("정답입니다!");
				System.out.println(count + "번 만에 맞추셨습니다.");
				break;
			} else if (number > i) {
				System.out.println("Up");
				System.out.println("정답 기회 " + count + "번 남았습니다.");
				if (count == 3) {
					System.out.println("정답 기회를 다 쓰셨습니다.");
					System.out.println("마저 정답을 맞춰주세요.");
				} else if (count == 0) {
					System.out.println(" 패배 하셨습니다!");
					break;
				}
			} else {
				System.out.println("Down");
				System.out.println("정답 기회 " + count + "번 남았습니다.");
				}
			}
				count--;

				sc.close();
	}

}