package oop.static_.sinpleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton();
//		
//		s1.method1();
//		s1.method2();
		
//		Singleton s1 = Singleton.s;
//		Singleton.s = null;
		
		Singleton s1 = Singleton.getInstance();
		s1.method1();
		s1.method2();

	}

}
