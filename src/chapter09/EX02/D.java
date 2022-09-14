package chapter09.EX02;

import chapter09.EX01.A;


//<외부패키지를 상속받는경우 A는 지금 다른패키지에있음>

//class D는 class A를 상속 받는다 ( D extends A ) / 패키지 외부에서 상속
	//즉 D클래스는 A클래스의 필드와 메소드를 상속받는것임


	// protected 접근 제어자 : 상속관계일때만 외부패키지에서 접근가능


public class D extends A{
	
	public void print() {
		System.out.println("=====부모 클래스의 필드출력(다른패키지)=======");
		
		System.out.println(a); //public > 다른패키지여도가능
		System.out.println(b); //protected > 다른패키지시 상속관계면 가능
//		System.out.println(c); //default > 다른패키지 불가능
//		System.out.println(d); //private > 다른패키지 불가능
		
		
		
		System.out.println("=====부모 클래스의 메소드호출(다른패키지)=======");
		print1(); //퍼블릭
		print2(); //프로텍티드
//		print3(); //디폴트라 x
//		print4(); //프라이빗 이라 x
		
		
		
		
	}

}
