package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if03 {

	public static void main(String[] args) {
		//if 문에서 String 문자열 비교
		// 기본 자료형에거 변수의 값이 같다 : == 이걸쓴다 하지만 참조자료형(문자열)에서는
		// .equals() 를 사용한다 <String 변수의 값 비교할떄 사용>
		
		 Scanner sc = new Scanner(System.in); //스캐너 생성
		 
		 System.out.println("주문할 커피 메뉴를 고르세요");
		 String order =sc.next();
		 
		 if(order.equals("아메리카노")) {
			 System.out.println("당신이 주문한 커피는 : " + order + "입니다");
		 }else if(order.equals("카푸치노")) {
			 System.out.println("당신이 주문한 커피는 : " + order + "입니다");
		 }else if(order.equals("카페라테")||order.equals("까페라뗴")) {
			 System.out.println("당신이 주문한 커피는 : " + order + "입니다");
		 }else if(order.equals("아이스티")) {
			 System.out.println("당신이 주문한 커피는 : " + order + "입니다");
		 }else {
			 System.out.println("우리 매장에 없는 메뉴입니다");
		 }
		 
		  sc.close();
	
		

	}

}
