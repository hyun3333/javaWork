package basic.begin;

import java.util.Arrays;

public class Hello {
	
	public static void main(String[] args) {
		
		
        int[] score = {90,87,100, 95, 80};
        int[] rank = new int[score.length];
           
        //[2] 처리
                       
        for(int i=0; i<score.length; i++){
            rank[i] = 1; //1등으로 초기화
           
            for (int j = 0; j < score.length; j++) { //기준데이터와 나머지데이터비교                             
                if(score[i]>score[j]){   //기준데이터가 나머지데이터라 비교했을때 적으면 rank[i] 카운트
                    rank[i]++; //COUNT                 
                }              
            }          
        }      
       System.out.println(Arrays.toString(rank));
        
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]+"점 : "+rank[i]+"등");           
        }
		
		
		
		
		
		
		
		
		
		
		
		
	}


}