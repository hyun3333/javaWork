package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {
		 
		/*
		 2~19까지의 난수를 생성하셔서 구구단을 출력해 보세요.
		 19행까지 출력하세요.
		 */
		
		int num1 = (int) ((Math.random()*18)+2);
		
		int total = 1;
		
		for(int i = 1; i <= 19; i++) {
			total = num1 * i;
			System.out.printf("%d * %d = %d\n", num1, i, total);
		}
		
		
		
		
		
		
		
		
		

	}

}
