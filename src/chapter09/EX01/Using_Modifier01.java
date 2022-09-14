package chapter09.EX01;

//09안에 A클래스와 동일한 패키지 내에 존재하는 클래스 
	//import없이 객체 생성이 가능하다 public 과 protected 만

public class Using_Modifier01 {

	public static void main(String[] args) {
		A a= new A(); //객체 생성
		
		//필드출력
		System.out.println(a.a); //a변수는 public이여서 접근 가능
		System.out.println(a.b); //b변수는 protected라서 사용가능
		System.out.println(a.c); //c변수 디폴트 같은패키지 안이라 가능
//		System.out.println(a.d); //프라이빗은 오류 - 파일내에서만 가능
		
		//메소드 출력
		a.print1();
		a.print2();
		a.print3();
//		a.print4(); //프라이빗 접근 불가
		
		System.out.println("=====상속된 객체 생성(E는A를 상속중임)===");
		
		E e = new E();
		
		e.print(); //E에서의 내옹을 이아래 전부다 출력해준다
		
		

	}

}
