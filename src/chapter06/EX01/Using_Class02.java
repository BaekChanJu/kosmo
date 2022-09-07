package chapter06.EX01;

//클래스(붕어빵기계) 와 객체(붕어빵)의 차이점
//	클래스 : 객체를 만들기 위한 틀, 붕어빵기계 ,설계도
	//필드 : 클래스 블록에서 선언된 변수를 의미(멤버변수)<스크립에서 전역변수> / ex) int m = 3; 
	//생성자
	//메소드 : 메소드 내부에 선언된 변수 (지역변수)
	//이너클래스
//	객체(인스턴스) : 클래스를 틀로해서 만들어진RAM에 로드된 객체붕, 어빵, 건물


//클래스를 객체로 만드는 작업을 인스턴스화 라고한다

//외부 클래스
class A{ //이게 클래스다 - 객체를 만들기 위한 틀 (객체생성은 main메소드에서 함 )
	
	//핃드 : 힙 공간에 값이 저장 , 값을 넣지않으면 강제 초기화됨
	// 멤버변수이다 클래스 블락안에있으니 메소드안에 있는 지역변수랑은 다르다
	int m = 3;
	int n = 4;
	
	
	//기본 생성자 : 클래스 이름과 동일한 메소드를 생성자, 리턴타입이 없다
		//역활 : 객체를 생설할때 초기값을 부여하는 역활을 해줌
	A () {} //클래스이름과 동일
	
	
	//메소드 : 메소드는 반드시 리턴타입이온다 print가 이름이면 앞에 void가 리턴타입이다
		//작동 : 호출시 작동이 된다
	void print() {
		int k =10;         //지역변수 : 스택 공간에 값이 저장이 된다
								//값을 안넣으면 비어있음
		
		 System.out.println(k);
		 System.out.println(m +n);
		 
	}
	
}




//외부 클래스
//퍼블릭 클래스 이외에 외부클래스 이렇게 여러개 만들 수 있다
class B{
	
}





public class Using_Class02 {

	public static void main(String[] args) {
		
		int aa; //지역변수임 main메소드 안에 선언되어있으니까
		
		//객체생성은 main 메소드에서 작성
		
		
		//객체 생성 A설계도를통해 a를 만든다라는 의미
		A a = new A(); 
		//대문자A 는 클래스를 의미  , /A : 참조 변수 타입 : A ,/ A()는 기본생성자를 의미 
		//소문자a 는 객체를 의미    /a : 객체(참조변수)
		//new : 힙 메모리에 값을 넣어라, 객체를 생성해라
		//A() : 기본 생성자 호출
		
		//객체의 필드의 내용출력
		System.out.println("========a라는 객체의 필드 값 출력==========");
		System.out.println(a.m); //<a는객체> 필드의 m 값출력
		System.out.println(a.n); //필드의 n 값출력
		
		//객체의 메소드 호출
		System.out.println("========a라는 객체의 메소드 호출==========");
		a.print();
		
		
		
		
	//==================================================================	
		//ex) [클래스영역]    [스택영역]        [힙영역]
	    //      설계도        a(100번지)       m,n
		//설계도가 힙영역으로 다들어가 있어서 a.m , a.n 하면 값이 나오는 구조
		
		//A라는 클래스를 기준으로 a라는 객체를 찍은것이다 설계도와 제품의 관계
		//틀을기준으로 객체화해서 객체를 만들어낸다
	//===================================================================	
		
		
		
		//객체또생성
		A b = new A(); //이제 A틀을 기준으로 b를 무한정 찍어내는 것이다
		
		//객체의 필드의 값을 수정
		b.m = 30;  //필드의 값을 수정 m원래 3이었음
		b.n = 40; //필드의 값을 수정 n원래 4였음
		
		//필드의 내용을출력
		System.out.println("========b라는 객체의 필드 값 출력==========");
		System.out.println(b.m); //30
		System.out.println(b.n); //40
		
		//메소드 호출 : 어떤 기능을 프로그래밍한것
		System.out.println("========b라는 객체의 메소드 호출==========");
		b.print();
		
		
		
		
	//===================================================================		
		System.out.println("====A class를 클론해서 객체 무한생성 가능========");
		
		A c = new A();
		
		System.out.println(c.m);
		System.out.println(c.n);
		c.print();
	}

}
