package oop.inherit.good;

public class Hunter extends Player {
	
	String pet;
	
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 펫 : " + pet);
	}

}
