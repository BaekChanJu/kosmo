package chapter10.EX05;

class Animal{
	void cry() {
		System.out.println("모든 동물은 운다");
	}
}

class Bird extends Animal{
	
	@Override
	void cry() {
		System.out.println("짹쨱");
	}
} 

class Cat extends Animal{
	
	@Override
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	
	@Override
	void cry() {
		System.out.println("멍멍");
	}
}

public class Using_Method_Overriding02 {

	public static void main(String[] args) {
		//1번은 각각 같은 타입으로 선언해보기
		Animal aa = new Animal();
		Bird bb = new Bird();
		Cat cc = new Cat();
		Dog dd = new Dog();
		
		aa.cry();
		bb.cry();
		cc.cry();
		dd.cry();
		
		
		//2.Animal 타입으로선언 + 클래스는 자식클래스
		//자식(); 객체를 만들면서 타입을 Animal(부모)로 정의후
		//부모에 있는 메소드를 호출했을때 오버라이딩된 메소드가 출력된다
		
		//오버라이딩을 사용해서 하나의 타입으로 정의 , 배열이나 컬랙션에 저장해서 관리가능
		//왜냐 애니멀이라는 하나의 타입으로 설정해놓고 필요한 메소드만 쓰니
		//배열이나 컬렉션으로 묶어서 관리하기 아주좋음
		
		Animal aa1 = new Animal();
		Animal bb1 = new Bird();
		Animal cc1 = new Cat();
		Animal dd1 = new Dog();
		
		aa1.cry(); //여기 cry();는 타입을 Animal이기 때문에 부모의 메소드로 호출된다
		bb1.cry(); //bb1의 cry도 타입이 Animal 이니까 Animal의 메소드를 호출한다
		//근데 오버라이딩이되서 본인의 쨱쨱이 부모꺼를 덮어써 Bird의 메소드가 출력된거다
		cc1.cry(); //동일 타입Animal이니 부모꺼가 나와야하는데 오버라이딩으로 덮어써서
		//본인의 메소드가 나오게된거임
		dd1.cry();
		
		
		//하나의 타입인데 오버라이딩을 통해 메소드를 각각호출할수있어 좋고
		//같은 타입이니까 배열이나 컬렉션에 저장이가능 아주 쉽게 관리가능
		
		//배열의 특징을알아보자 1. 동일한 타입을 저장 2.방의 크기가 선언되면 바꿀수 없음
		//타입[] 배열변수
		int[] arr1 = new int[5]; //0~4
		int[] arr2 = new int[] {1,2,3,4}; //선언가 동시 값넣기도가능
		
		
		System.out.println("객체를 배열에저장================");
		//객체를 배열에 저장
		Animal[] arr3 = new Animal[] {aa1,bb1,cc1,dd1};
		//객체를 Animal 이라는 타입 [] 배열공간에 저장한거임
		
		//출력해보자 for문을사용해서
		 for(int i =0; i<arr3.length; i++) {
			 arr3[i].cry(); //arr3[]의 i번째요소 그니까 모든요소들의 cry메소들을 돌면서호출해라
			 //Animal 타입을 호출하지만 오버라이딩되서 그각각의 녀석들이 덮어써서 잘나오는
		 }
		 
		 //향샹된 for문으로도 출력가능
		 for(Animal k : arr3) {
			 k.cry();
		 }
	}

}
