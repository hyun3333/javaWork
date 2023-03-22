package basic.operator;
// 증감연산자
public class PlusMinusOperator {

	public static void main(String[] args) {
		
//		증감 연산자 (++.--)
//		변수의 값을 단순히 하나 올리거나 내릴 때 사용합니다.
		
		int i = 1;
		int j = i++;
		int k = i--;
		
//		후위 연선(선 연산 후 증감)j = 1+ k = 1-
		
		System.out.println("i의 값은 : " + i );
		System.out.println("j의 값은 : " + j );
		System.out.println("k의 값은 : " + k );

		System.out.println("--------------------------");
		
		int x = 1;
		int y = ++x;
		int z = --x;
		
//		전위 연산 (선 증감 후 연산)y = +1 z = -1
		
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
		
		int a = 3;
		int b = a++ + 5 * 3;
		
		System.out.println(b);
		System.out.println(a);
		
	}

}
