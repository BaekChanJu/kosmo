package chapter09.EX05;

	//메서드 이름앞에 static 가 없는 것 : 인스턴스 메서드 : 객체 생성후 호출가능
	//메서드 이름앞에 static 가 있는 것 : 정적 메서드 : 객체 생성없이 호출가능

class A{
	void abc() {
		System.out.println("인스턴스 메서드");
	}
	
	static void bcd() {
		System.out.println("정적 메서드");
	}
}

public class Using_StaticMethod {

	public static void main(String[] args) {
		
		//객체 생성없이 바로 호출 : 정적메소드
		
		A.bcd();  //클래스이름 + 메소드명
		
		
		//객체 생성후 호출은
		A a = new A();
		
		a.abc(); //인스턴스니 무저건 객체화 한다음 호출가능
		a.bcd();

	}

}
