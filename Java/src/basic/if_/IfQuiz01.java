package basic.if_;

import java.util.Scanner;

public class IfQuiz01 {

	public static void main(String[] args) {
		
		/*
		 키와 나이를 입력받아서 사용자가 놀이기구에
		 탑승 할 수 있는지의 여부를 판단 하시면 됩니다.
		 키 140cm 이상. 나이가 8세 이상인 사용자만
		 놀이기구 탑승이 가능하다고 가정하고, 판단할 수 있는
		 로직을 작성해 보세요.
		 하나의 조건이라도 만족하지 못한다면 탑승이 불가능합니다.
		 
		 놀이기구 탑승 여부와 관계없이 "오늘 하루 즐거운 시간 되세요!"
		 를 출력하세요.
		 */
//		스캐너
		Scanner sc = new Scanner (System.in);

//		키 입력하는 위치 
		System.out.print("당신의 키를 입력하세요. : ");
		int hei = sc.nextInt();
		
//		나이 입력하는 위치
		System.out.print("당신의 나이를 입력하세요. : ");
		int age = sc.nextInt();
		
//		키와 나이를 도출 하는곳
		System.out.println("키 : " + hei + "나이 : " + age);
		
//		조건문 if(적합or부적합) else (적합의나머지)
		if(hei>=160 && age>=8) {
			System.out.println("키와 나이가 적합 합니다.");
			System.out.println("놀이기구에 탑승이 가능합니다.");
		} 
		
//		else (적합의나머지)
		else {
			System.out.println("키나 나이가 적합하지 않습니다.");
			System.out.println("놀이기구에 탑승이 불가능합니다.");
		}
		System.out.println("오늘 하루 즐거운 시간 되세요!");
		
		
		sc.close();
		
	}
}
