package chapter02.EX09;

public class TypeCasting_2 {
	public static void main(String[] args) {
		//#1. 같은 자로형 간의 연산
		int value1 = 3 + 5;
		int value2 = 8/5; // int에서 나누기 하면 소숫점 자리날라가고 1만나옴
		//나누기할때 int 로 하지 말아라!!!
		double value2_1 = 8/5; //더블로 해도 1.0만 나옴 8,5가 정수여서
		double value2_2 = 8.0/5; // 이렇게 앞에 더블형인 8.0을 넣어줘야 정확한값
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0/5.0;
		
		//byte, shot 를 연산을 하게되면 정수형인 int로 처리해야한다
		byte data1 =3;
		byte data2 =5;
		
		//byte value5 = data1 + data2;  이러면 오류가 발생함 왜??
		//연산시 정수형인 int 로 처리해줘야함
		int value5 =data1 + data2; // int로 선언해줘야 오류안남 ~
		
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value2_1);
		System.out.println(value2_2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		
		System.out.println("====================================");
		
		//다른 자료형 간의 연산 (작은 자료형이 큰 자료형이로  자동으로 업캐스팅된어 연산됨)
		
		//int value6 = 5+3.5 ; // 오류발생 //상위 더블이 인트로 다운캐스팅 되야함
		//뒤에수가 앞에수로 캐스팅한다 기준잡으면 될듯 !
		int value6 = (int)(5+3.5); // 8나옴 계산시 int로 전체가 다운캐스팀 됌
		System.out.println(value6);
		
		double value7 = 5 + 3.5 ; //이건 오류안남 5가 상위에있는 더블로 자동업캐스팅되니까
		System.out.println(value7); //값은 더블형으로나옴
		int value7_1 = 5+(int)3.5; 
		System.out.println(value7_1);//값은 인트형으로나옴
		
		double value8 =5/2.0;
		byte data33= 3;
		short data44 =5;
		int value9 = data33 + data44; //바이트는 꼭 선언을 int로 처리해야함
		double value10 = data33 + data44; //아니면 더블로도 선언가능
		
		System.out.println(value8);
		System.out.println(value9);
		System.out.println(value10);
		
		
		}

}
