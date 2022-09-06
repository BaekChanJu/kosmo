package chapter02.EX06;

public class PrimaryDataType_1 {

	public static void main(String[] args) {
		//b<s<i<l<f<d 순으로 크다 
		
		//업캐스팅 : 자동적용된다, 작은 데이터 타입에서 큰 데이터 타입으로의 변환	
		//다운캐스팅 : 수동으로 적용해야함, 큰 데타에서 작은 데타로
		
		//자바에서 = 왼쪽과 오른쪽은 반드시 데이터 타입이 같아야 한다**
			//byte,shot 는 예외로 적용됨
		int a = 10;
		float b = 10.11F;
		
		float c = a+b; //여기서 c는 플롯인데 a가 인트타입이다 
		//그래서 a는 자기보다 큰타입인 c의 float으로 자동으로 업캐스팅 된다!
		System.out.println(c);
		
		//int d = a+b; //반대로 a는 int, b는 float 이거는 b를 int로 다운캐스팅을 해야함
		int d= a + (int)b; //이렇게 수동으로 다운캐스팅 해준다
		System.out.println(d); //20이 나옴 소숫점 날라감
		
		
		
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		//정수 : byte, short, int, long
		// 기본값은 int 이다 / 지금 숫자값은 사실 모두인트 라는 뜻이다
		
		byte value1 =10; 
		short value2 = -10;
		int value3 = 100;
		long value4 = -100;//롱에 넣으니까 L  
		// int 값이 Long 데이터 타입으로 업캐스팅
	}

}
