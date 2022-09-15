package chapter10.EX02;

class Animal{
	String name = "동물";
}

class Person extends Animal{ // 펄슨은 애니멀의 모든내용을 상속받음
	String personName = "사람";
}

class Person_person extends Person{
	String pName = "사람_사람";
}



public class Using_Polymorphism01_2 {

	public static void main(String[] args) {
		//1. Animal 객체 생성
			//Animal 객체는 Animal 타입만 내포
		Animal a1 = new Animal();
		System.out.println(a1.name);
		
		//2.Person 객체 생성
			//a2는 Animal과 person 타입을 내포하고있음 상속받았으니
			//하지만 지금은 Animal타입으로 지정해서 Animal만 사용이 가능함
			//다운캐스팅으로 전부쓰게 만들수는 있음
		
		Animal a2 = new Person();
		System.out.println(a2.name); //애니멀에 있는 name만 가능한것이다
		
			//a2를 Person 타입으로 다운캐스팅 해보자 그럼 애니멀,펄슨 두안에 모두사용가능
		Person p1 =(Person) a2;
		System.out.println(p1.name);
		System.out.println(p1.personName);
		
		
		//3.Person 객체를 Person타입으로 바로만들면 사실 다운캐스팅할필요없이
			//바로 애니멀 , 펄슨 둘다 사용가능
		
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.personName);
		
			//그럼 애니멀과펄슨2개 가지고있는 p2를 업캐스팅해보자 (업캐는  자동)
		Animal a3 = p2; //() 생략가능 업캐스팅은 생략이랬다!! 
		System.out.println(a3.name); //부모로 업캐스팅 했으니 애니멀만 사용가능
			//그럼 또다시 펄슨으로 다운캐스팅을 해보자
		Person p3 =(Person) a3; //이러면 상속받은 애니멀을 가지고있는 펄슨으로 다캐됨
		System.out.println(p3.name);
		System.out.println(p3.personName); //이렇게 둘다가능
		
		
		//4.Person_person 객체를 Animal 타입으로생성
			//a4는 애니멀,펄슨,펄슨펄슨 타입 모두 내포하고있지만  지금은 애니멀 타입으로지정
		Animal a4 = new Person_person();
		System.out.println(a4.name); //지금은 애니멀만 가능
		
		//다운캐스팅해보장 Person_person 으로
		Person_person pp1 =(Person_person) a4;
		System.out.println(pp1.name); //Person_person이 됬으니 모두사용가능
		System.out.println(pp1.personName);
		System.out.println(pp1.pName);
		
		//5. Person_person 을 애초에 Person_person 타입으로 생성
			//그럼 pp2는 애니멀,펄슨,펄슨펄슨을 다 가지고있고 펄슨펄슨타입으로지정
		Person_person pp2 = new Person_person(); //애초에 이러면 캐스팅필요x
		System.out.println(pp2.name); //Person_person이 됬으니 모두사용가능
		System.out.println(pp2.personName);
		System.out.println(pp2.pName);
		
		//6.그럼  Person_person 객체를 이번엔 Person 타입으로 생성해볼까
			//그럼 p10은 타입이 펄슨이니까 펄슨이랑애니멀2개를 가지고있음
		Person p10 = new Person_person();
		System.out.println(p10.name);
		System.out.println(p10.personName);
		//타입을 Person 으로했으니 Person에 내포되있는것만 사용가능
		
		
		

	}

}
