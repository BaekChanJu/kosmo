package chapter08.EX01;

public class Using_Package01 {

	public static void main(String[] args) {
		
		
		System.out.println("public===A클래스 접근(모두가능하니 성공!)========");
		// 1.public 의 경우
		//A 클래스와 같은 패키지에 존재 : import 없이 바로 접근가능
		
		
		A a = new A(); //A라는 class  A.java에 public으로 만들어놓음
		
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		a.print(); //임포트 test
		
		
		
		
		
		
		
		System.out.println("default===B클래스 접근(같은패키지 성공!)=========");
		//2.default 의 경우 
			//같은패키지에서만 접근가능  chapter08.EX01;에서만
		B b = new B();
		
		System.out.println(b.a);
		System.out.println(b.b);
		b.print();

	}

}
