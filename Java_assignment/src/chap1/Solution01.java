package chap1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution01 {
	
	public static void main(String[] args) {
		
		/*
		 	문제: nums 배열에서 가장 큰 값을 출력하는 코드를 작성합니다. 
			
			입력: 
				Scanner를 사용해서 입력받은 값을 nums 배열에 삽입합니다.
				배열의 크기는 10이고, 중복 입력값은 없다고 가정합니다.
				배열의 모든 인덱스에 값을 채울 때 까지 입력을 반복합니다.
				
			출력:
				ex) 가장 큰 값: 95
				의 형태로 출력합니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		int count = 0;
		boolean flag = true;
		int i;
		int number = 0;
		
		while (true) {
			System.out.println("숫자를 입력하세요.");
			System.out.print("> ");
			number = sc.nextInt();
			
			
			for (i=0; i<nums.length; i++) {
				if (nums[i] == number ) {
					System.out.print("중복숫자!!");
					flag = false;
				}// 중복숫자를 찾는곳
			}
			if (flag == false) {
				System.out.println(" 삭제");
				flag = true;
				continue;
			} //중복숫자를 삭제하고 빈공간으로 만드는곳
			
			nums[count] = number;
			System.out.println(number + " 이(가) 입력 되었습니다.\n");
			
//			System.out.println(Arrays.toString(nums)); 배열이 추가되는지 확인용
			count++;
			
			if (count == nums.length) {
				break;
			}// nums의 배열이 다 찼을때 작동을 중지하는곳
		}// nums 배열에 숫자를 넣는곳
		
		int max = 0;
		
		for (i=0; i<nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}// 입력받는 max에 nums의 배열에서 큰 수를 찾고 넣는과정
		}
		System.out.println("========================================\n");
		
		System.out.println("입력숫자중 최대숫자는 " + max + "입니다.");
		
		
		
		
		
		
		
		
		
	}
}
