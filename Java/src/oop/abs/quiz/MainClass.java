package oop.abs.quiz;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 
        - MainClass에서 길이가 5인 정사각형,
         반지름이 4인 원의 모든 내용을 호출해 보세요.
         
        */
		
		Shape one = new Circle("원", 4);
		one.getArea();
		
		Shape qud = new Rect("정사각형", 5);
		qud.getArea();

	}

}
