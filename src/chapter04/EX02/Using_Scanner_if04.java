package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		//에스프레소,  카페라떼, 아보카도 주문할 경우 가격이 3,500원
		//아메리카노 를 주문할 경우 가격이 2,500원
		//그외의 메뉴를 출력 할 경우 : 우리 매장에 없는 메뉴입니다
		
		//출력 : 주문하신 <에스프레소> 는 가격이 <3500원> 입니다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("무슨 메뉴를 주문하시겠습니까 ?");
		System.out.println("에스프레소 카페라떼 아보카도 아메리카노");
		String order = sc.next();
		
		int prise = 0;
	
		
	
		if(order.equals("에스프레소")||order.equals("카페라떼")||order.equals("아보카도")) {
			prise = 3500;
		}else if(order.equals("아메리카노")) {
			prise = 2500;
		}else {
			System.out.println("메장에 없습니다");
		}
		System.out.printf("주문하신 %s 는 가격이 %d원 입니다",order,prise);

		sc.close();
		
		
	
	}
}
