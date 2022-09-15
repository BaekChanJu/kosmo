package chapter09.EX04;

class Student02{
	
	//아래 필드의 접근제어자가 모두 default로 할당 되어있음
		//외부 클래스에서 객체를 생성후 직접 수정이가능
	static int serialNum = 1000; //스태틱으로 바꿔줌
	int studentID; //학생 공유 ID (학번)
	String studentName; //학생 이름
	int grade; // 학년 : 기본값을 4학년으로
	String address; //주소 : 서울
}

class Student03{
	//필드의 접근제어자는 보안을 위해서 private으로 사용하는 경우가 많다(외부에서 값수정못하게하려구)
	//필드의 값을 직접적으로 수정이 불가능하다 프라이빗은
	// private으로 선언하면 수정은 setter을 이용해서만 수정이 가능하다
	
	private static int serialNum = 1000; //스태틱으로 바꿔줌
	private int studentID; //학생 공유 ID (학번)
	private String studentName; //학생 이름
	private int grade; // 학년 : 1~4학년만 // 
	private String address; //주소 : 서울
	private int month; //1~12만 와야한다  
	
	//필드의 접근제어자를  private 로 설정하면 이 클래스파일 안에서만 사용가능하고
	//외부 클래서에서는 접근이 불가능하다!
		//생성자(생성자도 메소드임)나 메소드(setter)를 사용해서 필드의 내용을 수정할 수 있다
		//원하는 값을 제어해서 입력할수 있다는 장점
	
	//보안을 위해 직접 수정하지 못하게 하기위해서 메소드나 생성자로 제어해서 수정하게 하기위함
	
	
	//원하는 값을 컨트롤할수있음 외부에서 막 수정불가  s.serialNum = 2000; 이런것처럼
	Student03(){
		serialNum++;
		studentID = serialNum;
		 grade =4;
		 address = "서울";
		 month = 12;
	}
	Student03(String studentName){
		this();
		this.studentName = studentName;
	}
	
	public void print() {
		System.out.println("학번 : " +studentID );
		System.out.println("이름 : " +studentName );
		System.out.println("학년 : " +grade );
		System.out.println("주소 : " +address );
		System.out.println("월 : " + month );
	}
	
	//셋 넣고 필드명 이름 매개변수로 그값을 받아서 메모리에저장하고 수정제어하는 시스템
	public void setGrade(int grade) { //setter : grade 필드의 값을 할당하는 세터임
		if(grade>=1 && grade<=4) {//학년 기준점 잡아주기
			this.grade = grade;
		} else {
			System.out.println("잘못된 입력입니다 1~4까지만 선택하세용");
			return;
		}
		
	}
	
	//위와 동일함
	public void setMonth(int month) {
		if(month>=1 && month<=12) {
			this.month = month;
		}else {
			System.out.println("잘못된 입력입니다 1~12까지만 입력하세용");
			return;
		}
	}
	
	
	
}

public class Student_Test02 {

	public static void main(String[] args) {
		//객체생성
		Student02 s= new Student02();
		
		//default 접근제어자 이기때문에 같은 패키지 안에서 필드의 값을 직접수정가능
		s.serialNum = 2000;
		s.studentID = 100;
		s.studentName = "홍길동";
		
		
		//프라이빗 객체생성
		Student03 s3 = new Student03("찬주");
//		s3. 하면 뭐가 나와야하는데 암것도 안나옴
		
//		s3.serialNum = 2000; //private이기때문에 지금 Student_Test02  클래스에서
        //Student03 클래스로 접근한거기 때문에 접근이 불가 같은 클래스필드에서만 가능
		
//		s3.studentID = 100;		//오류
//		s3.studentName = "홍길동"; //오류
		
		//게터셋터를 이용해서 수정이 가능하다

		//예시로 그래이드랑 먼스를 만약 디폴트로 위에 선언했다면??
//		s3.grade =100;
//		s3.month=200; //예제가 1~12 까지만인데
		//이렇게 디폴트 값은 넣는값을 제어할 방법이 없으니 보안에 문제가 생기는 것이다
		//그래서 프라이빗으로 설정후 생성자나 함수로 제어해서 해줘야한다 
		
		
		s3.setGrade(3); //셋게터 매개변수에 수 입력하고
		s3.setMonth(8);
		s3.print(); //출력구문 메소드로 호출
		
		
		
	}

}
