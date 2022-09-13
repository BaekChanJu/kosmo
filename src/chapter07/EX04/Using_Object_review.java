package chapter07.EX04;

class Person{
	//class : 객체를 생성하기 위한 틀 (붕어빵 기계, 설계도)
	//object : 객체를 의미 붕어빵
	
	//1. 필드 : 클래스 블락에서 선언된 변수  / 지역변수는 메소드 블락에서 선연된 변수
				//힙에 저장(자동초기값) 	 //스택에 저장(자동초기값없음)
	
	String name; //이름   / 널
	int age;//나이   /0
	float height; //키(실수)     /0.0
	float weight; //몸무게(실수)     /0.0
	
	
	//2.생성자 (Constructor) : 리턴타입이 없다(앞에보이드등등), 클래스이름과 동일해야함,
		//생성자 오버로딩 : 생성자 이름은 동일 하지만 식별자로 구분(매개변수 타입과 갯수)
	Person () { //기본생성자 : 인풋매개변수가 없는 생성자, 생략가능
		
	}
	
	Person(String s){ //this 키워드 없이 필드에 값 할당
		name = s;
	}
	
	Person (String name, float height){
		this.name = name;
		this.height = height;
	}
	
	Person (String name, float height,float weight,int age){
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	
	//3.메소드(함수) : 기능을 실행하는 코드가 저장 / 호출시 작동됨
	
	void show() {
		System.out.println(name + " , " + height + " , " + weight +
				" , " + age );
	}
	
	
	
	//4.getter, setter <== g/필드의 내용을 출력, s/필드의 내용을 입력
			//우클릭 소스에 제너레이터 겟엔셋

	public String getName() { //getter로 만들어진거임 필드의 있는값을 리턴
		return name;
	}

	public void setName(String name) { //setter
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	
	
	
}

public class Using_Object_review {

	public static void main(String[] args) {
		//객체생성은 main 메소드안에서 진행
		
		
		//1.기본 생성자 호출한거임
		Person person = new Person();
		
			//필드 내용 출력(1.객체 명으로 출력)
		System.out.println(person.name);
		System.out.println(person.height);
		System.out.println(person.age);
			//getter를 사용해서 필드출력은?
		System.out.println(person.getName());
		
		
			//show() : 메소드호출
		person.show();

		
		//2. 매개변수가 1개인 생성자 호출
			
		Person Lee = new Person("이순신장군");
		System.out.println(Lee.name);
		System.out.println(Lee.weight);
		Lee.show();
		
		//3.매개변수가 4개인 
		Person Hong = new Person("홀길동",185.5F,70.0F,30);
		System.out.println(Hong.name);
		System.out.println(Hong.height);
		System.out.println(Hong.weight);
		System.out.println(Hong.age);
		Hong.show();
		
		
		//setter을 사용해서 필드의 값 할당 / getter을 사용해서 필드의 값 출력
		Person jung = new Person();
		jung.setName("정도령");
		jung.setHeight(180.5F);
		//getter로 이제 출력하자
		System.out.println(jung.getName());
		
	}

}
