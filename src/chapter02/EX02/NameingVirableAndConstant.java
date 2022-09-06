package chapter02.EX02;

public class NameingVirableAndConstant {

	public static void main(String[] args) {
		/* 변수(값을 변경할 수 있는)의 이름부여
		  -첫자는 소문자를 사용해야한다
		  -특수문자 : _ , $ 는 가능하지만 그외에는 안된다
		  -첫자에 숫자는 올 수 없음
		  -자바에서 설정해 놓은 예약어는 사용할 수 없다
		  */
		
		boolean aBcD; //aBcD 변수에 true, false 만 확인해주는 블리언값 
		aBcD = true;
		System.out.println(aBcD);
		
		aBcD = false;
		System.out.println(aBcD);
		
		//byte 가나다; //변수 한글로 선언가능하나 쓰지는 않는다
		//short _abcd; // 옆처럼 특수문자는 언더바 달러만 가능하다 
		//char $ag_cd; //달러가능하다
		//double main; //**메소드 이름을변수 이름으로 사용 가능하다 (사용방법이다르니가능)
		//float int; // 예약어 변수명으로 사용불가
		
		//String myClassName; //첫단어는 소문자 여러단어 합치기가능 그단어 들어갈땐 대문자
		
		
		
		/* 상수(값을변경할 수 없는)의 이름 부여
		 - 대문자로 처리해야한다
		  */
		
	final double PI; // 파이널이 붙어있으니 지금은 상수상태 값 변경 불가 상수는 대문자로
	PI = 3.141592;
	 System.out.println(PI);
	 
	 //pi = 1234.00;
	 System.out.println(PI);
	 
	 //변수는 값 수정이 가능하니 처음엔 3.14 마지막은 1234 가 나오는 것이다 !
	 //하지만 이것처럼 final double 앞에 상수를 넣어주면 상수는 변하지 않는 값이기에
	 // 아래PI 1234는 오류가 발생한다 !
	 
	 //int myDate; //변수지만 파이널을 붙히면!
	//final int MY_DATA; // 상수가된다 대문자로 (상수일땐 언더바를 붙히는 규칙)
	}

}
