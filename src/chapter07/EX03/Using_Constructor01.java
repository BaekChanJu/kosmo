package chapter07.EX03;


class A{
	//지금 이 클래스 내부에 생성자 없을경우 컴파일러가 기본생성자를 자동으로 만들어 준다
	// A () {}
	
	
	//필드 (인스턴스 필드) 객체를 생성후 호출가능
	int m ;
	
	//메소드 (인스턴스 메소드) 객체를 생성후 호출가능
 	void work() {
		System.out.println(m);
	}
}

class B{
	//필드
	int m;
	
	//생성자
	B () {
		//기본생성자 (생략가능)
	}
	
	
	//메소드
	void work() {
		System.out.println(m);
	}
}

class C{
	int m;
	
	//매개변수가 1개인 생성자
		//클래스 내부에 생성자가 존재하면 컴파일러가 되지않는다!
		//그니까 이친구는 매겨변수가 있으니 생략되지 않았잖아요? 그래서 메인메소드안에
		//C c = new C(); 이걸 선언해주면 오류가 되는것이다
	
	//C (int m){
		// this.m  = m; //변수가 m처럼 3개가 동일할때는 앞에 this 를 붙혀줘라
	
	C(int a){ // 입력매개변수, 입력매개변수를 받는 변수임 int a로 10을 받으면 a도 10이다
		m = a;
	} 
		
	
	void work() {
		System.out.println(m);
	}
	
}




public class Using_Constructor01 {

	public static void main(String[] args) {
		//객체생성
		A a = new A(); //기본 생성자를 호출 : A();  //생성자가 생략됬지만 컴파일러가 자동생성해줌 
		
		System.out.println(a.m); //A클래스는
		//스태틱이 없음  위에서 a라는 객체를 만들어줘야 이렇게 사용가능
		
		a.work();
		
		
		B b = new B();
		System.out.println(b.m);
		b.work();
		
		C c = new C(10); ////C c = new C(); 는 오류
		System.out.println(c.m);

	}

}
