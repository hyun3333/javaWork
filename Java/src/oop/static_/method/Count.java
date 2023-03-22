package oop.static_.method;

public class Count {
	
	public int a; // 인스턴스 변수
	public static int b; // 정적 변수
	
	/*
	 
	 # 인스턴스 메서드 
	   
	 - 객체를 생성하여 주소값을 통해 접근한 후 
	  호출하는 메서드 인스턴스 메서드 안에서는 정적 (static) 변수와 
	  인스턴스 변수 모두 참조할 수 있다.
	  
	 */
	
	public int method1() {
		return this.a + Count.b;
	}
	
	/*
	 
	 # 정적 메서드 (static 메서드)
	 
	 - static블록 (메서드, 정적 초기화자) 내부에는
	  static이 붙은 변수나 메서드만 사용할 수 있다.
	  
	 - this는 사용할 수 없다 나타낼 주소값이 없기 때문에 
	  객체 생성없이도 호출되기 때문이다.
	  
	 - static 블록 내부에서 non-static 멤버를 사용하려면
	  반드시 객체를 생성해서 주소값을 통해 참조해야 합니다.  
	  
	 */
	
	public static int method2() {
		Count ccc = new Count();
		return ccc.a + Count.b;
	}
	

}
