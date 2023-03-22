package Java_assignment.chap03;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart mc = new MyCart(2100);
		
		Computer com = new Computer();
		
		Radio rd = new Radio();
		
		Tv tv = new Tv();
		
		mc.buy(com);
		
		mc.buy(tv);
		
		mc.buy(rd);

		
		

	}

}
