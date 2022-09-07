package chapter06.EX01;

//class A하면
class C{ //오류남 02에서 클래스A를 만들어섰음 // 같은 패키지에서 동일한 이름으로 선언하면 오류남
	
	//필드 : 힙영역에 값저장됨 (값을 안넣으면 강제적으로 초기화됨)
	int a; //0
	int b;
	String name; //null
	
	//클래스 이름과 동일해야함
	C () {}; //기본생성자 : 매개변수 값이 없고, 실행부도 없는 생성자 하나생성, 생략가능
	
	
	//메소드
	void call() {
		int c; // 필드에서 선언된게 아니라 메소드안에서 선언됬으니 지역변수다! : 스택영역에 저장됨
		System.out.println("출력 내용입니다");
		
		System.out.println(a); // 값을 안넣었으니 오류가 안남 이미 강제초기화로 0값임
		System.out.println(b);
		System.out.println(name);
		
		//System.out.println(c); //c는 오류남 스택영역은 강제초기화가 안되서 반드시 값을 넣어줘야함
	}
	
	
}

public class Using_Class03 {

	public static void main(String[] args) {
		//
		C c = new C();
		
		c.call(); //기본값들 나옴

	}

}
