package chapter06.EX01;

public class Student {
	
	//필드 : 클래스 블락에 선언된 변수 : 힙영역에 저장됨 : 강제 초기화가됨
	int kor; //국어 점수
	int eng; //영어 점수
	int math; //수학점수
	String name; //학생이름
	
	//생성자
	Student () {} //기본 생성자, 생략가능 / 아무것도없음
	Student (int kor, int eng, int math, String name){ //지역변수 : kor eng math name
		this.kor = kor; 	//this 는 자신의 필드의 값을 뜻함
		this.eng = eng;
		this.math = math;
		this.name = name;
	}
	
	//메소드 : 합과 평균을 계산해서 출력 해주는 메소드
	void call() {
		int sum;
		sum = kor + eng + math;
		double avg;
		avg =sum/3.0;
		System.out.println(name + "의 총 점수 : " + sum + 
				" 평균은 : " + avg +"입니다." );
		
		//객체는 스튜던트 테스트 메인메소드 에서 만들어줄꺼다 
	}
	

}
