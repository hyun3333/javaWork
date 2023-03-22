package etc.api.util.random;

import java.util.Random;

public class RandomExample {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
//		실수 난수 : 0.0 <= ~ < 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
//		정수 난수 : nextInt();
		int i = r.nextInt(); // int의 전 범위
		System.out.println(i);
		
//		0 ~ 5까지의 정수 난수를 생성하는 방법 (끝값이 미만으로 인식됨)
		int j = r.nextInt(6);
		System.out.println(j);
	
//		10 ~ 100까지의 정수 난수를 생성하는 방법
		int k = r.nextInt(91) + 10; 
		// 앞자리 잡을때 (??)+ n 뒷자리는 더한 숫자만큼 - n을 빼준다
		
		boolean flag = r.nextBoolean();
		System.out.println(flag);
		
		
		
		
		
		
		
		
		
		
		
	}

}
