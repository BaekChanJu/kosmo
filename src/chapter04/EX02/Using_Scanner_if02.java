package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if02 {

	public static void main(String[] args) {
		//점수(score)와 학년(year)을 인풋 받아서 60점 이상이면 합격, 미만이면 불합격
		//4학년인 경우 70점 이상이면 합격 ,중첩  if문 사용
		
		
		System.out.println("점수와 학년을 입력해주세요!");
		
		Scanner sc = new Scanner(System.in);
		
		
		int score = sc.nextInt();
		int year = sc.nextInt();
		
		//if(Score>60) {
		//	System.out.println("합격입니다");
		//}else if(Year==4 && Score>=70) {
		//	System.out.println("ㅊㅊ");
		//}else {
			//System.out.println("불합격");
		//}
		
		if(score>=60) {
			if(year==4 && score>=70) 
				System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		sc.close();
		
		
		/* 선생님 풀이
		 * Scanner sc = new Scanner(System.in);
		 
			system.out.println("점수를 입력하세요");
			int score = sc.nextInt();
			system.out.println("학년을 입력하세요");
			int year = sc.nextInt();
			
		 
		 if(score>=60){
		      if(year != 4{
		        System.out.println("합격"); //4학년 아니면 60점이상 합격
	   	      }else if(score>=70) {
	   	        System.out.println("합격"); //4학년이고 70이상이면 합격 (이미위에통과하고 내려왔으니)
	   	      }else {
	   	        System.out.println("불합격"); //4학년이고 70아니면 불합격
	   	      }
	   	   }else{   
	   	       System.out.println("불합격"); //60점 미만이면 1234 모두 불합격
	   	   }    
	   	         
	   	              
		        
		        
		 * */
	
  }
}
