package chapter10.EX06;

public class Animal{
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
	@Override
	void run() {
		System.out.println("강아지는 귀엽게 달린다");
	}
	@Override
	void eat() {
		System.out.println("강아지는 사료를 먹는다");
	}
	
}
public class Using_Metgod_Overriding03 {

	public static void main(String[] args) {
		
		Animal t = new Tiger(); // 타이거라 애니멀 타이거 다쓸수있지만 타입이 애니멀
		Animal e = new Egle();
		Animal f = new Fish();
		Animal d = new Dog();
		
		Animal[] arr = new Animal[] {t,e,f,d};
		
		for(int i=0; i<arr.length; i++) {
			arr[i].run();
			arr[i].eat();
		}
		
		for(Animal k : arr) {
			k.eat();
			k.run();
		}

	}

}
