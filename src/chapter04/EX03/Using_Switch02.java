package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		//switch 문으로 처리해보세요
		//에스프레소,  카페라떼, 아보카도 주문할 경우 가격이 3,500원
		//아메리카노 를 주문할 경우 가격이 2,500원
		//그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴입니다
		
		//출력 : 주문하신 <에스프레소> 는 가격이 <3500원> 입니다
		//내가 만든코드다 !
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하실 메뉴를 골라주세요");
		System.out.println("에스프레소, 카페라떼, 아보카도, 아메리카노");
		
		
		int price1 = 3500;
		int price2 = 2500;
		
		String order = sc.next();
		
		
		switch(order) {
		case "에스프레소" : case "카페라떼" : case "아보카도" :
			System.out.println(order +"는 " + price1 +"원 입니다");
			break;
		case "아메리카노" :
			System.out.println(order +"는 " + price2 +"원 입니다");
			break;
		default :
			System.out.println("없는메뉴입니다");
		}
		sc.close();

	}

}
