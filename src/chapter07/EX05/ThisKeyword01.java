package chapter07.EX05;
//메소드 내부에서 필드를 활용할때나 메소드안에서 메소드를 사용할때
class A{
	int m;
	int n;
	
	//A(){}  <== 기본생성자, 생략중
	
	void init (int a, int b) {
		int c; //지역변수에는 this를붙히지 않는다
		c=3;
		
		m=a;  //this가 지금 숨겨져있는것이다 
		//this는 자신의 객체를 뜻하는것이다 그니까 this.m=a; 이다 this가 생략된거임
		n=b; 
	}
	
	void work() {
		init(2,3); //work라는 메소드를 호출하게 되면 init이라는 메소드가 호출되는형태
		//this. init이다 원래 this 생략된거임
		//this생략시 컴파일러가 자동으로 할당해줌
		System.out.println(m+" " + n);
	}
}

public class ThisKeyword01 {

	public static void main(String[] args) {
		//This keyword : 클래스의 생성자나 메소드 내부의(필드와 메소드)에 컴파일러가 자동할당
			//객체 자신을 뜻함
			//필드와 메소드를 선언시에는 this 키워드를 사용하면 안됨
			//필드와 메소드가 클래스의 메소드 내에서 사용될때 컴파일러가 자동으로 할당
			//기본적으로는 생략되어있음
			//메소드나 생성자에서 인풋매개변수 이름, 필드이름이 동일할 경우 명시해야함
		
		//This Method : 클래스 내에서 다른 생성자를 호출, 생성자에서 사용됨, 
		//생성자에 첫라인에 와야함
		
		A a = new A();

	}

}
