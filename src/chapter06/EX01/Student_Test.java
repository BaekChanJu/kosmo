package chapter06.EX01;

public class Student_Test {

	public static void main(String[] args) {
		//객체 생성은 반드시 main 메소드에서 생성해야한다
		
		
		//생성자는 객체를 생성시 필드의 초기값을 할당할때 사용
		
		Student Lee = new Student (80,99,70,"Lee"); 
		//지금 생성자를 호출하기 위해 매개변수 넣어준거임
		Lee.call(); // Lee의 총 점수 : 249 평균은 : 83.0입니다. 잘나옴 아까 만든 메소드
		
		
		Student Hong = new Student (88,99,77,"Hong");
		Hong.call();
		
		Student Baek = new Student (95,98,83,"Baek");
		Baek.call();

		
		//Syudent 는 같은 패키지 안에있으니 딱히 이창에 임포트 없이 사용이 가능한것이다
		
		
		
		Student Kim = new Student ();
		Kim.call(); // null , 0 이 나옴
	}

}
