package basic.if_;

import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		 
		/*
		 정수를 2개 입력받아서, 두 정수 중 어느 수가 큰 지
		 혹은 같은지를 판별하시면 됩니다.
		 ex)
		 입력받은 수 : 4, 7 -> 7이 큰 수 입니다.
		 입력받은 수 : 10, 3 -> 10이 큰 수 입니다.
		 입력받은 수 : 5, 5 -> 같은 수 입니다.
		 */
		Scanner sc = new Scanner(System.in);
//		첫번째 숫자 입력
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
//		두번째 숫자 입력
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
//		첫번째와 두번째 도출결과
		System.out.println("첫번째 숫자 : " + num1 + " 두번째 숫자 : " + num2);
		
//		조건문 if
		if(num1 > num2) { 
			System.out.println(num1 + "이(가) 큰 수 입니다.");
		} 
		
//		if 그 외 조건문 else if
		else if(num1 < num2) {
			System.out.println(num2 + "이(가) 큰 수 입니다.");
		} 
		
//		else if 이외의 나머지 결과
		else {
			System.out.println("같은 수 입니다.");
		}
		
		sc.close();
		
		
		
		

	}

}
