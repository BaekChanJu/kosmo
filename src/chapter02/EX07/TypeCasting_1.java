package chapter02.EX07;

public class TypeCasting_1 {

	public static void main(String[] args) {
		//1.캐스팅 방법
		// - 캐스팅 방법 1 (데이터 타입을 명시)
		int value1 =5.3; //오류 //더블형이라 들어갈 수 없음 자동으로 변환 안됨 (다운캐스팅해줘야함)
		//(int)5.3
		long value2 = 10; //오류안남 // 인트가 롱형으로 들어가니 자동 업캐스팅됨
		float value3 = 5.8;//오류 // 더블인데 플롯으로 들어가니 다운캐스팅 해줘야함
		//(float)5.8
		double value4 = 16;//오류안남 // 인트가 더블로 들어가니 자동 업캐스팅됨
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		// - 캐스팅 방법 2 (L,F 붙히기)
		// 정수는 리터럴 (변수에 들어가는 값) 이 기본이 int, 실수는 double
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}

}
