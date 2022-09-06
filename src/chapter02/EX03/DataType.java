package chapter02.EX03;

public class DataType {

	public static void main(String[] args) {
		/* 자바의 자료형 
		 -기본자료형 8가지 : 첫자가 소문자
		 	-boolean : 참이나 거짓만
		 	-byte :정수 1바이트
		 	-short :정수 2바이트
		 	-int :정수 4바이트 32비트 99퍼 인트사용
		 	-long :정수 8바이트 > 값을 할당할때 1234L 인트와 구별하려고 64비트
		 	-float :실수 4바이트 > 값을 할당할때 123.45F 더블과 구별하려고
		 	-double : 실수 8바이트
		 	-char : 문자 (문자열이아니라 한글자 문자) ''
		 	
		 -참조자료형 무한대 : 첫자가 대문자 (String 은 참조자료형)
		 	-String : 문자열 ""
		 	배열(Array), 클래스/인터페이스
		 */
		
		boolean aaa;  //참과 거짓을 사용하는 블린
		aaa = true;
		System.out.println(aaa);
		
		byte bbb; //정수값 할당가능 (1바이트기에 8비트)
		bbb=100;
		System.out.println(bbb);
		
		byte bb;
		bb = (byte)128; //바이트 범위를 넘겨서 입력오류 / 앞에 바이트 써주면 <캐스팅>으로
		//오류가 발생하지 않는다 -128 출력됨 
		System.out.println("bb의 출력값" + bb);
		 
		byte cc;
		cc=(byte)129;
		System.out.println("cc의 출력값 :" + cc); //-127이 뜬다
		//+ 는 127까지고 (직접넣으면 오류발생), 127 이상으로 넘어가면 - 가 붙어서 출력된다
		
		short ccc; //정수값 할당 -32,768 ~ +32,767 까지 가능용량 2바이트 16비트
		ccc = -32768;
		System.out.println(ccc);
		
		short cccc;
		cccc= (short)32768; //동일하게 범위 넘어가서 캐스팅해주고 출력하면 -32768 뜬다
		System.out.println("cccc의 출력값 :" + cccc);
		
	
		
	}

}