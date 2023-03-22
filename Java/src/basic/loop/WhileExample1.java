package basic.loop;
// 반복문 (while문)
public class WhileExample1 {

	public static void main(String[] args) {
		
		/*
		 # while문의 진행 순서.
		 
		 1. 제어변수를 선언함. (시작값이 정해짐)
		 
		 2. while문의 조건식을 검사해서 true면 반복문이 시작.
		    false라면 반복문 종료.
		    
		 3. while문 블록 내부가 한 번 진행되면 (끝까지 내려가면)
		    다시 조건식을 검사하여 true라면 반복문 계속 진행,
		    false라면 반복문 종료.
		 
		 4. while문 내에는 증감식을 배치해서 제어변수의 값을 조정해야 한다.
		 
		 */
		
		
		
		int n = 1; //제어변수 : 반복문의 횟수를 제어할 변수. (begin)
		
		while(n <= 10) { //논리형 조건식 : 반복문의 끝을 지정. (end)
			System.out.println("안녕하세요. 반갑습니다~!" + n);
			n++; //증감식 : 반복문의 종료를 위해 제어변수의 값을 조정 (step)
		}
		
		System.out.println("----------------------------------");
		
		//1 ~ 10 까지의 누적합계
		int i = 1; //begin (사람)
		int total = 0; //누적합을 기억해줄 변수 (집)
		
		while(i <= 10) { //end
			total += i; //1+2+3+4+5+6+7+8+9+10
			i++;		
			} //step
		
		System.out.println("1부터 10까지의 합은 : " + total);
		
	}
}
