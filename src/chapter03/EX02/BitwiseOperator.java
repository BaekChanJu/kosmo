package chapter03.EX02;

public class BitwiseOperator {

	public static void main(String[] args) {
		//bit 연산
		//자바 메서드를 사용해서 진법변환(2진수,8진수,16진수)
		int data =13;
		
		//Integer 객체의 함수를 사용
			//-Integer.toBinaryString();는 10진수 > 2진수로 출력해주는 함수
		System.out.println(Integer.toBinaryString(data)); //정수를 2진수로
		System.out.println(Integer.toOctalString(data)); //정수를 8진수로
		System.out.println(Integer.toHexString(data)); //정수를 16진수로
		System.out.println("============================");
		
		//2진수, 8진수, 16진수 의 값을 10진수로 변환
			//-Integer.parseInt(); 정수로 변환해주는 파스인트
		System.out.println(Integer.parseInt("1101",2)); //2진수를 10진수로(정수로)
		System.out.println(Integer.parseInt("15",8)); //8진수를 10진수로
		System.out.println(Integer.parseInt("d",16)); //16진수를 10진수로 
		System.out.println("============================");
		
		//다양한 진법 표현
		System.out.println(13); //정수
		System.out.println(0b1101); //0b 2진수
		System.out.println(015); //0 8진수
		System.out.println(0xd); // 0x 16진수
		System.out.println("============================");
		
		//비트연산자 And : & (2진수들을 곱해서 계산한다라 생각)
		System.out.println(3&10); //2진법으로 바꿔주고 계산하면 2가나옴
		System.out.println(0b0011 & 0b1010); //2진법으로 3과10이다 계산하면 2나온다
		System.out.println(0x03 & 0x0A); //16진수 3과10이다 계산하면 2
		System.out.println("============================");
		
		//비트연산자 Or | : 비트가 하나만 1이여도 1이나온다
		System.out.println(3 | 10);
		System.out.println(0b0011 | 0b1010); //2진법
		System.out.println("============================");
		
		//비트연산자 XOR ^ : 두비트가 동일할때 0 다를 떄1 반환
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println("============================");
		
		//비트연산자 NOT : ~ 0일떄1 1일떄0
		System.out.println(~3); // -4나옴
		System.out.println(~0b0011);
		
		System.out.println(~100); // -붙히고 1증가되어 -101 나옴
		System.out.println(~-50); //이건 - 니까 49나옴
		
		
		

	}

}
