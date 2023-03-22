package basic.array;

import java.util.Arrays;

public class Array2DQuiz {

	public static void main(String[] args) {
		 
		int[][] score = {
				{79, 80, 99}, //a 학생
				{95, 85, 89}, //b 학생
				{90, 65, 56}, //c 학생
				{69, 78, 77}  //d 학생
				//과목 : 국 영 수
		};
		String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
		String[] subName = {"국어", "영어", "수학"};
		
		/*
		 1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
		 
		 2. 각 과목의 평균을 출력해 보세요.
		 
		 3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
		 
		 */
		
		//1번 3번 통합
		int idx = 0; // stuName 배열에서 학생의 이름을 꺼내올 용도로 사용할 변수. 1번
		double totalAvg = 0.0; // total과 다르게 배열이 바뀔때마다 
							   // 배열의 값을 다 더해줘야 하기 때문에 for문 밖에 써야한다.
		for(int[] stu : score) { //n배열 ex) a학생 b학생 c학생 d학생
			int total = 0; //배열이 바뀔때마다 total이 0이 되어야 다음 배열이 시작되기
						   //때문에 밖에 쓰면 안된다
			for(int s : stu) {//배열안의 배열 ex)a학생 배열의 {79, 80, 99} ....
				total = total + s;
				
			}
			double avg =(double) total / subName.length;
			totalAvg = totalAvg + avg; 
			System.out.printf("%s 평균: %.1f점\n", stuName[idx], avg);
			idx++;
		}
		
		System.out.println("-------------------------------");
		
		//2번
		
		for(int i=0; i<subName.length; i++) {
			int total = 0;
//			int total1 = 0;
			for(int j=0; j<stuName.length; j++) {
//				total1 = total1 + score[i][j];
//				학생 과목의 총 합산이다?
				total = total + score[j][i]; // total+=score[j][i]; 
//				학생들의 과목의 총 합산이다 = 각  과목 총합
			}
			double avg = (double)total / stuName.length;
			System.out.printf("%s 평균점수 : %.1f점\n", subName[i], avg);
		}
		System.out.println("---------------------------------");
		
		
		
		
		
		
		double classAvg = totalAvg / stuName.length;
		System.out.printf("우리반 평균 : %.1f점\n", classAvg);
		
		System.out.println();
		
			
		
		

	}

}
