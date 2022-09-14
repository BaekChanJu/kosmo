package chapter09.EX03;

//기존 클래스의 외부 클래스 생성 : 다른패키지에서 접근이 불가능합니다
	// 간단하게 외부 패키지에서는 접근이 불가능하다라는 뜻
	//같은 패키지에서 사용할 경우 이렇게 외부 클래스를 생성해주면 됌

//외부패키지에서 A클래스를 사용하려면 별도의 파일로 생성 해줘야한다  (아니면 퍼블릭 이던가)

class A{ //default 접근 지정자가 생략되어있는 것임
	
	int m = 10; //다  default 가 생략되어있는 것임 그래서 외부클래스에서 사용불가
	int n = 20;
	
	void print() {
		System.out.println(m + " , " +n);
	}
	
}

public class Using_Modifier10 {

	public static void main(String[] args) {
		//
		A a = new A();
		
		a.print();
		
		B b = new B();
		b.print();

	}

}
