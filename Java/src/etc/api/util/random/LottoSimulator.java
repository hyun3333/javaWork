package etc.api.util.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


import basic.loop.ContinueExample;
import oop.static_.field.Count;

public class LottoSimulator {
	

	static Random r = new Random();
	
	static int prize1 = 0; // 1등 당첨 횟수를 세 줄 변수
	static int prize2 = 0; // 2등 당첨 횟수를 세 줄 변수
	static int prize3 = 0; // 3등 당첨 횟수를 세 줄 변수
	static int prize4 = 0; // 4등 당첨 횟수를 세 줄 변수
	static int prize5 = 0; // 5등 당첨 횟수를 세 줄 변수
	static int failCnts = 0; // 꽝 당첨 횟수를 세 줄 변수
	
//	1. 로또 6자리를 생성하는 메서드
	public static Set<Integer> createLotto() {
		
		/*
		 
		 - 1 ~ 45 범위의 난수 6개를 생성하셔서
		  컬랙션 자료형에 모아서 리턴해 주세요.
		  무엇이 쓰든 상관하지 않겠습니다.
		  중복이 발생하면 안됩니다.
		  
		 */
		
		Set<Integer> lotto = new HashSet<>();
		while (lotto.size()<6) {
			int num = r.nextInt(45) + 1;
			lotto.add(num);
		}
		
		return lotto;
	}
	
//	2. 보너스 번호를 생성하는 메서드
	public static int createBonusNum(Set<Integer> lotto) {
		
		/*
		 
		 - 매개값으로 전달되는 당첨 번호 집합을 전달 받으신 후
		  당첨 번호들을 피해서 보너스번호 하나만 뽑아 주세요.
		  범위는 마찬가지로 1 ~ 45 사이의 난수입니다.
		 
		 */
		
		int num = r.nextInt(45) + 1;
		while (true) {
			if(!lotto.contains(num)) {
				return num;
			}
		}
		
	}
	
//	3. 당첨 등수를 알려주는 메서드
	public static void checkLottoNumber(Set<Integer> win, Set<Integer> myLotto, int bonus) {
		
		/*
		 
		 매개값으로 당첨번호집합, 구매한 로또 번호집합, 보너스번호를 받습니다.
		 내 로또 번호와 당첨번호를 비교하여 일치하는 횟수를 세 주신 후
		 등수를 판단하세요.
		 판단된 등수에 해당하는 static 변수의 값을 올려주시면 됩니다.
		 6개 일치 -> 1등
		 5개 일치 + 보너스번호 일치 -> 2등
		 5개 일치 -> 3등
		 4개 일치 -> 4등
		 3개 일치 -> 5등
		 나머지 -> 꽝
		 
		 */
		ArrayList<Integer> wlist = new ArrayList<>(win);
		
		ArrayList<Integer> mlist = new ArrayList<>(myLotto);
		Collections.sort(wlist);

		Collections.sort(mlist);
		
		int count = 0;
		for(int i=0; i<wlist.size(); i++) {
			for(int j=0; j<mlist.size(); j++) {
				if(wlist.get(i) == mlist.get(j)) {
					count++;
				} else {
					continue;
				}
			}
				
		}
		
		if (count == 6) {
			prize1++;
		} else if (count == 5 ) {
			for(int i=0; i<mlist.size(); i++) {
				if (mlist.get(i) == bonus) {
					prize2++;
				} else {
					prize3++;
				}
			}
		} else if (count == 4) {
			prize4++;
		} else if (count == 3) {
			prize5++;
		} else {
			failCnts++;
		}
		
	}

	private static int mlist(int i) {
	// TODO Auto-generated method stub
	return 0;
}

	public static void main(String[] args) {
//		로또 번호 생성 메서드를 호출해서 당첨 번호를 하나 고정시키세요.
		Set<Integer> win = createLotto();
//		List<Integer> wlist = new ArrayList<>(win);
//		Collections.sort(wlist);
		
		System.out.println("당첨번호: " + win);
//		보너스 번호도 하나 고정시키세요.
		int bonus = createBonusNum(win);
		System.out.println("보너스번호: " + bonus);
		
		long money = 0;
		int i = 0;
	
		
		
		while(true) {
			/*
			 - 1등이 당첨 될 때까지 반복문을 돌립니다.
			 
			 - 1등이 당첨 된다면, 1등이 되기까지 누적 당첨횟수를 출력하고
			  반복문을 종료합니다.
			 
			 - 로또를 구매하기 위한 금액도 출력하세요. (long)
			 */
			
			Set<Integer> myLotto = createLotto();
			
			checkLottoNumber(win, myLotto, bonus);
			
			money += 1000;
			i += 1;
			if (prize1 == 1) {
				System.out.println("1등 당첨");
				System.out.println("돌린 횟수 : " + i);
				System.out.println("내가 쓴 금액" + money);
				break;
			}
			

			
			
			
			
		}
	

	}

}
