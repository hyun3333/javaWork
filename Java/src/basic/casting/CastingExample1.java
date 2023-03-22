package basic.casting;
// 자동 형 변환 : 작은쪽에서 큰쪽으로 변환할때
public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		   자바 가상 머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		   (promotion, UpCasting)
		   정수->실수 집합개념으로 생각하면 된다
		   (boolean 과 String은 형 변환 x )
		 */
		
		
		byte b = 10;
		int i = b; 
		// byte -> int 형변환
		System.out.println(i);
		
		char c = 'A';
		int j = c; 
		// char -> int 형변환 (char를 int로 자동 변환해준다)
		System.out.println("A의 문자 번호 : " + j);
		
		int k = 500;
		double d = k;
		// int -> double 형변환
		System.out.println(d);
		
		

	}

}
