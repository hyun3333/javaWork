package etc.api.util.arrays;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class ArraysQuiz {
	
	public static String solution(String[] participant, String[] completion) {
		
		/*
        - 참가한 사람의 이름이 담긴 배열 participant와
        완주한 사람의 이름이 담긴 배열 completion이 주어질 때
        완주하지 못한 선수의 이름을 return하는 solution 함수를 완성하세요.
        완주하지 못한 자는 한명이라고 가정합니다.
        */
		
//		배열의 탐색 : binarySearch(배열, 검색할 값)
//		배열의 정렬 Arrays.sort();
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		String result = "";
		for(int i=0; i<participant.length; i++) {
			if(Arrays.binarySearch(completion, participant[i]) < 0) {
				result = participant[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		String[] participant = {"홍길동", "김길동", "김철수", "최철수", "박영희"};
		
		String[] completion = {"홍길동", "김길동", "박영희", "김철수"};
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		System.out.println(solution(participant,completion));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
