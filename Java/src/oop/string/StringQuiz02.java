package oop.string;

import java.util.Scanner;

public class StringQuiz02 {

	public static void main(String[] args) {
		 
		/*
		 
		 1. 주민등록번호 13자리를 입력받습니다.
		 
		 2. 주민등록번호는 -을 포함해서 받을 예정입니다.
		 
		 3. 13자리가 아니라면 다시 입력받습니다.
		 
		 4. 남자인지 여자인지를 구분해서 출력해 주시면 됩니다.
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		String num;
		
		while (true) {
			System.out.println("주민등록번호 13자리를 - 포함하여 입력해주세요");
			System.out.println("> ");
			num = sc.next();
			System.out.println(num);
			char c = num.charAt(7);
			if (num.length()<14 || num.length()>14) {
				System.out.println("주민등록번호를 잘못 입력하셨습니다.");
			} else {
				if (c == '1' || c == '3') {
					System.out.println("당신은 남성입니다.");
					break;
				} else if (c == '2' || c == '4') {
					System.out.println("당신은 여성입니다.");
					break;
				} else {
					System.out.println("당신의 성별은 무엇입니까?");
				}
			}

		}
		
		
		sc.close();
		

	}

}
