package oop.poly.player;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("검쟁이");
		w1.characterInfo();
		System.out.println("--------------------------");
		
		Warrior w2 = new Warrior("창쟁이");
		w2.characterInfo();
		System.out.println("--------------------------");
		
		Mage m1 = new Mage("지팡이");
		m1.characterInfo();
		System.out.println("--------------------------");
		
		Hunter h1 = new Hunter("활쟁이");
		h1.characterInfo();
		
		w1.rush(m1);
		w1.rush(w2);
		w1.rush(h1);
		w1.rush(w1);

		
		
		
		

	}

}
