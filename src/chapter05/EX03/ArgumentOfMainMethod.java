package chapter05.EX03;

public class ArgumentOfMainMethod {

	public static void main(String[] args) {
		
		//main Method 의 입력 매개변수 전달하기, 메소드 = 함수를 의미
		//	-메소드(함수)의 형식 : 리턴타입 메소드명 (입력매개변수){ 실행부 }
		//	 	void main ( String[] args){ 실행부 } - 메인메소드 형식이다
		
		
		//메인 메소드의 입력 매개변수 args[i] 값을 받아서 각 변수에 할당
		
		//안녕하세요 3 5.8    <==String[] args
		
		String a = args[0];  //안녕하세요    args[0];
		String b = args[1];  //3         args[1];
		String c = args[2];  //5.8       args[2];
		
		
		//출력 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//실행보기에서 런컨피그래이션에서 아그먼트 들어가서 공백기준으로 입려갛면
		//인덱스 번호 대로 입력이 된다
		
		System.out.println("=====형변환 전 값==========");
		//연산
		System.out.println(b+1); 
		// 3(String) + 1(int) = 연결되서나옴 31(String)
		System.out.println(c+1);
		// 5.8(String) + 1(int) = 동일하게 5.81(String)
		
		//숫자형식으로 되어있는 String => 정수나 더블로형으로 변환해줘야한다!
			//Integer.parseInt(String변수)
			//Double.parseOuble(String변수)
		
		
		
		System.out.println("======형변환 완료된 값=======================");
		//연산 (형을 변환후 연산)
		int d =Integer.parseInt(b); //문자형인 3을 정수형3으로 바꿔준다
		double e =Double.parseDouble(c); //문자형인 5.8을 실수형5.8으로 바꿔준다
		
		System.out.println(d); //정수로 바뀐3이 나온다
		System.out.println(e); //실수로 바뀐 5.8이 나온다
		System.out.println("==========형변환후 연산=================");
		
		System.out.println(d+1); //정수3 + 정수1
		System.out.println(e+1); //실수5.8 + 정수1 (작은정수가 업케스팅됨)

	}

}
