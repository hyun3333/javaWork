package oop.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyBirth my = new MyBirth();
		
//		my.year = 200051;  (x)
		my.setYear(1992);
		my.setMonth(06);
		my.setDay(29);
		
		System.out.printf("내 생일은 %d년 입니다.\n", my.getYear("abc1234"));
		System.out.printf("%d월 %d일이 생일입니다.", my.getMonth(), my.getDay());
		
	}

}
