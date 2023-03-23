package Java_assignment.chap05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FoodManager {

	public static void main(String[] args) {
		
		Map<String, Integer> foods = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 음식점 메뉴판 관리 프로그램 ***");
		
		while(true) {
			
			System.out.println("# 1. 메뉴 등록");
			System.out.println("# 2. 메뉴 전체보기");
			System.out.println("# 3. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			
			System.out.println("--------------------------------");
//			foods.put(food,);
			if(menu == 1) {
				/*
				 - 메뉴명과 가격을 입력받아서 Map에 삽입하시면 됩니다.
				  이미 존재하는 메뉴명이 들어왔다면 '이미 존재하는 메뉴입니다.'
				  를 출력하시고 메인 메뉴로 돌아와 주세요.
				 - 메뉴 등록 완료 후 'XXX 메뉴가 등록되었습니다.' 를 출력하세요.
				 */
				boolean flag = false;
				
				System.out.print("메뉴를 등록하세요 : ");
				String food = sc.next();
				
				if (foods.containsKey(food)) {
					System.out.println("이미 존재하는 메뉴입니다");
					continue;
				}
				
				System.out.print("가격을 입력하세요 : ");
				int sell = sc.nextInt();
				foods.put(food , sell);
				System.out.println(food + " 이(가) 등록되었습니다.");
				continue;
			} else if(menu == 2) {
				
				if (foods.size()==0) {
					System.out.println("메뉴를 등록해라!");
					continue;
				}
				Set<String> food = foods.keySet();
				for (String f : food) {
					System.out.println("음식 " + f + ":" + "가격" + foods.get(f));
				}
				
				System.out.println("# 1. 수정");
				System.out.println("# 2. 삭제");
				System.out.println("# 3. 취소");
				System.out.print("> ");
				int num = sc.nextInt();
				
				switch (num) {
				case 1 : 
					System.out.println("어떤 메뉴를 수정하시겠습니까? : ");
					String food1 = sc.next();
					if (foods.containsKey(food1)) {
						System.out.println("가격을 입력해주세요 : ");
						int sell = sc.nextInt();
						foods.put(food1, sell);
					} else {
						System.out.println("그런 메뉴는 없습니다.");
					}
				break;
				
				case 2 :
					System.out.println("어떤 메뉴를 삭제하시겠습니까? : ");
					String food2 = sc.next();
					if (foods.containsKey(food2)) {
						System.out.println(food2 + "이(가) 메뉴에서 삭제되었습니다.");
						foods.remove(food2);
					}
				break;
				
				case 3 :
					System.out.println("메뉴 수정을 취소하셨습니다.");
				break;
				}
				/*
				  메뉴를 모두 출력 후에 선택지를 제공하세요.
				  (1. 수정 | 2. 삭제 | 3. 취소)
				  - 수정: 수정할 메뉴명을 입력받아서 가격 수정을 진행하세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 삭제: 삭제할 메뉴명을 입력받아서 해당 메뉴를 삭제해 주세요.
				   없는 메뉴명이라면 없다고 메세지를 출력하시고 메인 메뉴로 이동.
				   
				  - 취소: 메인 메뉴로 이동
				  
				 - 만약 메뉴가 하나도 등록되어 있지 않다면
				  '메뉴부터 먼저 등록해 주세요!' 출력 후 메인 메뉴로 이동시켜
				  주세요. 
				 
				 - Map의 모든 요소를 반복문을 이용하여 출력해 주세요.
				 ex)
				    메뉴명 : 가격
				    메뉴명 : 가격
				    메뉴명 : 가격....
				  
				 */
				
					
			} else if(menu == 3) {
				System.out.println("시스템을 종료 하시겠습니까? : ");
				String end = sc.next();
				
				if (end.equals("y") || end.equals("Y") || end.equals("ㅛ")) {
					System.out.println("시스템을 종료합니다.");
					break;
				} else {
					System.out.println("종료를 취소합니다");
					continue;
				}
				
				
				 /*
				  - Y / N를 입력받아서 Y가 입력되면 프로그램 종료.
				   그 이외의 값은 종료 취소를 진행해 주세요.
				 */
				
			} else {
				System.out.println("메뉴를 잘못 입력하셨습니다.");
			}
			
			
			
		}
		
		sc.close();

	}

}

