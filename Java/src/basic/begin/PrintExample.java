package basic.begin;
// 자바의 표준 입력 출력 방식
public class PrintExample {

	public static void main(String[] args) {
		 
		/*
		 # 자바의 표준 출력 형식은 크게 3가지입니다.
		 
		 1. 개행을 포함하지 않는 print()
		 2. 자동으로 개행을 포함해 주는 println()
		          *개행 : 줄바꿈
		 
		 */
		
		System.out.print("안녕하세요~!");
		System.out.println("Hello~!");
		System.out.print("안녕히 가세요ㅜㅜ");
		System.out.println("bye bye~~");
		
	     /*
	      3. 형식 지정 표준 출력 함수 printf()
		   서식 문자를 이용해서 문자열을 완성시킨 후.
		   서식 문자에 들어갈 값을 지정해서 출력하는 방식.
		   줄 개행이 안되며 줄 개행을 하기위해선 ""안에 다 쓰고나서 \n를 붙히면 된다.
		 
		 # 탈출 코드 (escape code)  
		   \n는 \의x개에 따라 줄 개행이 x줄만큼 늘어난다
		   \t는 가로 공백 (스페이스 4칸)이다.
		   \n \t는 printf 에만 쓰는것이 아니라 다른곳에도 적용이 가능하다
		   반드시 따옴표 내에 위치해야 합니다
		   문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
		 
		 # 포맷팅 서식 문자 종류
		 
		 %d : 부호가 있는 정수 데이터(decimal)
		 %f : 실수 데이터 (floation point)
		 %s : 문자열 (String)
		
		 
		 */
		
		int month = 12;
		int day = 25;
		String anni = "크리스마스";
		
//		12월 25일은 크리스마스 입니다.
		System.out.println(month + "월" + day + "일은" + anni + "입니다.");
		System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
		
//		실수를 표현하는 서식문자 %f
//		%.[자리수를 지정하는 숫자]f -> 원하는 자리수까지 표현
//		%라는 문자 자체를 표현할 때는 %% 쓰시면 됩니다.
		double rate = 64.126;
		System.out.printf("합격률은 %.2f%%입니다.", rate);
		
		
	}

}
