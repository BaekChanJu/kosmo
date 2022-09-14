package chapter08.EX02;

//import시 * 를 사용하는 경우 : 해당 패키지의 모든 클래스를 import해준다
	//주의점 : 하위의 패키지는 적용이 되지 않는다

//*는 패키지의 모든 클래스만 적용
	//즉 EX01 패키지 아래 A B(디폴트라x) C Using Pakege01 이4개만 임포트 된다
	//하위에있는 com, comm 패키지는 임포트가 되지 않는다!

import chapter08.EX01.*; 

public class Using_Pakege04 {
	
	public static void main(String[] args) {
		
		
		//EX02에 위치해있고 EX01에 있는 클래스들을 지금 임포트시켰음
		// A 클래스 객체 생성 
		
		A a = new A();
		// B b = new B(); // default라서 외부클래스에서 접근불가
		C c= new C();
		//D d = new D(); //comm하위의 패키지는 import가 안됨
		
	}

}
