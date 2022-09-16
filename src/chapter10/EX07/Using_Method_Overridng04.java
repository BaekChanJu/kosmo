package chapter10.EX07;

import chapter10.EX07.*;

class Animal{
	//문제 아래 2개 메소드를 자식클래서에서 오버라이딩 할꺼임 (오버라이딩 당해서 삭제가아닌숨겨질꺼임)
	//Animal 타입으로 모두 객체 정의하고 , 배열에 저장후 오버라이딩 된 메소드를 출력해보자
	//for 문과 향상 된 for문으로
	void run() {
		System.out.println("모든 동물은 달린다");
	}
	void eat() {
		System.out.println("모든 동물은 음식을 먹는다");
	}
}

class Tiger extends Animal{
	int count; //상속안된 타이거만의 필드 //호랑이수 //지금애니멀 타입이니 다운캐스팅해야 읽을수있음
	
	Tiger(int count){ //카운트를 받는 생성자 만들어주기  정수를하나 인풋받아서 필드에 할당
		this.count=count;
	}
	
	@Override
	void run() {
		System.out.println("호랑이는 빠르게 달린다");
	}
	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹는다");
	}
}

class Egle extends Animal{
	int count; //지금애니멀 타입이니 다운캐스팅해야 읽을수있음
	
	Egle(int count){
		this.count=count;
	}
	
	@Override
	void run() {
		System.out.println("독수리는 하늘을 가른다");
	}
	@Override
	void eat() {
		System.out.println("독수리는 생선을 먹는다");
	}
}

class Fish extends Animal{
	int count;
	
	Fish(int count){
		this.count=count;
	}
	
	@Override
	void run() {
		System.out.println("물고기는 바다를 가른다");
	}
	@Override
	void eat() {
		System.out.println("물고기는 플랑크톤을 먹는다");
	}
	
}

class Dog extends Animal{
	int count;
	
	Dog(int count){
		this.count=count;
	}
	
	@Override
	void run() {
		System.out.println("강아지는 귀엽게 달린다");
	}
	@Override
	void eat() {
		System.out.println("강아지는 사료를 먹는다");
	}
	
}

public class Using_Method_Overridng04 {

	public static void main(String[] args) {
		
		//객체생성 , 생성자
		Animal a1 = new Animal();
		Animal a2 = new Tiger(10); // 타이거라는 생성자에 10을 넣어준거임 생략된 생성자를
		//정수를 받는 생성자로 하나 만들어줘야함 
		Animal a3 = new Egle(5);
		Animal a4 = new Fish(50);
		Animal a5 = new Dog(70);
		
		
		//지금 다 애니멀 타입이라 다운캐스팅을 해야 자식클래스들의 필드내용을 읽을수있음
		//객체를 배열에 저장
		
		//for 문으로 eat과 run 출력 , 동물의 총마리수까지
			//1.for 문을 사용해서 객체 Animal 객체로 먼저 뽑고
			//for문 안에서 다운캐스팅을 해서 그 자식클래스안에 필드를 뽑아낸다
		
		Animal arr[] = new Animal[] {a1,a2,a3,a4,a5};
		//지금 배열안에 저장된 객체들은 애니멀 타입이라 원래는애니멀안에것만 출력이가능하다
		//그래서 저아래 폴문 아래서 다운캐스팅 시켜서 출력시키는것이다
		//다운캐스팅을해야 자식안에있는 카운트 필드를 읽을 수 있으니까
		
		int sum = 0;
	
		for(int i= 0; i<arr.length; i++) {
			//배열의 각 방에 저장된 객체(a1,a2,a3,a4,a5)를 Animal 객체에 저장시킨다
			Animal aa= arr[i];  //0번째방은 애니멀 1번방은 타이거 2번방은 이글 3번방은 피쉬
			//를 내포하고 있다 라는 뜻을 만들어준거임 방과 생성자 위치
			System.out.println("======for문안");
			aa.eat(); //애니멀타입이지만 오버라이딩된 자식클래스들까지도 나옴
			//오버라이딩이라서 메소드만 덮어써서 사용할수있지
			//본질은 애니멀 타입이니까 결국 타이거 안에 필드는 쓸수없다
			aa.run();
			
			if(aa instanceof Tiger) {
				Tiger t1 = (Tiger) aa; //다운그래이드 타이거로 시켜서
				//타이거 안에 필드 count를 쓸수있게해준것
				sum += t1.count;
			}
			
			if(aa instanceof Egle) {
				Egle t1 = (Egle) aa;
				sum += t1.count;
			}
			
			}
		
		
		System.out.println("총동물수" + sum);
		
	
		
	
		
		
		

	}

}
