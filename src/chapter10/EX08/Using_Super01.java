package chapter10.EX08;

//생성자만이고 메소드오버라이딩과는 다르다

//super keyword : 상속관계에서 부모 클래스를 (Super 클래스) 의 필드나, 메소드를 호출

//super Method : 상속관계에서 부모 클래스의 생성자를 호출할때 사용
	//그리고 생성자 내부에서 사용되고, 반드시 첫 라인에 와야한다



//this keyword : 자기 자신 객체의 필드, 메소드 호출

//this method : 자기 자신 객체의 생성자를 호출
	//생성자 내부에서 사용, 반드시 첫라인에 와야함


class A{
	
	void abc() {
		System.out.println(" A 클래스의 abc 라는 메소드");
	}
}

class B extends A{
	
	@Override
	void abc() { //오버라이딩된 메소드임
		System.out.println(" B 클래스의 abc 라는 메소드"); 
	}
	
	
	void bcd() { //bcd 안에서 abc 메소드 호출하기
		abc(); //원래모양은 this.abc(); 인데 this 생략 <메소드안에 메소드를쓰면 앞에 this는다생략>
		//this는 자기 자신에 있는 abc를 호출하는것임( B 클래스의 abc 라는 메소드)
		//즉 B클래스의 abc를 호출함

		super.abc(); //super을 붗히면 자기자신이아닌 부모의 메소드를 출력시켜줌
		//즉 A클래스의 abc를 호출
	}
}

public class Using_Super01 {

	public static void main(String[] args) {
		
		//1. 객체생성
		B bb = new B(); //B(); 라는 객체는 B클래스 타입이다
		
		//2.메소드호출
		bb.bcd();

	}

}
