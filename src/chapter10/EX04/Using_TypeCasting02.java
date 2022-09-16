package chapter10.EX04;



class Aa{
	
	int a = 10;
	void a() {
		System.out.println("클래스Aa 출력");
	}
}

class Bb extends Aa{  //자식클래스 객체를 생성시  부모클래스의 기본 생성자를 호출해서
						//부모 클래스가 먼저 생성후 자식 클래스가 생성된다 순서가!
						//Bb에 생성자가 있으면 Aa에 기본생성자가 반드시 있어야한다라는 뜻임
	int b = 20;
	void b() {
		System.out.println("클래스Bb 출력");
	}
}

class Cc extends Bb{
	int c = 30;
	void c() {
		System.out.println("클래스Cc 출력");
	}
}
	

public class Using_TypeCasting02 {

	public static void main(String[] args) {
		//다형성 : 상속 관계일때 하나의 객체가 자식이든부모든 여러 타입으로 정의해서 사용가능
		
		//1. Aa 객체를 Aa 타입으로 생성 
			//최상의부모클래스 선언한거임 상속관계 없고 Aa클래스만 가능한 녀석이다
		System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓<Aa aa1 = new Aa();>↓↓↓↓↓↓↓↓↓↓↓↓");
		Aa aa1 = new Aa(); //Aa(); 객체는 Aa타입이다 변수명은 aa1
		
		System.out.println(aa1.a);
		aa1.a();
		
		
		
		//2.Bb객체를 Bb타입으로 생성
		System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓<Bb bb1 = new Bb();>↓↓↓↓↓↓↓↓↓↓↓↓");
		//부모인 A를 먼저만들고 B를 만든다 순서가 그래서 B는 A까지 내포하고있다
			//bb1은 그래서 Aa, Bb를 내포하고있음 / 타입을 Bb로 지정했으니 Aa Bb의 내용 모두 사용가능
		Bb bb1 = new Bb(); 
		
	    //Aa 타입의 필드와 메소드출력
		System.out.println(bb1.a);
		bb1.a();
		//Bb 타입의 필드와 메소드출력
		System.out.println(bb1.b);
		bb1.b();
		
		
		
		//bb1을 Aa타입으로 업캐스팅 해보자 (자동컴파일됨) >> 그럼 Aa 클래스 내용만 사용가능해짐
		System.out.println("↓↓↓↓↓↓Bb bb1 = new Bb(); 를 Aa로 업캐스팅↓↓↓↓↓↓");
		Aa aa2 = bb1; // > 원래는 Aa aa2 = (Aa) bb1; 
		System.out.println(aa2.a);
		aa2.a();
		
		
		//aa2는 Aa Bb 모두 내포하고있기때문에 다시 다운캐스팅이 가능하다 
		//(왜냐 aa2는 bb1을 업캐스팅 했었기 떄문에 둘다 내포되있기는함) 타입선언에 따라 사용이 달라질뿐
		System.out.println("↓↓↓↓↓↓aa2는 다운캐스팅 가능↓↓↓↓↓↓");
		Bb bb2 = (Bb) aa2;
		System.out.println(bb2.a);
		System.out.println(bb2.b);
		bb2.a();
		bb2.b();
		
		
		//업캐스팅은 구문에서 오류가 바로나서 알수있음
		//근데 다운 캐스팅은 구문에서 오류가 안나고 실행시 오류가남
		// 다운캐스팅시 그래서 instance of 를 사용해 요류가 안나도록 처리가 필요!
		
		
		
		
		//		Cc cc1 = (Cc) bb1; //구문 오류는 안남 
		//왜냐 bb1은 Cc타입은 내포가 안되있음 Aa Bb만 내포되있음
		//실행시는 오류남 
		
		
		
		
		
		
		System.out.println("======instanceof 사용법=========");
		
		if( bb1 instanceof Cc){ //bb1이 Cc를 내포하고 있을때 실행해라 라는뜻(true)
			//만약 내포가 안되있으면 false겠지?
			Cc cc1 = (Cc) bb1;
		} else { //Cc내포가 안되있을경우
			System.out.println("bb1은 Cc 타입을 내포하고 있지 않아용");
		}
		
		//다운캐스팅 시에만 사용한다 웬만해서 오류찾기떄문엥
		
		
		if(bb1 instanceof Aa) { //bb1은 Aa를 내포하고 있다면
			Aa aa10 = bb1; //bb1을 업캐
			System.out.println("Aa 내포하고 있으세요~");
		}else {
			System.out.println("Aa 타입은없습니다");
		}
		
		
		
		
		
		System.out.println("↓↓↓Cc객체를 Aa타입으로 생성해보자↓↓↓↓↓↓");
		
		//3.Cc 객체를 Aa 타입으로 생성
		
		Aa aa20 = new Cc(); //Cc();객체는 일단 모두 내포하고있음 근데 타입이Aa라 A만사용가능
		System.out.println(aa20.a);
		
		//다운캐스팅 해보자  instanceof 를 사용해서!
		//aa20 을 Aa ==> Bb 타입으로 그럼 Aa Bb 둘다 사용하기 가능해진다
		
		if(aa20 instanceof Bb){ //aa20 이 만약 Bb 타입을내포하고있을때
			Bb bb30 =(Bb) aa20; //조건이 만족할때 다운캐스팅 한다
			System.out.println(bb30.a);
			System.out.println(bb30.b);
			bb30.a();
			bb30.b();
		}
		
		//위 if에서 bb30을 블락 내에서 선언해서 지역변수라 아래 if에는 넣지 못한다
		
		if(aa20 instanceof Cc) { //aa20 이 Cc를 내포하고 있다면
			Cc cc30 = (Cc) aa20;
			System.out.println(cc30.a);
			System.out.println(cc30.b);
			System.out.println(cc30.c);
			cc30.a();
			cc30.b();
			cc30.c();
		}
			
		
		
		
		
		
		
		

	}

}
