package basic.loop;

import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		
	/*
	 # 사용자에게 구구단 단수를 입력받아서
	 해당 단수의 구구단을 출력해 보세요.
	 */
	Scanner sc = new Scanner(System.in);
	int s1 = sc.nextInt();
	
	int s = (int) ((Math.random()*9) + 1);
		System.out.println("구구단을 입력하세요 : ");
		
	int s2 = 1;
	String st = "*";
	
		System.out.printf("*** 구구단 %d 단 ***\n", s);
	
	while(s2 <= 9) {
		if(s1 >= 1 && s1 <= 9) {
			int s3 = s1 * s2;
			System.out.printf("%d * %d = %d", s1, s2, s3);
		} else {
			System.out.println("1 ~ 9까지의 숫자를 입력해주세요.");
		}
		
		
		s2++;
		
		
		
		
		
		
//	while(s2 <= 9) {
//		
//		int s3 = s * s2;
//		System.out.printf("%d %s %d = %d\n", s, st, s2, s3);
//		
//		s2++; // 1 +
	}
	sc.close();
	
	}
}
