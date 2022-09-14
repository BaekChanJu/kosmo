package chapter09.EX05;

//static 이라는 필드의 값 초기화 : 
	//클래스 내부에서 static{필드의 값을초기화} 
	//클래스명.필드명,  ( C.b ) 이게 호출될때 static{}이 제일 먼저작동

class C{
	int a ;
	static int b;
	
	//스태틱 이라는 필드다
	static { //클래스가 클래스 영역에 로드될때 제일먼저 자동하는 초기화
		//마치 생성자 처럼 역활을 한다
//		a=10;  인스턴스 필드는 여기서 초기화가 불가 정적존 이니까
		b=5;
		System.out.println("클래스C가 로딩되었습니다");
	}
	
	
	C(){ //생성자 : 객체를 생성시 필드의 초기값 할당하는 역활
			//반대로 생성자에서는 인스턴스든 정적이든 모두 초기화가 가능하다
		a=3;
		b=55;
	}
}


//그래서 c.b 하면 스태틱블락이 먼저 작동이 된다 (C생성자 55가 먼저되는것이 아니라)
//마치 생성자가 초기값할당해서 작동해주는 것처럼

//객체 생성없이 스태틱은 호출이 가능하니까 C생성자보다 스태틱이 먼저 작동을 한다는 의미!



//그냥 클래스 에는 필드랑 메소드가 올수있다 보여주는것 메인메소드도 메소드니깐
//메인메소드는 스태틱 이니까 스태틱이 붇어있는 필드 메소드만 호출가능~
public class Using_StaticMethod03 {
	
	int a = 100;
	static int b = 200;
	
	void abc() { //인스턴스
		System.out.println("인스턴스");
	}
	
	static void bcd() { //정적
		System.out.println("정적");
	}
	
	

	public static void main(String[] args) {
		
		//객체 생성 없이 static 필드 호출
		System.out.println(C.b); //객체생성없이 호출되니 스태틱존이 제일 먼저나옴
		
		//객체생성시
		C c= new C();
		
		System.out.println(c.b); // c라는 객체의 생성자안에 b를 가져온거임
		
		
		
		System.out.println("======메인메소드 바로위 클래스에서 만든것=========");
		System.out.println(b); //b는 정적이라 호출가능

	}

}
