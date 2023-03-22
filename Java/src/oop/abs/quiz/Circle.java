package oop.abs.quiz;

public class Circle extends Shape {
	
	/*
	 - Circle 객체를 생성할 때, 반지름도 받아서 초기화 할 수 있는
         생성자를 선언해 주세요.
         
	 */
	
	private int radius;

	public Circle(String shapeName, int radius) {
		super(shapeName);
		this.radius = radius;
	}


	@Override
	public double getArea() {
		super.getName();
		System.out.println("반지름 : " + radius);
		System.out.println("넓이 : " + radius * radius * Math.PI);
		System.out.println("----------------------------");
		return 0;
	}

}
