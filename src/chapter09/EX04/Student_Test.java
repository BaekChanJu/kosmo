package chapter09.EX04;

class Student{
	
	static int serialNum = 1000; //스태틱으로 바꿔줌
	int studentID; //학생 공유 ID (학번)
	String studentName; //학생 이름
	int grade; // 학년 : 기본값을 4학년으로
	String address; //주소 : 서울
	
	
	
	//먼저 기본 생성자를 만들자  serialNum을 모든객체에서 공유해야하기때문에
		//static int serialNum 로 설정을 바꿔줘야한다
		//모든 객체에서 공통적으로 사용할것이니까!
	Student(){
		serialNum++; //객체생성시 마다 1씩 증가시킨다
		studentID = serialNum; //증가시킨 값을 studentID에 넣어준다
		grade = 4;
		address = "서울";
		}
	//이렇게 기본값들 정의 하는 생성자를 쭉만들어놓고 이름을 받을 생성자를 하나더 만든다
	Student(String studentName){
		this(); // 바로 위 상위 생성자 호출하는 역활
		this.studentName = studentName;
	}
	
	void print() {
		System.out.println("학번 : " +studentID );
		System.out.println("이름 : " +studentName );
		System.out.println("학년 : " +grade );
		System.out.println("주소 : " +address );
		
	}
}

public class Student_Test {

	public static void main(String[] args) {
		//객체 생성시 자동으로학번이 1000부터 1씩 자동으로 학번이 저장되어야 한다
		
		// studentID : 100부터 학생객체를 생성할때 마다
		//고유한 값으로 적용 되어 있어야한다
		
		Student lee = new Student("이지원"); //1001번
		lee.print();
		
		Student Hong = new Student("홍지원"); //1002
		Hong.print();
		
		Student jung = new Student("정지원"); //1003
		jung.print();
		
		Student park = new Student("박지원"); //1004
		park.print();
		
		

	}

}
