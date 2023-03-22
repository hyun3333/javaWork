package basic.loop;

import java.util.Scanner;

public class WhileQuiz02 {
	
	public static void main(String[] args) {
	
//		입력받은 수의 약수의 총 합을 구하세요.
//		입력받은 값 : 12 - > 1 2 3 4 6 12 -> 28
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받은 값 : ");
		int y = sc.nextInt(); // 고정값 1000
		
		int t = 1; // 고정값을 나눠서 약수를 찾아줄 값 반복문을 돌릴 애
			
		int y1 = 0; // 고정값에 대한 약수의 총 합 반복문을 돌려서 나온 애를 담는 그릇
		
		while (t <= y) {
			if (y % t == 0) {
				y1 += t;
			}
			t++;
		}
		System.out.printf("%d의 약수의 총 합은 = %d\n", y, y1);
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
}
}
