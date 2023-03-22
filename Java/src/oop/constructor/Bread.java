package oop.constructor;

public class Bread {
	
	String name;
	String ingredient;
	int price;
	
	Bread () {} // 가장 기본적인 생성자는 웬만하면 생성하는것이 좋다
	
	Bread(String breadName, String breadIngredient, int breadPrice) {
		name = breadName;
		ingredient = breadIngredient;
		price = breadPrice;
	}
	
	void info() {
		System.out.println("당신이 고른 빵!");
		System.out.println("빵 종류는 : " + name);
		System.out.println("빵의 재료는 : " + ingredient);
		System.out.println("빵의 가격은 " + price + "원 입니다");
	}

}
