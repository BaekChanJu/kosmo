package chapter09.EX02;

import chapter09.EX01.A; //09의 EX01의 A클래스를 임포트한거임

//09 의 A클래스와 다른패키지임 지금상황이

public class Using_Modifier02 {

	public static void main(String[] args) {
		
		//import 됨
		A a = new A(); //public이라 다른패키지 클래스 가져오기 가능
		
		//필드의 내용 접근
		System.out.println(a.a); //public 이라 가능
//		System.out.println(a.b); //protected 라 불가 상속관계가 아니라
//		System.out.println(a.c); //외부라 안됨
//		System.out.println(a.d); //외부라 안됨
		
		//메소드 접근
		a.print1();
//		a.print2(); //print1 이외 다안됨 외부에서 가져온거라

		
		
		
		System.out.println("===상속 관계 객체 출력(D)======");
		//D클래스의 내용을 출력
		D d = new D();
		d.print();
	}

}
