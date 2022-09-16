package chapter10.EX09;

//this() : 자신의 객체의 생성자 호출, 생성자 내부 첫라인위치


//super() : (상속일때)부모의 객체의 생성자 호출, 생성자 내부 첫라인에 위치
//	자식클래스는 생성자 내부에this나super가 반드시있어야 합니다 암것도없으면 super라는뜻
			//상속관계아닐땐 없어도됨
// 부모클래스에 기본생성자가 생략되어있어서 오류날수 있으니까 왠만해서 그냥 생성해두자
//슈퍼가 생략되있을때 부모에 기본생성자가 없으면 오류난다 이뜻

class A{
	A(){
		this(3); //아래 매개변수받는 생성자 있어서 오류안남ㅋ
		System.out.println("A생성자 - A()");
	}
	
	A(int a){
		System.out.println("A 매개변수1개인 생성자  - A(?)");
	}
	
	//A(int a) 가 먼저 출력됨 왜냐면 this를 만나면 this는 매개변수1개인 생성자
	//출력해라 이니 A(int a)가 먼저출력되고 그다음 기본생성자가 출력된다
}

class B extends A{
	B(){
		this(3);
		System.out.println("B생성자 - B()");
	}
	
	B(int a){
		//자식클래스인데 생략되있으니 슈퍼임
		System.out.println("B 매개변수1개인 생성자  - B(?)");
	}
	
	//A는 자식클래스가 아니라 상관이없지만 B는 자식클래스라 super 가 생략이 되어있다
	// 지금은 B(int a) 생성자 첫줄에는 super()가 생략되어있고
	
}

public class Using_Super03 {

	public static void main(String[] args) {
		//1.A 객체 생성
		A aa1 = new A(); //A의 기본생성자 호출 순서는 위에설명
		
		System.out.println("==============");
		
		A aa2 = new A(3); //매개변수1개인생성자만 출력됨
		//자식클래스도 아니고 this도 없으니 그냥 본인것만 잘 나옴
		
		
		
		
		
		
		System.out.println("==============");
		//2. B 객체생성
		B bb1 = new B(); // 4개가 찍힘
		//A 매개변수1개인 생성자  - A(?)
		//A생성자 - A()
		//B 매개변수1개인 생성자  - B(?)
		//B생성자 - B()
		//이순서로
		
		/*
		  B의 기본생성자로 갔는데 this(3) 을만나서 매개변수 1개인 생성자로 갔다
		  근데 B(int a) 는 자식클래스인데 생략되있으니 super라는뜻 super는
		  부모클래스의 것을 가져오는 것이다 super() 는 기본생성자를의미하니
		  A의 기본생성자로 갔는데 A의 기본생성자가 또 this(3)이 있으니
		  A(int a) 로간다 그래서 출력이
		  A(int a) , A() ,B(int a) , B() 이순으로 출력되는것이다
		  
		  
		  
		  
		  
		  
		  
		  
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
