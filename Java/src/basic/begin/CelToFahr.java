package basic.begin;

import java.util.Scanner;

public class CelToFahr {

	public static void main(String[] args) {
		 
		/*
		 사용자에게 섭씨온도를 입력받아서
		 화씨온도로 변환하여 출력하는 로직을 작성하세요.
		 변환공식은 직접 찾아서 적용해 주셔야 합니다.
		 화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
		 ℃ 섭씨 ℉ 화씨  
		 섭씨 에서 화씨로 변환하는 법
		 (℃ * 1.8) +32
		 */
		
		Scanner sc = new Scanner (System.in);
		
//		섭씨 입력
		System.out.print("℃ : ");
		double c = sc.nextDouble();
		
//		섭씨->화씨 계산공식 
		double f = (c * 1.8) + 32;
		
//		섭씨와 화씨 도출하는 곳
		System.out.printf("오늘의 ℃ : %.1f\n오늘의 ℉ : %.1f", c, f);
		
		sc.close();
		
		
		
				
				
		
		
		
		
		
		
		
	}

}
