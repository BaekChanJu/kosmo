package chapter09.EX01;

// 클래스의 접근 지정자 : public 과 default
//필드,생성자,메소드의 접근 지정자 :  public , protected, default, private

//	public : 다른 패키지, 같은 패키지 모두가능
//	protected : 다른패키지(상속된경우만), 같은패키지 모두가능
//	default : 같은패키지 에서만 가능
//	private :  같은 파일 에서만 가능

public class A {
	//필드의 접근 제어자
	public int a = 10; // public 이니 같은패키지 다른패키지 접근가능
	protected int b = 20; //protected 같은패키지(상속) 나 다른패키지 접근가능
	int c = 30; //default 같은 패키지에서만
	private int d = 40; // private 같은 파일에서만

	
	
	//메소드의 접근제어자
	public void print1() { 
		System.out.println("A 클래스 출력 - public");
	}
	protected void print2() { 
		System.out.println("A 클래스 출력 - protected");
	}
	void print3() { 
		System.out.println("A 클래스 출력 - default");
	}
	private void print4() { 
		System.out.println("A 클래스 출력 - private");
	}
	
}
