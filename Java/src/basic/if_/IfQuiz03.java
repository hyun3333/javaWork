package basic.if_;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		 
		/*
		 # 스캐너를 사용하여 정수를 하나 입력받으세요.
		 
		 - 입력받은 값이 7의 배수라면 "7의 배수입니다." 를 출력.
		 - 입력받은 값의 7의 배수가 아니라면 "7의 배수가 아닙니다." 를 출력.
		 - 입력받은 값이 0이라면 "0입니다." 를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
//		0이랑 같을때(==)의 결과값
		if(num1 == 0) {
			System.out.println("0입니다.");
		} 
//		7로 나눴을때(%) 나머지가 0이 아닌(!=) 나머지의 값
		else if(num1 % 7 != 0) {
			System.out.println("7의 배수가 아닙니다.");
		} 
//		7로 나눴을때 나머지가 0인 값 else if로 작성할때(num1 % 7 == 0) 
//		if 로 작성할때 (num1 % 7 == 0 && num1 != 0) 
//		(num1 == 0)을 else if 로 내릴 수 있다
		else {
			System.out.println("7의 배수입니다.");
		}
		
		
		
		
		
		sc.close();

	}

}
