package chapter10.EX08;

//super Method : 부모 클래스의 생성자를 호출
	// -- 생성자 내부에서만 사용가능
	// -- 꼭 생성자 첫라인에 위치해야함



// 자식클래스는 생성자 앞에 this() 나 super() 가 반드시와야한다
//	기본적으로 만약 생략이 되있으면 super() 다

//자식클래스는 생성되어있으면 슈퍼가 있는것이다!!
class Aa{
	
	//기본생성자 (매겨변수가없는)
	Aa(){
		System.out.println("Aa클래스의 기본생성자인 Aa()");
	}
	
}

class Bb extends Aa{
	
	//기본생성자
	Bb(){
		//사실 여기에는 super(); 이게 생략되어있음 생략시 자동으로 컴파일러가 넣어줌
		//그래서 자식클래스 생성자 호출하는순간 원래 부모가 만들어지고 자식이 만들어지는 순서이다
		//super(); 는 그저 안보일뿐
		
		super(); //생략해도 되는데 매개변수가1개있는 부모타입 부를때는 넣어줘야하니까 써주고 넣어주면됨
		System.out.println("Bb클래스의 기본생성자인 Bb()");
	}
}





class Cc{ //부모클래스
	//객체 내부에 생성자가 존재할경우 컴파일러는 기본생성자를 자동으로 추가해 주지 않는다
	//아래 이미 CC(int a) 가 존재하니까 기본생성자는 자동으로 추가가 안된거임 생략이아니라
	//아예 없는상태가 되어버린거임 그래서 기본생성자를 하나 만들어줘야 아래Dd 상속관계에서 오류가 안남
	
	Cc(){} // 넣자마자 기가막히게 바로 아래 상속 오류가 없어진다
	
	
	//매개변수1개인 생성자
	Cc(int a){
		System.out.println("Cc 클래스의 매개변수가1개인 생성자 Cc(int a)");
	}
}
 
class Dd extends Cc{ //엥? 오류가 반드시 발생함 왜냐면
	/*
	 Dd 클래스를 생성하면 
	 
	 D(){ 
	 	super();
	 
	 } 라는 기본생성자가 생기고 생략되어있다 이걸 넣어주면 상관이없는데 생략이 
	 되어있어서 오류가 나는거임
	  * */
	
	//정리를하자만 상속관계에서는 기본생성자를 꼭 하나 만들어 놔야 다른 생성자가 존재할경우
	//상속에서 에러 문제가 안생긴다!  아니라면 물리적으로 Dd 클래스에 super에 매개변수 하나넣은 생성자를
	//만들어주면된다 아래처럼 (Cc에 기본생성자안만들 경우임!)
	
	
	/* Dd 클래스의 생성자가 존재하지 않을때 컴파일러는 기본생성자를 넣는다
	 Dd(){
	 super(3); 
	   }
	  * */
	
	Dd(){
		super(3); //부모클래스의 매개변수1개인 메소드 호출 
		//생략해도 되는데 매개변수가1개있는 부모타입 부를때는 넣어줘야하니까 써주고 넣어주면됨
		//즉 super(3)는 부모의 Cc 클래스의 매개변수가1개인 생성자 Cc(int a) 매개변수가1개인
		//요걸 호출
		System.out.println("Dd클래스의 기본생성자인 Dd()");
		
		
	}
	
	Dd(int a){
		this(); //이것은 자기자신의 생성자를 호출임 > 즉 this()는 
		//"Dd클래스의 기본생성자인 Dd()" 이걸호출
		System.out.println("Dd 클래스의 매개변수1개인 생성자 호출");
		
	}
	
}
public class Using_Super02 {

	public static void main(String[] args) {
		//1.자식객체 생성  Bb 호출 > 출력은 Aa가먼저 출력되고 Bb가 그다음호출된다 
		Bb bb = new Bb(); 
		
		
		System.out.println("================");
		
		//2. 자식객체 생성 Dd() 호출 >
		Dd dd = new Dd();
		
		
		
		System.out.println("================");
		
		Dd dd2 = new Dd(2); //매개변수 넣어주면 Dd의 매개변수1개인 생성자까지 출력됨
		//근데 그안에 this가있으니 그위에껏도 나오고 그위에 슈퍼도 있으니 그 위에껏도 출력하고
		//총3개가 출력되는데 순서는 부모것 부터 나온다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
