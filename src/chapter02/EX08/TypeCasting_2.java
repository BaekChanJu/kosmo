package chapter02.EX08;

public class TypeCasting_2 {
	public static void main(String[] args) {
		//1. 자동타입 변환 (업캐스팅)
		float value1 = 3; //int3이 float 타입으로 자동 업캐스팅됨
		long value2 = 5; // int5가 long 타입으로 자동 업캐스팅됨
		double value3 = 7; //int7이 double 타입으로 자동 업캐스팅됨
		
		byte value4 = 9; // 예외로 int > byte로 다운캐스팅인데 그냥 가능 (최대값 기준)
		short value = 11; // 예외로 int > short로 다운캐스팅인데 그냥 가능 (최대값 기준)
		
		//2. 수동타입 변환 (다운캐스팅)
		byte value6 = (byte)128; //최대값 기준 넘어버려서 다운캐스팅 해줘야함 -128 나옴
		int value7 =(int)3.5; //더블을 인트로 다운해줘야함 3나옴
		float value8 =(float)7.5; //더블을 플롯으로 다운  7.5 나옴
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}

}
