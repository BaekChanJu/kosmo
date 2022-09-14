package chapter08.EX02;


// import 를 이용해 외부패키지 적용한 경우임

	//동일한 클래스(이름)는 import해서 사용을 못한다 무슨소리냐 하면
	// EX01 하위에 com에 A라는 클래스를 하나 더만들었다 그럼 여긴 이미 A클래스가있으니
	//com에 있는 A는 import로 사용이 불가능하다라는 뜻이다

//import chapter08.EX01.com.A;  즉 이녀석은 불가능하다
	//그래서 전체이름으로 import 방법 말고 선언해주면 사용이 가능하다(패키지명+클래스명)

import chapter08.EX01.A;

public class Using_Pakege02 {

	public static void main(String[] args) {
		//A라는 클래스는 같은 패키지 안에 존재하지 않는다
			//그래서 커서두면 인포트하겠습니까 에서 클릭해서
			//EX01에 있는A클래스를 지금 임포트해왔다 / import chapter08.EX01.A;
		
		// -A클래스는 접근 제어자가 public이나 protected(상속시에만) 로 지정되어있어야함
		
		
		
		System.out.println("public===A클래스 접근(모두가능하니 성공!)========");
		A a = new A(); 
		
		System.out.println(a.m); //다른패키지에서 접근함
		System.out.println(a.n); //다른패키지에서 접근함
		a.print(); //다른패키지에서 접근함

		
		
		
		
		System.out.println("default===B클래스 접근(다른패키지 실패)=========");
		//B b = new B();
		
		//접근자가  default - default는 다른패키지에서는 사용이 불가
		//B클래스는 다른패키지에 존재한다 그래서 오류
		
		
		
		
		
		System.out.println("=======com.A 클래스 객체 생성=======");
		//동일한 A클래스는 import가 불가능하니
			//패키지명 + 클래스명으로 작업을 해줘야한다 
		chapter08.EX01.com.A aa = new chapter08.EX01.com.A();
		
		System.out.println(aa.aa); //public이니 다른패키지 접근가능
		System.out.println(aa.bb); //public이니 다른패키지 접근가능
		
		aa.print(); //public이니 다른패키지 접근가능
		
		
		
		
		
		
		
		
		
		
		
	}

}
