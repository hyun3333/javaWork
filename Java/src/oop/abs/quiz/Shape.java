package oop.abs.quiz;

public abstract class Shape {
	
	/*
	 
    1. 도형의 이름을 저장할 수 있는 변수(name)을 private으로 선언.

    2. 생성자를 선언 -> 매개값으로 도형의 이름을 받아서 저장할 수 있도록.

    3. 자식 클래스에게 오버라이딩을 강제할 수 있는 메서드 
        getArea() 를 선언 (return type -> double)

    4. 도형 이름을 출력할 수 있는 메서드 getName()을 선언. (강제 x)
    
    - Shape를 상속받는 Circle과 Rect 클래스를 생성해 주세요.
        
        - Circle 객체를 생성할 때, 반지름도 받아서 초기화 할 수 있는
         생성자를 선언해 주세요.
         Rect 객체를 생성할 때, 이름과 변의 길이를 받도록 처리해 주세요.
         
        - 오버라이딩이 강제되는 메서드에는 각 도형의 넓이를 구하는
         로직을 알아서 작성해 주세요.
    */
	
	private String name;
	
	
	Shape(String shapeName) {
		name = shapeName;
	}
	
	public abstract double getArea();
	
	public String getName() {
		System.out.println("도형 : " + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
