package chapter07.EX02;

//class 외부에 올수 있는것(3가지) : 패키지, 임포트(같은 패키지에 존재하지 않는 클래스), 외부 클래스

class A{ //외부클래스 : 객체를 만들기위한 설계도	
	//클래스 내부에 올수있는것(4가지) 1.필드(클래스에서 선언된 변수) 2.생성자 3.메소드 4.이너클래스
	
	//1.필드선언
	int m; //힙에 저장됨 강제초기화 가능 0값 들어감
	int n;
	double k; //0.0
	String l; //null
	
	//생성자 : 클래스는 반드시 생성자가 존재해야함 : 클래스 이름과 동일 해야함 : 리턴이 존재하지 않아야함 
	//리턴이 있으면 생성자가 아니라 메소드다 !!!
	
		//하지만 기본생성자는 생략이 가능하다 (입력매개변수가 없는) A () {}
	//객체 생성시 생상자 호출
	
	A () {
		System.out.println("기본 생성자 호출");
	}
	
	
	
	//메소드 : 앞에 리턴타입이 꼭 들어감 없으면 꼭 void 들어가야함
	void work1() {
		System.out.println("work1 메소드 호출");
	}
	
	int work2(int a , int b) { // 지역변수 : 메소드 블락안에서 선언된 변수 필드의 변수와는 다르다 스택값
		System.out.println("work2 메소드 호출");
		return a + b;
	}
	
	double work3(int a, double b, String c) {
		System.out.println(a+" , "+ b +" , "+ c);
		return a+b;
	}
	
	String work4(String a) {
		return a;
	}
	
	
	
	
	
	
}

public class Using_Object {

	public static void main(String[] args) {
		//객체 생성 : Main 메소드에서 생성된다
		
		A a1 = new A();
		//A는 클래스를 의미
		//a1은 객체를 의미
		//new는 힙에 객체를 생성해라 의미
		//A();는 클래스 내부 생성자 호출을 의미 / 매개변수 받기 가능
			//기본생성자도 있는데 입력 매개변수가 없는 생성자를 의미함(생략이가능)
		
		
		
		//객체의 필드값 출력
		System.out.println(a1.k); // 필드에 초기값 할당 안되어 있으니 0.0나옴
		System.out.println(a1.m); // 0
		System.out.println(a1.l); //null
		
		
		//객체의 필드값 수정가능! 클래스에서 선언한 필드값을 메인메소드 안에서 수정가능
		a1.m = 10;
		a1.n = 20;
		a1.k = 30.0;
		a1.l = "안녕하세요";
		
		System.out.println(a1.k); //수정된 값들이 나옴
		System.out.println(a1.m); 
		System.out.println(a1.l);
		
		//메소드 호출 1
		a1.work1();
		
		//메소드 호출 2
		int k = a1.work2(10, 20);
		//k는 리턴으로 돌아온 a+b를 담는 값이다
		System.out.println(k); // 그냥 메소드만 호출하면 저장만되지 출력이 안되니
		//리턴으로 더한값을 저장해주는 변수가 있어야함
		
		System.out.println(a1.work2(40, 50)); //이렇게 한번에도 가능
		
		//메소드 호출 3
		double d = a1.work3(10,20.0 , "오늘"); //리턴된 값을 변수d에 할당후 출력
		System.out.println(d);
		System.out.println(a1.work3(100, 200.3, "뇽")); //바로출력도 가능
		
		//메소드 호출 4
		String s = a1.work4("안녕");
		System.out.println(s);
		System.out.println(a1.work4("하이룽"));
		
		
		
		
		
		
		
		
		
		A a2 = new A();
		A a3 = new A();
		A a4 = new A(); //설계도 클래스를 기반을 여러개 만들기가 가능합니다
	}

}
