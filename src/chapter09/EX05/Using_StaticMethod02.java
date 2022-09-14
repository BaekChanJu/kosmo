package chapter09.EX05;

class B{
	
	int a =10; //인스턴스 필드
	static int b=20; //정적 필드
	
	void abc() { //인스턴스 메소드 객체생성후 사용가능
		//인스턴스 필드, 정적필드, 인스턴스메소드, 정적메소드 객체생성만되면 다 호출가능
		//인스턴스 메소드에는 모두다 올 수 있다
		
		System.out.println(a); //인스턴스 메소드안에 인스턴스 필드 오류없음
		System.out.println(b); // //인스턴스 메소드안에 정적 필드 오류없음
		cde(); //인스턴스 메소드안에 인스턴스 메소드 호출가능
		bcd(); //인스턴스 메소드안에 정적 메소드 호출가능
	}
	
	
	
	static void bcd() { //정적메소드 : 객체 생성없이도 호출가능
		//정적필드, 정적 메소드만 가능하다 정적에서는 정적만!
		
		//정적 메소드는 객체 생성 없이 사용이 가능하다 배웠다 그런데!
		//인스턴스 필드나, 인스턴스 메소드는 객체를 생성해야만 사용이 가능하다
		
		System.out.println("난 정적 메소드야! bcd()");
		
//		System.out.println(a); //인스턴스라 오류남
		System.out.println(b); // //인스턴스 메소드안에 정적 필드 오류없음
//		cde(); //인스턴스 메소드라 오류남
		
		}
	
	
	void cde() { //인스턴스 메소드
		System.out.println("난 인스턴스 메소드야! cde()");
	}
	
	
	 static void def() { //정적턴스 메소드
		System.out.println("\"난 정적 메소드야! def()");
	}
}

	
public class Using_StaticMethod02 {

	public static void main(String[] args) {

		
		//객체생성 없이 바로 호출가능한 : 정적필드, 정적메소드 static
			//클래스명.필드 or 클래스명.메소드이름
		
		System.out.println("static 객체 생성 없이 바로호출");
		System.out.println(B.b);
//		System.out.println(B.a); 인스턴스라 안나옴 
//		B.abc(); 인스턴스라 안나옴 
		B.bcd();
		
		
		//객체 생성후 는 인스턴스 필드 정적필드 모두 호출이 가능하다!
		B b = new B();
		b.cde(); // 인스턴스 객체 생성후 사용가능
		b.def(); //정적은 객체생성해도 사용가능 ㅎ
	}

}
