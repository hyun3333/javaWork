package basic.if_;
// 조건문 (if 중첩문)

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		 
		/*
		 # if의 중첩문
		 
		 - else if문이 첫번째 조건식이 false일 경우 분기를 나눴다면
		   if의 중첩문은 첫번째 조건식이 true인 경우 분기를 나누는 방식입니다.
		   
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요. : ");
		int hei = sc.nextInt();
		
		if(hei >= 140) {
			System.out.println("나이를 입력하세요 : ");
			int age = sc.nextInt();
			if(age >= 8) {
				System.out.println("놀이기구 탑승이 가능합니다.");
			} else if(age >= 6) {
				System.out.println("보호자 동반 시 탑승이 가능합니다.");
			} else {
			    System.out.println("나이가 6세 미만입니다.");
			    System.out.println("놀이기구 탑승이 불가능합니다.");
			}
			
		} else {
			System.out.println("키가 140cm 미만입니다.");
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}
//		드래그 ctrl i 자동 들여쓰기
		
		sc.close();
		
	}

}
