package oop.constructor;

public class Person {
	
	String name;
	int age;
	int height;
	
	Person() {
		
	}
	
	Person(String yName,int yAge,int yHeight) {
		name = yName;
		age = yAge;
		height = yHeight;
	}
	
	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	

}
