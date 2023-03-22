package basic.if_;

import java.util.Scanner;

public class IfQuiz05 {

	public static void main(String[] args) {
		
		/*
		 # 국어, 영어, 수학 점수를 각각 입력받아서
		  평균을 구해 보세요. (평균은 소수점 첫째 자리까지 출력)
		  평균 90점이 넘는다면, 다시 한 번 조건을 검사해서
		  95 ~ 100 -> A+
		  94 ~ 90 -> A0
		  80점대는 B, 70점대는 C, 60점대는 D,
		  나머지는 모두 F로 처리하면 됩니다. (100점 만점)
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		double aver = (kor + math + eng) / 3.0;
		
		String gr;
		
			
		if (aver >= 90) {
			if (aver >= 95) {
				gr = "\" A+ \"";
			} else {
				gr = "\" A0 \"";
			}
		} else if (aver >= 80) {
				gr = "\" B \"";
		} else if (aver >= 70) {
				gr = "\" C \"";
		} else if (aver >= 60) {
				gr = "\" D \"";
		} else {
				gr = "\" F \"";
		}
			
		System.out.printf("평균 점수 : %.1f\n", aver);
		System.out.println("당신의 학점은 : " + gr + " 입니다");
		
		
		
		sc.close();
		
		
		
		
		
		

	}

}
