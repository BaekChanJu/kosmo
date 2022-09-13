package chapter07.EX05;

//Aa 클래스  : 여러개의 생성자 사용시 this()없이 사용한경우
	//중복된 값을 매번 입력해야함 ㅠ
class Aaa{
	int m1, m2, m3, m4; //정수 값을 담는 필드 4개 선언
	
	
	Aaa(){ //기본생성자
		m1=1; m2=2; m3=3; m4=4; //필드의 기본값 할당 
	}
	
	Aaa(int a){//매개변수1개인 생성자
		m1 =a; m2=2; m3=3; m4=4;
	}
	
	Aaa(int a , int b){
		m1 =a; m2=b; m3=3; m4=4; 
	}
	
	void print() { //각 필드의 값을 출력하게 해주는 메소드
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	}
	
}





//Bb 클래스 : 여러개의 생성자 사용시 this() 사용해서 연계연계
	//중복된 값을 설정해서 가능
class Bbb{
	int m1, m2, m3, m4;
	
	
	Bbb(){
		m1=1; m2=2; m3=3; m4 =4;
	}
	
	Bbb(int a){
		this();
		m1=a;
	}
	
	Bbb(int a, int b){
		this(a);
		m2=b;
	}
	
	void print() { //각 필드의 값을 출력하게 해주는 메소드
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4 + " ");
		System.out.println();
	
 }

}





public class ThisMethod02 {

	public static void main(String[] args) {
		
		//1.3개의 객체 생성 ( this 미사용 )
		System.out.println("======this()미사용=======");
		
		Aaa aaa1 = new Aaa();
		aaa1.print();
		
		
		Aaa aaa2 = new Aaa(10);
		aaa2.print();
		
		Aaa aaa3 = new Aaa(10,20);
		aaa3.print();
		
		
		//2. 3개 객체 생성 (this() 사용)
		System.out.println("======this()사용=======");
		
		Bbb bbb1 = new Bbb();
		bbb1.print();
		
		
		Bbb bbb2 = new Bbb(10);
		bbb2.print();
		
		Bbb bbb3 = new Bbb(10,20);
		bbb3.print();
		

	}

}
