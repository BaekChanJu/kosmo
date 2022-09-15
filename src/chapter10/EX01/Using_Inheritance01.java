package chapter10.EX01;

//클래스 내부 구성요소 :1.필드 2.생성자 3.메소드 4.이너클래스(클래스내부의 클래스)
//클래스 외부 구성요소 :1.패키지 2.import 3.외부클래스


//상속(Inheritance) : 객체 지향언어의 꽃 : 코드를 간결하게 사용할 수 있음
	//중복코드를 방지할수있음
	//유지보수가 쉬움
	//부모클래스 의 필드와 메소드, 이너클래스 를 자식클래스에서 물려받는다 (생성자빼고)
	//Super Class > Child Class로 상속
	//다형성 사용 : 부모클래스의 메소드를 자식클래스에서 재정의해서 사용가능
		//--다양한 타입으로 사용이 가능






//부모클래스(Super class) : 자식클래스의 공통적인 특징을 가지는 클래스
class Human{ //전인류를 뜻함 : 자식필드에 들어갈 공통적 부분을 선언해주자
	//필드
	String name;
	int age;
	
	//메소드
	void eat() {
		System.out.println("모든 사람은 먹는다");
	}
	
	void sleep() {
		System.out.println("모든 사람은 잠을 잔다");
	}
	
	void Humanprint() {
		System.out.println(name + " , " + age);
	}
	
}


//자식클래스들(Child Class) : 부모의 필드와 메소드를 그대로 상속받음 
	//공통내용을 일일이 선언할 필요없음 / 자식클래스만의 특징만 선언해주면됨
class Student extends Human{ //학생  ( 학생은 휴면을 상속받는다)
	
	//부모클래스의 필드와 메소드가 그대로 내려온다
	//자식 클래스만의 특징을 가진 필드와 메소드 등등만 설정해주면된다
	
	int studentID; //자식클래스에서 선언된 필드
	
	void  goToSchool() { //자식클래스에서 선언된 메소드
		System.out.println("학생이 학교에 갑니다");
	}
	
}


class Worker extends Human{ //직장인
	//부모클래스의 필드와 메소드가 그대로 내려온다
	
	int workerID;
	
	void goToWork() {
		System.out.println("직장인이 회사에 갑니다");
	}
	
}

class Professor extends Human{ //교수
	//부모클래스의 필드와 메소드가 그대로 내려온다
	
	int professorID;
	
	void goToCollage() {
		System.out.println("교수님은 대학에 갑니다");
	}
	
}





public class Using_Inheritance01 {

	public static void main(String[] args) {

		//1.Human 클래스 객체 생성 (부모)
		System.out.println("=======Human class==========");
		
		Human h = new Human();
		
		h.name = "홍길동";
		h.age = 30;
	
		h.eat();
		h.sleep();
		h.Humanprint();
		
		
		
		
		//2.Student 클래스 객체 생성 (자식)
		System.out.println("=======Student class==========");
		
		Student s = new Student();
		
		s.name = "세종대왕"; // 부모에서 상속된 name 필드 (보모것)
		s.age = 50; // 부모에서 상속된 age 필드 (보모것)
		s.studentID =1000; // Student클래스에 존재하는필드 (본인것)
		
		
		s.eat(); //부모의 메소드
		s.sleep(); //부모의 메소드
		s.Humanprint(); //부모의 메소드
		s.goToSchool(); //본인것
		
		
		//3.Worker 클래스 객체 생성 (자식)
		System.out.println("=======Worker class==========");
		
		Worker w = new Worker();
		
		w.name = "신사임당";
		w.age = 40;
		w.workerID = 1001;
		
		w.eat();
		w.sleep();
		w.Humanprint();
		w.goToWork();
		
		
		//4.Professor 클래스 객체 생성 (자식)
		System.out.println("=======Professor class==========");
		
		Professor p = new Professor();
		
		p.name = "이순신";
		p.age = 45;
		p.professorID = 1002;
		
		p.eat();
		p.sleep();
		p.Humanprint();
		p.goToCollage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
