package chapter10.EX02;

class Aa{
	int a = 10 ;
	
}

class Bb extends Aa{
	int b = 20;
}

class Cc extends Bb{
	int c = 30;
}

class Dd extends Bb{
	int d = 40;
}

public class Using_Polymorphism01_1 {

	public static void main(String[] args) {
		// 다형적 표현
		
		Aa a1 = new Aa(); //Aa라는 부모 클래스의 객체 타입Aa, 객체는Aa()
		System.out.println(a1.a); //10
		
		Bb b1 = new Bb(); //타입Bb 객체 Bb();
		System.out.println(b1.a); //상속된a 니 10
		System.out.println(b1.b); //이건 원래 자신의 것
		
		
		//자식 객체를 생성시 타입을 부모로 지정하면 부모의 필드와 메소드만 접근가능
		Aa a2 = new Bb(); //타입은Aa 지만 객체는 Bb() 결국 Bb는 Aa이다
		//이러면 Aa에 있는 필드메소드만 사용할 수 있다
		
		//Aa a2 = (Ab)new Bb(); - 원래는 이모양 인건데 위엔 생략된거임
		//자바에서 = 기준 좌우는 꼭 타입이 같아야한다
		//업캐스팅이 자동으로 되어 Bb(); 가 생략된 (Ab) 된다는 의미다
			//업캐스팅은 자신의 타입을 부모의 타입으로 변환하는걸의미한다
		
		//즉 Aa a2 = new Bb(); 이건 Aa a2 = (Ab)new Bb(); 원래이거다
		
		System.out.println(a2.a); //객체를 B로 만들었지만 사용은 A만 할수있다 라는뜻
//		System.out.println(a2.b); //오류
		
		
		//다운캐스팅 : 부모타입을 자식타입으로 변환 (수동으로 명시해줘야함)
		
		Bb b2 = (Bb) a2; // 이렇게 다운캐스팅 해주면  a2는 부모만 쓸수있었지마
		//Bb클래스도 사용할수 있게된다
		System.out.println(b2.a); //Aa에 있는 필드
		System.out.println(b2.b); //Bb에 있는 필드
		
		//다시 업캐스팅을 해볼까? (명시안해도 컴파일러가 자동으로 등록)
		Aa a3 = b2; //b2를 다시 업캐스팅한거임 (자식에서 부모로 변환하는것)
		//Aa a3 =(Aa) b2; 이렇게 명시 안해도됨
		//이러면 다시 Aa의 필드와 메소드만 사용가능
		System.out.println(a3.a);
//		System.out.println(a3.b); //오류
		
		//또 다운캐스팅  해보자
		Bb b3 =(Bb) a3; //다운캐스팅할때 생성자명과 () 안에는 자식클래스의 명을 넣으면 되는듯
		// 객체명은 새로만들어주는것이고 맨뒤 변수는 다운캐스팅할 변수를 넣는것이다
		
		System.out.println(b3.a);
		System.out.println(b3.b);
		
		//결론
		//Aa 일떄는 Aa에 있는것만사용가능 하지만 다운캐스팅해서 Bb를하면 부모의 필드메소드 본인것
		//모두모두 사용이 가능한것이다!
		System.out.println("====================================");
		
		
		
		//Dd()객체를 생성하면서 Aa타입으로 업캐스팅 한것이다 초기가!(아래가)
		Aa a5 = new Dd(); //Dd();라는 객체는 a5라는 이름을 가진 Aa타입이다
		//그럼 Dd()는 지금 A부터 B를 거쳐 상속된 객체였다
		//그럼 클래스D 안에는 B클래스가 들어가있고 D자신의 내용이있고 A클래스 까지 있는것이다
		//결론은 D클래스를 new해서 만드는 순간 B와A를 모두 품고있었던 것이다
		//하지만 지금 A타입을 선언했기때문에 A에 있는 내용만 사용을 할 수 있는것이다
		//원래모양은 Aa a5 =(Aa) new Dd(); - 이유 업캐스팅은 자동이기에
		System.out.println(a5.a); //Aa에 있는 것만 출력가능
		
		//Aa타입의 a5를 Bb 타입으로 다운캐스팅 - 수동으로 명시해줘야함
		Bb b10 =(Bb) a5;
		System.out.println(b10.a);
		System.out.println(b10.b); //Bb 클래스까지 사용이 이제 가능한것이다
		
		//Bb 타입의 b10을 Dd 타입으로 다운캐스팅
		
		Dd d10 =(Dd) b10;
		System.out.println(d10.a);
		System.out.println(d10.b);
		System.out.println(d10.d);
		
		//Aa타입의 a5를 Dd 타입으로 다운캐스팅
		
		Dd d11 =(Dd) a5;
		System.out.println(d11.a);
		System.out.println(d11.b);
		System.out.println(d11.d);
		
		//다시 그럼 업캐스팅을 시도해보자
		
		Aa a20 = d11; //()안해줘도됨 자동으로됨 자식에서 부모로 갈때는 ㅎ
		
		System.out.println(a20.a);
		
	}

}
