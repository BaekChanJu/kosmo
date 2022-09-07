package chapter07.EX01;



class A{
	//필드
	int m =3;
	int n =4;
	
	//기본생성자 생략
	
	//메소드1
	void work1() {
		int k =5; //지역변수
		System.out.println(k);
		work2 (3);  // work2 (3) 이라는 메소드 호출한거임
	}
	
	//메소드2
	void work2 (int i) { //int i는 3이 들어가는것임
		int j=4;
		System.out.println(i + j); //7 work2는 즉 7이당
	}
}



public class Using_Field {

	public static void main(String[] args) {
		
		//객체  생성 
		A a = new A(); //기본 생성자 호출인데 생략되어있음
		
		//필드값 출력
		System.out.println(a.m);
		System.out.println(a.n);
		
		
		//메소드 호출
		a.work1(); //5하고 7뜸 //7은 계산됨

	}

}
