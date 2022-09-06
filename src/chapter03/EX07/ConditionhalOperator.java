package chapter03.EX07;

public class ConditionhalOperator {

	public static void main(String[] args) {
		//3항 연산자 <== 자주사용
		// (조건) ? 이 참 : 거짓 ;
		//	조건이 참이면 '참'을 실행, 조건이 거짓이면 '거짓'을 실행
		//		: 깃발
		
		int value1 = (3>5)? 6:9; //이건 false 이므로 뒤에 9 거짓이 할당이 된다
		//반대로 참이었으면 6이 할당이 된다
		System.out.println(value1);
		//이걸 if문으로풀면? (아래)
		
		if(3>5) {
			System.out.println(6);
		}else {
			System.out.println(9);
		}
		
		int value2 = (5>3)? 10:20;
		System.out.println(value2);
		
		
		if(5>3) {
			System.out.println(10);
		}else {
			System.out.println(20);
		}
		
		int value3 = 3;
		System.out.println((value3 %2 == 0)? "짝수" : "홀수");
		//나머지 값 1이니 홀수  0이랑 다름 그래서 거짓이고 홀수나옴
		
		if(value3 %2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}

		
		//5의 배수만 인지 삼항 연산자를 통해서 확인
		int value4 = 10;
		System.out.println((value4 %5 == 0)? "5의 배수이다" : "5의 배수가 아니다");
		
		//나이가 20 이상이면 성인이다. 성인이아니다.
		
		int value5 = 20;
		System.out.println((value5 >= 20)? "성인입니다" : "성인이아닙니다");
		
		//3항 연산자는 if 문으로 변환가능 
		//	if, else, else-if 
		/*
		 * 
		 if(조건){
		 	실행문1; > 조건이 참이면 실행문1 실행
		 	}else{
		 	실행문2; > 조건이 거짓일때 실행문2 실행
		 	
		  */
		System.out.println("============================");
		
		
		if( value3 %2==0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다");
		}
		
		
		
	}
} 
