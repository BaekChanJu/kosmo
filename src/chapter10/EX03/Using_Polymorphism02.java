package chapter10.EX03;

class Animal{ //최상의 부모 클래스 : 자식으로 공통되게 그대로 물려줌
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹는다");
	}
	
	void sleep() {
		System.out.println("모든 동물은 잠을 잔다");
		
	}
	
}



class Tiger extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속받는다
	int tigers;
	
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아먹습니다");
	}
}




class Egle extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속받는다
	int egles;
	
	void egleFly() {
		System.out.println("독수리는 하늘을 날아다닙니다");
	}
}




class Dog extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속받는다
	int dogs;
	
	void dogCry() {
		System.out.println("개는 멍멍 짖습니다");
	}
	
	
	
}
class Dog_sub extends Dog{
	//Animal 클래스의 모든 필드와 메소드를 상속받는다
	//Dog 클래스의 모든 필드와 메소드를 상속받는다 / 도그는 애니멀도 상속하니
	int dog_subs;
	
	void dogSubCry() {
		System.out.println("새끼 강아지는 낑낑 거립니다");
	}
	
}
public class Using_Polymorphism02 {

	public static void main(String[] args) {
		//1.Animal 객체를 Animal 타입으로 생성
			//a1은 Animal 타입만 가진다
				//Animal클래스의 필드와 메소드만 접근 가능
		Animal a1 = new Animal(); //Animal(); 객체는 >  Animal 타입이다
		
		
		//2.Tiger 객체를 Tiger 타입으로 생성
			//t1은 Animal,Tiger 둘다 내포 
			//타입이 Tiger 이니 Animal,Tiger 의 필드메소드 모두 접근가능
		Tiger t1 = new Tiger(); //Tiger(); 객체는 >  Tiger 타입이다
		
		
		//3.Tiger 객체를 Animal 타입으로 생성 /자식을 부모로/업캐스팅(자동)
			//a2은 Animal,Tiger 둘다 내포 
				//하지만 타입이 Animal 이라 Animal 의 필드와 메소드만 사용가능
		Animal a2 = new Tiger(); //Animal a2 = (Animal) new Tiger();
		
		
		//4.Dog 객체를 Dog 타입으로 생성
			//d1은  Animal,dog 를 내포 하고 Dog로 타입을 지정했으니
			//Animal,dog 의 필드와 메소드 모두 사용가능
		Dog d1 = new Dog();
		
		//5.Dog 객체를 Animal 타입으로 생성
			//a3는 Animal,dog 를 내포 하고 Animal러 타입을 지정했으니
			//Animal에 있는 필드와 메소드만 사용가능
		Animal a3 = new Dog();
		
		
		//6.Dog_sub 객체를 Dog_sub 타입으로 지정
			//ds1는  Animal,dog,Dog_sub를 내포하고있고
			//Dog_sub로 타입을 지정했으니  Animal,dog,Dog_sub의 모두 사용가능
		Dog_sub ds1 = new Dog_sub();
		
		
		//7.Dog_sub 객체를 Dog 타입으로 지정
			//d2는 Animal,dog,Dog_sub를 내포하고있고
			//Dog타입으로 지정했으니 Animal,dog 까지만 사용가능
		Dog d2 = new Dog_sub();
		
		
		//8.Dog_sub 객체를 Animal 타입으로 지정
			//a4는 Animal,dog,Dog_sub를 내포하고있고
			//Animal타입으로 지정했으니 Animal만 사용가능
		Animal a4 = new Dog_sub();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
