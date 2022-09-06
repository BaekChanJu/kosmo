package chapter04;

public class if_01 {
	package chapter04;

	public class If_01 {

		public static void main(String[] args) {
			/*
			 제어문 : 프로그램의 순서를 바꾸는 구문
			 	- 선택 제어문 : if, switch 
			 	- 반복 제어문 : for, while, do-while
			 	
			 	if : 조건을 만족하는 실행문을 실행 후 if 문을 빠져나온다 / 스위치문은 브레이크로 나가야함
			 if
			 	-if(조건){실행1}; //조건이 참일때 실행1을 실행 
			 	
			 	-if(조건){
			 			실행문1; : 조건이 참일때
			 	  }else{ 
			 	        실행문2; : 조건이 거짓일때
			 	  }
			 	
			 	조건이 여러개 일때 
			 	-if(조건1){  //조건 1이 참일때
			 	     실행문1;
			 	 }else if(조건2){ //조건 2가 참일때
			 	     실행문2;
			 	 }else{  // 그외 만족안할때 실행문 3
			 	   실행문3;
			 	 }
			 */
			
			//if(조건){ 실행문1 }
			
			if(3>5) {
				System.out.println("안녕");
				System.out.println("방가");
			} // false 라 아무것도 출력이 안됌 
			
			System.out.println("=====================");
			
			if(3<5) {
				System.out.println("안녕");
				System.out.println("방가");
			} //true 라서 출력됌
			
			
			//if 조건에서 실행문이 1개 일떄는 중괄호 생략할 수 있다!
				 //권장사항 : 중괄호 명시후 사용~
			if(5>3)
				System.out.println("오늘은 비가온다"); 
			
			System.out.println("=====================");
			
			
			
			/* 2. if(조건){
			  		실행문1; //참일때 실행문 1실행
			  }else{
			  		 실행문2; //거짓일때 실행문2 실행
			  }
			  */ 
			
			if(5>3) { //조건은 반드시 true, false 가 나와야한다 / a =3 이런건 안됌 
			} else {
				System.out.println("실행2 거짓");
			}
			
			//변수 선언 : 동일한 변수를 여러개 선언시 , 로 구분한다
			//		- 기본자료형(8가지) : 초기값을 할당을 해줘야한다 안하면 오류
			// boolean ,byte, short, int, long, double, char
			//		- 참조자료형(String같은) : 무한대로 만들기 가능
			//          (초기값을 할당안하면 컴파일러가 자동으로 넣어줌)
			
			int a,b; //변수 선언만 한 경우 / ,로 구분해주기
			//System.out.println(a); //변수의 값을 넣지 않고 출력
			a = 5 ; 
			b = 0; //변수에 초기값 할당
			
			if(a >5) {
				b=10;
			}else {
				b=20;
			}
			System.out.println(b);
			//false 이기에 20이 나옴
			
			//if(조건) ~ else 구문을 3함 연산자로 변환
			System.out.println("========삼항연산자 출력=========");
			
			System.out.println((a>5)? 10:20); //이러면 20이 출력되지 
			
			/* 3. 조건이 여러개인 경우 : if(조건)~ else if (조건)~else 구문
			 *  :해당 조건을 만족하는 실행문을 실행해준후 if 문을 탈출
			   */
			
			System.out.println("========else if=========");
			
			int c;
			c = 85;
			
			if(c>=90) {
				System.out.println("A학점 입니다.");
			}else if(c >=80) {
				System.out.println("B학점 입니다."); //B학점부분 달성해서 여기출력 하고 빠져나옴
				//왜냐면 b에서 이미 실행하고 if는 빠져나간다
			}else if(c >=70) {
				System.out.println("C학점 입니다.");
			}else if(c >=60) {
				System.out.println("D학점 입니다.");
			}else {
				System.out.println(" 미달 입니다.");
			}
			
		
			}

	}




}