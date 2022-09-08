package chapter07.EX03;


class AA{
	
	//필드
	int a;
	int b;
	int c;
	int d;
	String name;
	
	//생성자
	//1.기본 생성자
	AA(){
		System.out.println("기본생성자 호출문");
	}
	AA(int a){
		this.a = a;
	}
	AA(int a, int b){
		this.a = a;
		this.b = b;
	}
	AA(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	AA(int a, int b, int c,int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	AA(int a, int b, int c,int d, String e){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		name = e;
	}
	
	
	void show() {
		System.out.println("a :" + a + " b : " +b + " c : " + c + " d : " + d );
		System.out.println("name : "  + name);
	}
	
}
public class Using_Constructor02 {

	public static void main(String[] args) {
		//Constructor (생성자) 오버로딩
		
		//객체생성
		
		AA aa1 = new AA(); //기본 생성자 호출
		aa1.show();
		
		AA aa2 = new AA(10); //매개변수1개인 생성자호출
		aa2.show();
		
		AA aa3= new AA(10,20); //매개변수2개인 생성자호출
		aa3.show();
		
		AA aa4= new AA(10,20,30); //매개변수2개인 생성자호출
		aa4.show();
		
		AA aa5= new AA(10,20,30,40); //매개변수2개인 생성자호출
		aa5.show();
		
		AA aa6= new AA(10,20,30,40,"백찬주"); //매개변수2개인 생성자호출
		aa6.show();

	}

}
