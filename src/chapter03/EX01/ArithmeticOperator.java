package chapter03.EX01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		//연산자
		//1. 산술 연산지(+,-,*,/,%)
		System.out.println(2+3);
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(7/2); //몫만 출력
		System.out.println(7.0/2.0); // 나눈 값을 제대로 표현해줌(더블값으로)
		System.out.println(8%5); //나머지 값만 출력
		
		//2. 증감 연산자 : case1
			//++ : 1씩 증가 / -- : 1씩 감소
		int value1 =3;
		value1++; //변수 뒤에 ++ 하면 1씩증가
		//++value1 변수앞에도 가능 단독으로 쓸때는 둘다 1씩증가됨 위치에 상관없이
		System.out.println(value1);
		
		System.out.println("==================================");
		
		//2. 증감 연산자 : case2
		int value3 = 3;
		int value4 = value3++; //++이 뒤에온경우 3이 나옴 왜? 증가인데?
		//value3 값이   value4여기에 대입되어 버려서 값이 그냥3으로 나와버림 단독일때랑 다름
		
		System.out.println(value3);
		System.out.println(value4);
		System.out.println("==================================");
		
		int value5 = 3;
		int value6 = ++value5; //그래서 이렇게 대입시켜서 할떄 뒤에 ++ 하면  증가가 안되니까
		//앞에 ++ 을 붙혀서 증가시켜야 한다
		
		System.out.println(value5);
		System.out.println(value6);
		
		//2. 증감 연산자 : case3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8; // 2+ 뒤에--니까 그냥3 ++앞이니까 5 
		//그래서 총 10
		
		System.out.println(value7); // 2
		System.out.println(value8); // 5
		System.out.println(value9); // 10
		
		
		
		
		
	}

}
