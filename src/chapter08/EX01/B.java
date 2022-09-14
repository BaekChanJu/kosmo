package chapter08.EX01;

// default 접근제어자 : 다른 패키지에서는 접근 불가! 꼭 같은 패키지에서만 접근가능
	//즉 chapter08.EX01 패키지 에서만 사용이 가능하다

class B { //default 생략
	
	int a = 10; //default 생략
	int b =20; //default 생략
	
	void print() { //default 생략
		System.out.println("B 클래스 접근");
	}
	

}
