package basic.switch_;

import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		 
		/*
		 - 정수를 하나 입력받고, 연산자를 하나 입력 받으세요.
		 다시 정수를 입력받아서, 사용자가 선택한 연산자를 기준으로
		 연산 결과를 출력해 주시면 됩니다. (switch문 사용)
		 연산자가 잘못 입력되었다면 연산자를 똑바로 입력하라고
		 결과를 말씀해 주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사칙연산 (+,-,*,/)를 입력해 주세요 : ");
		String pl = sc.next();
		
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int result = 0;
		boolean flag = true;
		
		System.out.println("-----------------------------------------");
		
		
		switch (pl) {
		
		case "+":
			result = num1 + num2;
			break;
		
		case "-":
			result = num1 - num2;
			break;
		
		case "*":
			result = num1 * num2;
			break;
		
		case "/":
			if(num2 == 0) {
				System.out.println("연산할 수 없는 입력값입니다.");
				flag = false;
				break;
			}
			result = num1 / num2;
			break;
		
		default:
			System.out.println("사칙연산이 입력되지 않았습니다.");
			System.out.println("(+,-,*,/)");
			flag = false;
		}
		
//		flag가 true 일때 !flag는 flag == false와 같다
//		반대로 flag가 false일때 !flag는 flag == true와 같다
		if(flag) {
			System.out.printf("%d %s %d = %d\n", num1, pl, num2, result);
		}
		
		
		/*
		switch (pl) {
		
		case "+": 
			System.out.println((num1 + num2) + "입니다");
			break;
		
		case "-":
			System.out.println((num1 - num2) + "입니다");
			break;
		
		case "*":
			System.out.println(num1 * num2 + "입니다");
			break;
		
		case "/":
			if (num2 == 0) {
				System.out.println("연산할 수 없는 입력값 입니다.");
				break;
			}
			System.out.println(num1 / num2 + "입니다");
			break;
			
		default:
			System.out.println("사칙연산이 입력되지 않았습니다.");
			System.out.println("(+,-,*,/)");
		
		}
		*/
		sc.close();
		
	}

}
