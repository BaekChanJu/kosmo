package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch_03 {

	public static void main(String[] args) {
		/*1 문제
		  	스케너로 "Gold"를 넣으면 "금메달입니다" 를 출력
		  스케너로 "Silver"를 넣으면 "은메달입니다" 를 출력
		  스케너로 "Bronze"를 넣으면 "동메달입니다" 를 출력
		  
		  2 문제
		  스캐너로 월을 인풋받아서 해당월의 총 날짜를
		  "<월>은 <몇일> 일까지 있습니다
		  
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("메달 색을 영어로 입력해보세요");
		String order = sc.next();
		
		switch(order) {
			case "Gold" :
				System.out.println("금메달 입니다");
					break;
			case "Silver" :
				System.out.println("은메달 입니다");
					break;
			case "Bronze" :
				System.out.println("동메달 입니다");
					break;
			default :
				System.out.println("없는 메달 색입니다");
		}
	
		
		System.out.println("몇월은 몇일까지 있다를 표현할꺼에요 <월>을 입력해주세요 ");
	    String month = sc.next();
	    
	    switch(month) {
	    	case "1월" : case "3월" : case "5월" :  case "7월" :
	    	case "8월" :  case "10월" :  case "12월" :
	    		System.out.println(month + "는 31일 까지 있습니다!");
	    			break;
	    	case "2월" :
	    		System.out.println(month +"는 28일 까지 있습니다!");
    				break;
    		case "4월" : case "6월" : case "9월" : case "11월" :
    			System.out.println(month +"는 30일 까지 있습니다!");
    				break;
    		default :
				System.out.println("없는 <월> 입니다");
	    	}
	     sc.close();
	 
	}

}
