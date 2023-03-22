package Java_assignment.chap1;

public class Solution02 {

	public static void main(String[] args) {
		 
		/*
		  	문제: nums 배열에 저장된 요소의 개수만큼 ★을 출력하는 프로그램을 구현합니다.

			입력: 입력은 따로 진행하지 않습니다.
				  예제로 사용할 배열을 제시합니다.
				  int[] nums = {4, 2, 6, 1, 3};
	
			출력:
				  ex) ★★★★
					  ★★
					  ★★★★★★
					  ★
					  ★★★
					  의 형태로 출력합니다.
		 */
		
		int[] nums = {4, 2, 6, 1, 3};
		
		int star = 0;
		
		for (int i=0; i<nums.length; i++) {
			star = nums[i];
			System.out.println(star+"★");
			for (int j=0; j<star; j++) {
				System.out.print("★");
			}// j가 0부터 star개 전까지의 별을 반복해서 올린다
			System.out.println("");
		}
		
		
		
		
		
		
		
		
	}

}
