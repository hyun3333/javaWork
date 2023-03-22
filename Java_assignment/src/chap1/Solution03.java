package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		문제:
			scores 배열에 존재하는 점수에 순위를 매겨서 출력하는 프로그램 입니다.

		입력: 
			Scanner를 활용하여 총 5개의 점수를 입력받습니다.
			타입은 정수 타입이며 scores 배열에 순서대로 삽입합니다.
			점수의 순서는 정해진 것이 없습니다만 중복은 허용하지 않는다고 가정합니다.
			ex) 85 100 35 47 90 
			
		출력:
			ex) 
			점수    		순위
			--------------------------
			85		3
			100		1
			35		5
			47		4
			90		2
			
			의 형태로 출력합니다. 점수와 순위의 간격은 적절하게 띄워 주시면 되겠습니다.
			
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		
		int count = 0;
		int i;
		int number = 0;
		
		boolean flag = true;
		
		while (true) {
			System.out.println("당신의 점수를 입력하세요.");
			System.out.print("> ");
			number = sc.nextInt();
			
			if (number > 100 || number < 0) {
				System.out.println("점수가 올바르지 않습니다");
				System.out.println("다시 입력해주세요");
				continue;
			}
			
			for (i=0; i<scores.length; i++) {
				if (scores[i] == number ) {
					flag = false;
				}
			}
			if (flag == false) {
				System.out.println("다시 입력해주세요");
				flag = true;
				continue;
			}
			scores[count] = number;
			System.out.println("점수 " + number + " 입력 되었습니다.");
			System.out.println("=====================================\n");
			
			count++;
			if (count == scores.length) {
				break;
			}
		}
		
//		System.out.println(Arrays.toString(scores)); 등록됐는지 확인용
		
		int[] rank = new int[scores.length];
		
		for (i=0; i<scores.length; i++) {
			rank[i] = 1;
			for(int j=0; j<scores.length; j++) {
				
				if (scores[i]<scores[j]) {
					rank[i]++;
				}// 스코어i배열값이 스코어j배열값보다 작을때 랭크를 1씩올리는 포문이다
			}
		}
		
//		System.out.println(Arrays.toString(rank)); 순위 작동 확인
		
		System.out.println("점수\t순위");
		System.out.println("------------------------");
		
		for (i=0; i<scores.length; i++) {
			System.out.println(scores[i] + "\t" + rank[i]);
		}
		
		
		
		
		
		
		
	}

}
