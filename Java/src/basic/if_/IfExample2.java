package basic.if_;
// 조건문 else if (세분화 작업)

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
//		조건문 if
		if(age >= 20) {
			System.out.println("성인입니다.");
		} 
//		*순차적으로 써야한다*
//		조건문 if이외의(else) 조건문 if 1 
		else if(age >= 17) {
			System.out.println("고등학생입니다.");
		} 
//		조건문 if이외의(else) 조건문 if 2
		else if(age >= 14) {
			System.out.println("중학생입니다.");
		} 
//		조건문 if이외의(else) 조건문 if 3
		else if(age >= 8) {
			System.out.println("초등학생입니다.");
		} 
//		조건문 if이외의(else) 조건문 if 3 이외의 나머지 (else)
		else {
			System.out.println("미취학 아동입니다.");
		}
		

		
		sc.close();

	}

}
