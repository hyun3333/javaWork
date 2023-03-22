package etc.api.lang.wrapper;

import java.util.Scanner;

public class ParseQuiz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String rrn;
		
		while (true) {
			System.out.print("주민등록번호를 입력하세요  : ");
			rrn = sc.next();
			
			if (rrn.length() <= 13 || rrn.length() > 14) {
				System.out.println("하이픈(-) 또는 주민등록번호를 잘못 입력하셨습니다.");
				continue;
			}
			
			try {
				String test = rrn.substring(0, 6);
				String test2 = rrn.substring(7);
				Integer.parseInt(test);
				Integer.parseInt(test2);
				break;
				
			} catch (NumberFormatException e) {
				System.out.println("숫자로 정확하게 입력 해 주세요");
			}
			
			String rrn1 = rrn.substring(0,2);
			String rrn2 = rrn.substring(2,4);
			String rrn3 = rrn.substring(4,6);
			
			char c = rrn.charAt(7);
			
			int num = Integer.parseInt(rrn1);
			
			int year = 1900 + num;
			int year2 = 2000 + num;
			
			int age = 2023 - year;
			int age2 = 2023 - year2;
			
			if (c == '1') {
				System.out.println(year + "년" + rrn2 + "월" + rrn3 + "일" + 
						age + "세" + "남성입니다");
			} else if (c == '2') {
				System.out.println(year + "년" + rrn2 + "월" + rrn3 + "일" + 
						age + "세" + "여성입니다");	
			} else if (c == '3') {
				System.out.println(year2 + "년" + rrn2 + "월" + rrn3 + "일" + 
						age2 + "세" + "남성입니다");
			} else if (c == '4') {
				System.out.println(year2 + "년" + rrn2 + "월" + rrn3 + "일" + 
						age2 + "세" + "여성입니다");	
			} else {
				System.out.println("주민등록번호를 잘못 입력하셨습니다");
				continue;
			}
				
			
			break;
			
			
		}
		sc.close();

		
	}

}
