package basic.begin;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
//		이름 입력하는 곳
		System.out.print("이름 : ");
		String name = sc.next();
	
//		나이 입력하는 곳
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
//		출생년도 계산
		int year = 2023 - age + 1;
		
//		입력 도출 하는곳
		System.out.printf("이름은 %s이고 나이는 %d 입니다 출생년도는 %d년 입니다", name, age, year);
		
		sc.close();
		
		

	}

}
