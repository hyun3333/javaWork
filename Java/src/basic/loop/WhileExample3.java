package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		 
		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		   인지를 판별하시면 됩니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 :");
		int num = sc.nextInt(); //고정값
		
		int num1 = 1; //고정값 약수
//		소수의 판별을 위해 입력받은 정수 num을 지속적으로 나누어 볼 변수. 반복문
		
		int num2 = 0; //고정값 약수의 개수
//		나누어 떨어진 횟수를 기억할 변수. (용기,그릇)
		
		while (num1 <= num) {
			if (num % num1 == 0) {
				num2 += 1;
			}
			
			num1++;
		}
		if (num2 == 2) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
		
		System.out.println("---------------------------------");
		
		int j = 2;  //1은 모든 수의 약수이기 때문에 배제한다.
		
		while(num % j != 0) {
			j++;
		}
		System.out.println(num == j ? "소수입니다." : "소수가 아닙니다.");
		
		
		
		sc.close();

	}

}
