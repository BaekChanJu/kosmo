package chapter02.EX11;

public class Char_Type {

	public static void main(String[] args) {
		//char 데이터 타입 : 하나의 문자만 저장
		//	-문자, 숫자, 유니코드로 저장 할 수 있다
		//	- '' 을 사용해서 저장
		//	- 2문자 이상은 문자열 스트링 으로
		
		//유니코드(2바이트) : 전 세계의 모든 문자를 16진수로 표기
		
		//1. 문자로 저장하는 방법
		char value1 ='A';
		char value2 ='가';
		char value3 ='3'; // 숫자 3이 아닌 문자
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		System.out.println("=========================================");
		
		//2. 정수로 저장하는 방법
		char value4 = 65; //대문자 A가 65를 의미한다 /    A<==65
		char value5 = 0xac00; // 0x 는 16진수를 의미, 가를 의미한다
		char value6 = 51; // 3 을 의미
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		
		System.out.println("=========================================");
		
		//3. 유니코드 형식으로 저장(\\ud유니코드) , ''을 사용
		char value7 = '\u0041';
		char value8 = '\uac00';
		
		char value100 = 35; //# 이 35임
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value100);
		
		//구글 검색을 사용해서 자신의 이름을 유니코드로 출력
		
		char baek = '\uBC31';
		char chan = '\uCC2C';
		char ju = '\uC8FC';
	
		
		System.out.println(baek);
		System.out.println(chan);
		System.out.println(ju);
		
		System.out.println("=========================================");
		
		
		//문자A를 저장하는 다양한 방법
		char a='A';
		char b =65; //10진수로 저장됨
		char c = 0b1000001; //2진수로 65 //0b는 2진수를 뜻하고 그뒤에 값이 2진수이다!
		char d = 00101; //8진수로 65 //앞00는 8진수를 의미 그 뒤에 값이 8진수이다
		char e = 0x0041; // 16진수로 65 //앞0x 는 16진수를 의미
		char f = '\u0041'; //유니코드로 값 할당
		
		//모두 A이다 다양한 표현 방법이 있는것이다

		System.out.println(a); 
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		}

}
