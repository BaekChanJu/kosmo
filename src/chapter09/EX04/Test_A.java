package chapter09.EX04;

public class Test_A {

	public static void main(String[] args) {
		
		//객체 생성후 출력 ( 인스턴스, 정적)
		A a1 = new A();
		System.out.println(a1.m);
		//m은 인스턴스필드니까 이렇게 객체를 생성해야만 사용이 가능함
		
		System.out.println(a1.n);
		//n은 정적필드 객체생성해도 사용이 가능
		
		
		
		
		
		System.out.println("====객체생성 없이 출력====");
		//객체 생성 없이 출력( 클래스이름.정적필드 )
		System.out.println(A.n); //객체는 a1이니 안쓰고 클래스이름A와 정적필드n
		
		
		
		
		
		System.out.println("====정적필드의 객체간공유====");
		//정정필드는 모든 객체에서 공유하는 필드다
		A a2 = new A();
			a2.m =10; //m의값을 3에서 10으로 변경해봤다
			a2.n= 1000;
			//1번 10  1000 / 2번 3 1000 / 3번 3 1000
			//이렇게 m값은 한번만 바뀌고 그대로 돌아오지만
			//정적필드n은 모든객체에서 공유가되는 필드다
			
			//그니까 m 인스턴스 필드는 그 객체에서만 값이 저장이 되는것
			//n같은 정적필드는 모든객체에 공유해주는것
		A a3 = new A();
		A a4 = new A();
		//객체 정보 출력
		a2.print();
		a3.print();
		a4.print();
		
		
		
	}

}
