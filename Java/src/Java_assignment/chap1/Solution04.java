package Java_assignment.chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {

		/*
		문제: 학생들 중 과제를 제출하지 않은 학생을 적발하는 문제 입니다.
			  총 학생의 수는 10명 입니다. 
			  각 학생들은 1번부터 10번까지 번호를 가지고 있습니다.
			  학생들 중 2명의 학생이 과제를 제출하지 않았습니다. 
			  그 학생이 몇 번 학생인지를 출력하면 됩니다.

		입력: Scanner를 활용하여 총 8개의 정수를 입력 받습니다.
			  출석번호에 중복은 없습니다.
			  입력되는 값을 제시합니다. 
			  -> 3 1 4 5 7 9 6 10

		출력: ex) 
			  숙제를 안 낸 학생의 번호:
			  2
			  8

			  의 형태로 출력합니다. 
		 */
//		======================================================
		
//		멘토님한테 도움받은곳
		Scanner sc = new Scanner(System.in);

		int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] stu = new int[8];
		int homework;

		System.out.println(Arrays.toString(number));
		System.out.println(Arrays.toString(stu));
		
		
		for (int i=0; i<stu.length; i++) {
			System.out.println("과제를 제출한 학생의 번호를 적으세요 ");
			System.out.print("> ");
			homework = sc.nextInt();
			for(int j=0; j<stu.length; j++) {
				
				if (stu[j] == homework) {
					System.out.println("이미 제출한 학생의 번호입니다.");
					i--;
					break;
				} else if (j == stu.length-1){
					stu[i] = homework;
					break;
					
				}
				
			}
		}
		
		System.out.println("제출하지 않은 번호들 : ");
		for (int i=0; i<number.length; i++) {
			boolean flag = false;
			for (int j=0; j<stu.length; j++) {
				if (number[i] == stu[j]) {
					flag = true;
				} 
			}
			if (!flag) {
				
				System.out.println(number[i]);
			}
		}
		
		
//		-----------------------------------------------------------
//		내가 작성했던곳
//		System.out.println(Arrays.toString(stu));
		
//		for (int j=0; j<stu.length; j++) {
//			int[] idx = new int[number.length-1];
//			for (int k=0; k<stu.length; k++) {
//				number[j] = number[k];
////				number[k] = number[j+1];
////				idx[j] = number[j];
//			}
//			for (int l=0; l<idx.length; l++) {
//			}
//			number = idx;
//		}
//		
//		System.out.println(Arrays.toString(number));
		
		
		

		
		
		
		
		
		
		
		
		
//		---------------------------------------------------------------
//		강사님이 작성했던곳
//		while (true) {
//			System.out.println("번호를 입력해 주세요!");
//			System.out.println("번호 입력이 완료되면 0을 입력하세요.");
//			System.out.print("> ");
//			n = sc.nextInt();
//			
//			if(n == 0) break;
//			for(int i=0; i<number.length; i++) {
//				if(number[i] == n) {
//					for(int j=i; j<number.length-1; j++) {
//						number[j] = number[j+1];
//					}
//					int[] num = new int[number.length-1];
//
//					for(int j=0; j<num.length; j++) {
//						num[j] = number[j];
//					}
//					number = num;
//					break;
//				}
//			}

			

//		}

//		System.out.println(Arrays.toString(number));


		sc.close();




	}




}