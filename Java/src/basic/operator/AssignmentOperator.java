package basic.operator;
// 대입 연산자
public class AssignmentOperator {

	public static void main(String[] args) {
		 
		/*
		 # 대입 연산자 (=)
		 # 복합 대입 연산자 (+=, -=, *=, /=, %=) *%는 / 와 같지만 나머지가 나온다*
		 --------------------------------------------------------------
		 						+ : 더하기 
		 						- : 빼기 
		 						* : 곱하기 
		 						/ : 몫을 얻는 나누기 
		 						% : 나머지를 얻는 나누기
		 --------------------------------------------------------------
		 
		 - 변수에 값을 대입할 때 사용하는 연산자 입니다.
		 
		 - 복합 대입 연산자는 대입 연산자에 산술 연산자가 결합되어 있는 형태입니다.
		 
		 */
		
		int a = 5;
		int b = 5;
		
		a += 3;
//		a = a + 3 (+ - / * 다 동일하게 해석하면 된다)
//		(거꾸로 쓰면 안된다 +3처리)
		System.out.println(a);
		
		System.out.println("----------------------------------");
		
		a -= 4;
//		a = a - 4 =4
		System.out.println(a);
		a *= 6;
//		a = a * 6 =24
		System.out.println(a);
		a /= 5;
//		a = a / 5 =4
		System.out.println(a);
		a %= 3;
//		a = a % 3 =1
		System.out.println(a);
		

	}

}
