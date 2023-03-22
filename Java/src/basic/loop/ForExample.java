package basic.loop;

import java.util.Scanner;

// 반복문 (For문)
public class ForExample {

	public static void main(String[] args) {
		 
//		int i = 1;
//		while(i <= 10) {
//			total += i;
//			i++;
//		}
		
		int total = 0;
		for(int i=1; i<=10; i++) {
			total += i;
		}
		
		//1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		//가로로 출력해 보세요. (for)
		
		for(int s = 1; s <= 200; s++) {
			if(s % 6 == 0 && s % 12 != 0) {
				System.out.print(s + " ");
			}
		}
		
		//1~60000까지의 정수 중 177의 배수의 개수를 구해보세요
		System.out.println("----------------------");
		int count = 0;
		
		for(int i = 1; i <= 60000; i++) {
			if(i % 177 == 0) {
				count++;
			}
		}
		System.out.print("1~60000까지 정수중 177의 배수의 개수 " + count);
		
		//입력받은 정수까지의 팩토리얼 값을 구하세요.
		//팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1
		System.out.println("-----------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int p = sc.nextInt();
		int ii = 1;
		for(int i = 1; i <= p; i++) {
			ii = ii * i;
		}
		System.out.print(p + "! : " + ii);
		
		
		
		sc.close();
		
		
		
		
		
		
	}

}
