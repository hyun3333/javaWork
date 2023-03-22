package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] kakao = {"무지", "네오", "어피치","라이언", "춘식이"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));
		System.out.print("삭제를 원하는 친구를 입력하세요 : ");
		String name = sc.next();
		
		/*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
		 
		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
		 
		 */
		for(int x=0; x<kakao.length; x++) {
			if(name.equals(kakao[x])) {
				for(int i=x; i < kakao.length-1; i++) {
					
					kakao[i] = kakao [i + 1];
				}
				
				String[] temp = new String[kakao.length-1];
				
				for(int i=0; i < temp.length; i++) {
					temp[i] = kakao[i]; 
				}
				kakao = temp;
				temp = null;
				break;
				
			} else if(x==kakao.length-1) {
				System.out.println("없는 이름입니다.");
				break;
			}
		}
		
		
		
		System.out.println(Arrays.toString(kakao));
		
		
		/*
		 boolean 타입으로 해결하기
		 --탐색
		 boolean flag = false;
		 for(int i=0; i<kakao.length; i++) {
		 	if(name.equals(kakao[i])) {
		 		flag = true;
		 		for(int j=i; j<kakao.lenght-1 j++) {
		 			kakao[j] = kakao[j+1];
		 			
		 		}	
		 		break;
		 	}
		 }
		 --삭제
		 if(!flag) { flag==false   ?
		 	 system.out.println(name + "(은)는 없는 이름입니다")
		 } else {
		 	 String[] temp = new String[kakao.lenght-1];
		 	 for(int k=0; k<temp.lenght; k++) {
		 	 	temp[k] = kakao[k];
		 	 }
		 	 kakao = temp;
		 	 temp = null;
		 	 
		 	 System.out.println("삭제 후 정보 : " + Arrays.toString(kakao));
		 }	 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
