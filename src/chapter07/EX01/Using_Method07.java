package chapter07.EX01;

public class Using_Method07 {
	
	//메소드 이름은 동일한데 매개변수 타입이 다르거나 매개변수 갯수가 다르면 그걸로 인식되어 실행된다
		//메소드 오버로딩 이라고 한다 아래에서 더블 2개가 들어오면 3번 인트2개가 들어오면 4번이 작용된다
		// 시그니처가 다르면 다른메소드로 인식한다고 표현된다
	
	static void print() {
		System.out.println("입력된 데이터가 없습니다- 매겨변수 없음" );
	}
	
	static void print(int a) {
		System.out.println(a + "값이 입력되었습니다-매개변수 정수1개");
	}
	
	//  static void print(int c) {
		// 지금은 타입과 매개변수가 같아서 오류발생 총3개가 같아야함
	// 메소드명 매개변수의 타입 매개변수 갯수
	//}
	
	static void print (double a, double b) {
		System.out.println(a + " , " + b + " : 값이 입력되었습니다-매개변수 실수2개");
	}
	
	static void print(int a, int b) {
		System.out.println(a + " , " + b + " : 값이 입력되었습니다-매겨변수 정수2개");
	}
	
	static void print(int a, double b) {
		System.out.println(a + " , " + b + " : 값이 입력되었습니다-매개변수 정수1실수1");
	}
	
	//static int print(int a, double b) {
		//System.out.println(a + " , " + b + " : 값이 입력되었습니다-매개변수 정수1실수1");
	//} // 리턴타입이 int 니까 되겠지? 하지만안된다 리턴타입은 시그니처가 아니다

	public static void main(String[] args) {
		//메소드 오버로딩
			// : 동일한 메소드 이름에 대해서 시그니처가 다른 경우 다른 메소드로 인식한다
				//시그니처 : 메소드명, 입력매개변수 타입, 입력매개변수 갯수
		
		//void 와 int 같이 입력매개변수 타입은 즉 리턴타입은 시그니처가 아니다!
		
		
		//메소드 오버라이딩 : 상속
			//부모 클래서에서 정의된 메소드를 자식 클래스에서 재정의 해서 사용하는 것
		
		
		
		
		//매개변수 없는 메소드 호출 : print()
		System.out.println("==============");
		print();
		//매개변수 : print(정수);
		print(10);
		//매개변수 : print(실수,실수);
		print(20.0,20.01);
		//매개변수 : print(정수,정수);
		print(10,30);
		//매개변수 : print(정수,실수);
		print(10,15.4);
		

	}

}
