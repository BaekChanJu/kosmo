package chapter09.EX01;

//<같은 패키지 안에서 상속>

//패키지 안에 A가 있기때문에 import가 따로 없음
//E 클래스는 A 클래스를 상속받는다 / 같은패키지 안에서의 상속
	//A클래스의 모든 필드와 모든 메소드를 물려받는것임

//A클래스 : 부모 클래스 ( super 클래스 ) 라고 불림
//E클래스 : 자식 클래스 ( child 클래스 )

public class E extends A {
	public void print() {
		
		System.out.println("========부모의 필드 출력========");
		System.out.println(a); //public  < 부모 필드의 a
		System.out.println(b); // protected   < 부모 필드의 b
		System.out.println(c); // default < 부모 필드의 c
//		System.out.println(d); // private <  부모 필드의 d
		
		
		System.out.println("========부모의 메소드 호출========");
		print1(); // public  < 부모 클래스의 메소드 호출
		print2(); // protected  < 부모 클래스의 메소드 호출
		print3(); // default  < 부모 클래스의 메소드 호출
//		print4(); // private  < 부모 클래스의 메소드 호출
		
	}

}
