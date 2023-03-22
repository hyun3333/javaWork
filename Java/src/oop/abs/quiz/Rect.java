package oop.abs.quiz;

public class Rect extends Shape {

//	 Rect 객체를 생성할 때, 이름과 변의 길이를 받도록 처리해 주세요.
	
	private int length;
	
	Rect(String shapeName, int length) {
		super(shapeName);
		this.length = length;
		
	}

	@Override
	public double getArea() {
		super.getName();
		System.out.println("길이 : " + length);
		System.out.println("넓이 : " + length * length);
		System.out.println("----------------------------");
		return 0;
	}

}
