package basic.casting;
// 자동 형 변환 : 큰쪽에서 작은쪽으로 변환할때
public class CastingExample2 {

	public static void main(String[] args) {
		 
		
		/*
		 - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
		   반드시 형 변환 연산자 : (type)를 사용하여 명시적으로
		   형 변환을 진행해 주셔야 합니다.
		   (DownCasting)
		   
		  - 명시적으로 형 변환을 해야 하는 이유는 , DownCasting의 경우
		    저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문입니다.
		    (overflow, underflow)가능성이 존재한다. 
		 */
		int i = 72;
		char c = (char) i;
		System.out.println("72의 문자값 : " + c);
		
		
		double d = 4.98765;
		int j = (int) d;
		System.out.println(j);
//		double 에서 int 로 내릴때 소숫점 숫자는 다 사라진다. 
//		(값의 손실 가능성이 있기때문에 추천하진 않는다.)
		
		int k = 1000;
		byte b = (byte) k;
		System.out.println(b);
		
		

	}

}
